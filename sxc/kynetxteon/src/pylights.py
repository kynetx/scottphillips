# pyLights Python module v0.4

#Copyright 2009, 2010 Bryon Bridges

# This program is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.

# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.

# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.

import serial
import socket, select
from time import sleep, time
import threading, Queue
from xml.dom.minidom import parse,Document


device_cfg_filename = './devices.xml'
#device_cfg_filename = None	# Do not use a device file.
	
'''
pyLights is a Python module for sending Insteon messages via PLM.  It has high
level functions to easily command dimmers, keypads, switches and other devices.
pyLights also acts as an Insteon daemon, updating a device file according to
status messages received after each button press.  This is useful for fast disk
access to up-to-date level information but has many other potential uses.
There is also a built-in TCP server for commanding the PLM remotely.

To reference devices by name rather than address set the 
'device_cfg_filename' above to point to an XML configuration file that 
contains names and addresses that match your devices.  An example configuration
file ('devices.xml') was included in the download package.

Example usage:

	import pylights

	# Create a PLM object that controls lights.
	p = pylights.plm(5)	# Opens COM5
	# p = pylights.plm('COM5') # Alternate usage
	# p = pylights.plm() # Scans for PLM automatically
	# p = pylights.plm(5,'verbose') # Prints Insteon hex messages to screen.

	# Specify either name or shortName from the XML file and the desired level
	#	in percent.
	p.setLevel('Living Room', 50)
	
	# Alternatively, give the address in hex list format.
	lvl = p.getLevel([0x12,0x5F,0x5E])
	
	# ...or use dotted hex.
	p.fadeOut('12.5F.5E')
	
	# Close the PLM object to release the serial port.
	p.close()
	
Visit http://byronet.info for the latest information regarding the pyLights project.
'''

class deviceFile:
	'''
	Handles XML device file access.  This is normally instantiated by a PLM 
	object.
	'''
	def __init__(self, filename):
		try:
			if filename is not None:
				try:
					file = open(filename)
				except IOError:
					raise Exception('Cannot find device (XML) file: %s.' % filename)
				else:
					self.doc = parse(file)
					file.close()
					self.filename = filename
					self.dev = self.doc.getElementsByTagName('Device')
					self.numDevices = self.dev.length
			else:
				self.filename = None
				self.numDevices = 0
		except:
			raise
			#self.filename = None
			
	
	def findDevAddress(self, devName):
		'''
		Returns the device address and index given the device name, short name,
		or address string if found in the device file, otherwise None.
		'''
		addrList = None
		devIndex = None
		if self.filename is not None:
			for devIndex in range(self.numDevices):
				dimDev = self.dev.item(devIndex)
				# Get device name
				nameEl = dimDev.getElementsByTagName('name')
				nameData = nameEl.item(0)
				nameStr = nameData.firstChild.data.upper()
				# Get device short name
				shortNameEl = dimDev.getElementsByTagName('shortName')
				shortNameData = shortNameEl.item(0)
				try:
					shortName = shortNameData.firstChild.data.upper()
				except AttributeError:
					# shortName probably doesn't (and needn't) exist
					shortName = 'dummy'
				if ((shortName == devName.upper()) or (nameStr == devName.upper())):
					# Get device address
					addrEl = dimDev.getElementsByTagName('address')
					addrData = addrEl.item(0)
					addrStr = addrData.firstChild.data
					addrList = [int(addrStr[0:2],16),int(addrStr[3:5],16),int(addrStr[6:8],16)]
					break
			if addrList is None: devIndex = None
		return addrList, devIndex


	def findResponders(self, address, button):
		'''
		Scans the device file for responders to an address/button combination.
		Returns the address(es) if found, empty list otherwise.
		'''
		if type(address) is not list: return 'Address type must be list'
		respList = []
		if self.filename is not None:
			for devIndex in range(self.numDevices):
				dimDev = self.dev.item(devIndex)
				# Get device name
				respEl = dimDev.getElementsByTagName('respondsToBtn')
				try:
					for items in respEl:
						respStr = items.firstChild.data.upper()
						addr_btn = respStr.split(':')
						addr = [int(k,16) for k in addr_btn[0].split('.')]
						btn = int(addr_btn[1])
						if addr == address:
							if btn == button:						
								respList.append(self.getAddressByIndex(devIndex))
				except AttributeError:
					pass
		# Devices always respond to their own button 1
		if button == 1:	respList.append(address)
		return respList


	def getAddressByIndex(self, index):
		'''
		Returns the device address given an index into the device list.
		'''
		if 0 <= index < self.numDevices:
			dimDev = self.dev.item(index)
			addrEl = dimDev.getElementsByTagName('address')
			addrData = addrEl.item(0)
			addrStr = addrData.firstChild.data
			addrList = [int(addrStr[0:2],16),int(addrStr[3:5],16),int(addrStr[6:8],16)]
			return addrList
		else:
			return None


	def getIndexByAddress(self, address):
		'''
		Returns an index into the device list given an address.
		'''
		if type(address) is list:
			if self.filename is not None:
				for devIndex, device in enumerate(self.doc.getElementsByTagName('address')):
					addrStr = device.firstChild.data
					addrList = [int(addrStr[0:2],16),int(addrStr[3:5],16),int(addrStr[6:8],16)]
					if addrList == address:
						return devIndex
			return None
		else:
			return "Address type must be list"


	def getNameByIndex(self, index):
		'''
		Returns the name of the device with the specified index.
		'''
		if 0 <= index < self.numDevices:
			dimDev = self.dev.item(index)
			nameEl = dimDev.getElementsByTagName('name')
			nameData = nameEl.item(0)
			nameStr = nameData.firstChild.data
			return str(nameStr)
		else: return None


	def getShortNameByIndex(self, index):
		'''
		Returns the short name of the device with the specified index.
		'''
		nameStr = None
		if 0 <= index < self.numDevices:
			dimDev = self.dev.item(index)
			nameEl = dimDev.getElementsByTagName('shortName')
			nameData = nameEl.item(0)
			try:
				nameStr = nameData.firstChild.data
			except AttributeError: pass
		return nameStr


	def getLevelByIndex(self, index):
		'''
		Returns the light level of the device with the specified index.
		'''
		if 0 <= index < self.numDevices:
			dimDev = self.dev.item(index)
			nameEl = dimDev.getElementsByTagName('level')
			levelData = nameEl.item(0)
			levelStr = levelData.firstChild.data
			return int(levelStr)
		else:
			return None	

			
	def updateLevel(self, index, level):
		'''
		Updates the level in the device file using either index or address.
		Levels are always given as direct levels and not percent.
		'''
		if (type(index) is int) and (type(level) is int):
			dimDev = self.dev.item(index)
			levelEl = dimDev.getElementsByTagName('level')
			levelData = levelEl.item(0)
			levelData.firstChild.data = level
			self.updateXML()	
			
		
	def updateXML(self):
		file = open(self.filename,'w')
		self.doc.writexml(file)
		file.close()

class commandsFile:
	'''
	Handles XML device file access.  This is normally instantiated by a PLM 
	object.
	'''
	def __init__(self, filename):
		try:
			if filename is not None:
				try:
					file = open(filename)
				except IOError:
					raise Exception('Cannot find device (XML) file: %s.' % filename)
				else:
					self.doc = parse(file)
					file.close()
					self.filename = filename
					self.dev = self.doc.getElementsByTagName('Commands')
					self.numCommands = self.dev.length
			else:
				self.filename = None
				self.numCommands = 0
		except:
			raise
			#self.filename = None
			
	
	def getCommandFromHex(self, hex_code):
		'''
		Returns the device address given an index into the device list.
		'''
		commandEls = self.doc.getElementsByTagName('Command')
		for commandIndex, command in enumerate(commandEls):
			hexnum = command.getElementsByTagName('hex').item(0).firstChild.data
			if hexnum == hex(hex_code):
				return command.getElementsByTagName('name').item(0).firstChild.data

			
		return None
	
	def getCommandNumFromHex(self, hex_code):
		'''
		Returns the device address given an index into the device list.
		'''
		commandEls = self.doc.getElementsByTagName('Command')
		for commandIndex, command in enumerate(commandEls):
			hexnum = command.getElementsByTagName('hex').item(0).firstChild.data
			if hexnum == hex(hex_code):
				return command.getElementsByTagName('number').item(0).firstChild.data

			
		return None

class plm:
	'''
	Insteon PLM controller object.
	'''
	
	# --- Insteon definitions ---
	
	commands = {
		'ping' :			0x10,
		'ON' :				0x11,
		'fastOn' :			0x12,
		'OFF' :				0x13,
		'fastOff' :			0x14,
		'brightStep' :		0x15,
		'dimStep' :			0x16,
		'startChange' :		0x17,
		'stopChange' :		0x18,
		'statusRequest' :	0x19,
		'setHiAddr' : 		0x28,
		'pokeEE' :			0x29,
		'peekEE' :			0x2B}
		
	messages = {
		'insteonRecv' :		0x50,
		'x10Recv' :			0x52,
		'plmInfo' :			0x60,
		'insteonSend' :		0x62,
		'sendX10' :			0x63,
		'plmReset' :		0x67,
		'getFirstLink' :	0x69,
		'getNextLink' :		0x6A,
		'startMonitorMode': 0x6B,
		'getSenderLink' :	0x6C,
		'LED_on' :			0x6D,
		'LED_off' :			0x6E }

	devTypes = {'Dimmer' : 1, 'Switch' : 2, 'PLM' : 3}

	devSubtypes = {
		'LampLinc' :		0,
		'SwitchLinc 600W' :	1,
		'SwitchLinc' :		21, 
		'KeypadLinc' :		27 }
	
	# --- X10 codes ---
	
	x10_houseCode = {
		'A' : 0x6,
		'B' : 0xE,
		'C' : 0x2,
		'D' : 0xA,
		'E' : 0x1,
		'F' : 0x9,
		'G' : 0x5,
		'H' : 0xD,
		'I' : 0x7,
		'J' : 0xF,
		'K' : 0x3,
		'L' : 0xB,
		'M' : 0x0,
		'N' : 0x8,
		'O' : 0x4,
		'P' : 0xC }

	x10_unitCode = {
		1 : 0x6,
		2 : 0xE,
		3 : 0x2,
		4 : 0xA,
		5 : 0x1,
		6 : 0x9,
		7 : 0x5,
		8 : 0xD,
		9 : 0x7,
		10 : 0xF,
		11 : 0x3,
		12 : 0xB,
		13 : 0x0,
		14 : 0x8,
		15 : 0x4,
		16 : 0xC }
	
	x10_command = {
		'all lights off' :	0x6,
		'status = off' :	0xE,
		'on' :				0x2,
		'preset dim' :		0xA,
		'all lights on' :	0x1,
		'hail ack' :		0x9,
		'bright' :			0x5,
		'status = on' :		0xD,
		'extended code' :	0x7,
		'status request' :	0xF,
		'off' :				0x3,
		'preset dim' :		0xB,
		'all units off' :	0x0,
		'hail request' :	0x8,
		'dim' :				0x4,
		'extended data' :	0xC }

	x10_key = {'unit code' : 0x00, 'command' : 0x80}

	
	def __init__(self, comPort=None, verbose=False):

		self.devices = deviceFile(device_cfg_filename)
		
		self.send_q = Queue.Queue()
		self.recv_q = Queue.Queue()
		self.async_q = Queue.Queue()

		self.async_thread = AsyncEventThread(self)
		self.server = ServerThread(self)
		
		self.verbose = verbose
		
		# Serial port
		try:
			if comPort is None:
				# Use the first available PLM
				ports = self.scanSerialPorts()
				for k in ports:
					print('Trying %s...' % k[1])
					self.s = serial.Serial(k[0],19200,8,'N',1,timeout=1)
					self.serial_rx = SerialRxThread(self)
					self.address = self.getPlmInfo()[0:3]
					if self.address is not None:
						print('PLM found at %s!' % k[1])
						break
					else:
						self.s.close()
				if not self.s.isOpen():
					raise Exception('Could not find a valid serial port')
			else:
				if type(comPort) is int:
					port = comPort - 1
				elif type(comPort) is str:
					port = comPort
				else:
					raise Exception('User-specified serial port was neither a string nor an integer.')
				self.s = serial.Serial(port,19200,8,'N',1,timeout=1)
				self.serial_rx = SerialRxThread(self)
				self.address = self.getPlmInfo()[0:3]
		except serial.SerialException:
			raise
		except NameError:
			self.s = None
			raise

	def addEventListener(self, method):
		'''
		adds a method to the list of methods called on inbound message
		'''
		self.async_thread.addListener(method)
# --- Low-level/internal methods ---
			
	def close(self):
		'''
		Use close to release the serial port and socket interface.
		'''
		try:
			self.s.close()
			self.server.shutdown()
			#self.plm_obj.conn.close()
			#self.plm_obj.sock.close()
		except:
			pass


	def scanSerialPorts(self):
		'''
		Returns a list of available serial ports
		'''
		available = []
		for i in range(256):
			try:
				s = serial.Serial(i)
				available.append( (i, s.portstr))
				s.close()
			except serial.SerialException:
				pass
		return available

		
	def getPlmInfo(self):
		'''
		Returns the PLM address if found.
		'''
		message = [0x02, self.messages['plmInfo']]
		msg = self.send_msg(message,9,True)
		if msg[-1] == 0x06:	return msg[2:8]
		else: return None

	def startMonitorMode(self):
		'''
		Sets the PLM to Monitor Mode.
		'''
		message = [0x02, self.messages['startMonitorMode'], 0x40]
		msg = self.send_msg(message,6,True)
		if msg[-1] == 0x06:	return msg[2:5]
		else: return None
		
		
	def list_to_hex(self, list_in):
		'''
		Convert a list of integers into nice looking hex.
		Will also accept a list of lists.
		'''
		out = list_in
		if type(list_in) is list:
			list_len = len(list_in)
			if list_len > 0:
				if type(list_in[0]) is int:
					# List is one dimensional.
					list_in = [list_in]
				out = ''
				for list_row in list_in:
					for list_col in list_row:
						out += '%02X ' % list_col
					out = out.strip() + '\r\n'
				out = out[:-2]
		return out


	def updateLevel(self, device, level):
		'''
		PLM method for updating the XML file given either a device index or address.
		'''
		if self.devices.filename is not None:
			if type(device) is not int:
				address = self.address_to_list(device)
				device = self.devices.getIndexByAddress(address)
			self.devices.updateLevel(device,level)

			
	def sendX10(self, house_code, unit_code, cmd):
		'''
		Send an X10 command.
		Example:
			p.sendX10('A',1,'on')			
		
		NB: X10 does not get propagated to the second phase with RF repeaters.
		'''
		try:
			message = ([0x02, self.messages['sendX10'], 16*self.x10_houseCode[house_code]+self.x10_unitCode[unit_code], self.x10_key['unit code']])
			if 0x6 == self.send_msg(message)[-1]:
				sleep(0.5)
				message = ([0x02, self.messages['sendX10'], 16*self.x10_houseCode[house_code]+self.x10_command[cmd.lower()], self.x10_key['command']])
				if 0x6 == self.send_msg(message)[-1]: return 'OK'
			return 'Error'
		except KeyError:
			return 'Incorrect parameters'


	def sendStdMessage(self,address,cmd1,cmd2=0x00,flags=0x0F):
		'''
		Sends a standard length Insteon message to PLM via the serial port.
		Returns a list that contains the response in base ten notation (not hex).
		
		Flags bits
		7:5
			100 = Broadcast Message
			000 = Direct Message
			001 = ACK of Direct Message
			101 = NAK of Direct Message
			110 = Group Broadcast Message
			010 = Group Cleanup Direct Message
			011 = ACK of Group Cleanup Direct Message
			111 = NAK of Group Cleanup Direct Message
		4
			1 = Extended message
			0 = Standard message
		3:2
			00 = 0 message retransmissions remaining
			01 = 1 message retransmission remaining
			10 = 2 message retransmissions remaining
			11 = 3 message retransmissions remaining
		1:0
			00 = Do not retransmit this message
			01 = Retransmit this message 1 time maximum
			10 = Retransmit this message 2 times maximum
			11 = Retransmit this message 3 times maximum
		'''
		# Set the number of bytes to expect as the response. 0 for group broadcast.
		if (flags & 0xC0):	respLen = 0	
		elif cmd1 == self.commands['ping']: respLen = 33
		else: respLen = 11
		address = self.address_to_list(address)
		if address is None: return "Invalid address"
		msg = ([0x02,self.messages['insteonSend']]+address+[flags]+[cmd1,cmd2])
		return (self.send_msg(msg,respLen))


	def send_msg(self, message, response_len=0, no_echo=False):
		'''
		This method is responsible for handling all outgoing serial messages.
		Returns the response if requested, otherwise just the N/ACK byte.
		Set 'no_echo' to True if the message response does not echo, e.g.,
		'getplmInfo()'.
		'''
		try:
			if not self.s.isOpen():
				self.s.open()
		except serial.SerialException:
			raise
			return "Could not open serial port"
		# Request echo message
		if no_echo: self.send_q.put(response_len)
		else: 
			self.send_q.put(len(message)+1)
			# Request response message
			if response_len > 0:
				self.send_q.put(response_len)
		self.s.write(bytearray(message))
		if self.verbose:
			print ('TX : %s' % self.list_to_hex(message))
		# Get echo response
		try:
			msg_q = self.recv_q.get(True,2)
			if self.verbose:
				print ('RX : %s' % self.list_to_hex(msg_q.msg))
		except Queue.Empty:
			return "Timeout waiting for echo"
		if no_echo: return msg_q.msg
		if msg_q.msg[0:len(message)] != message:
			print 'Got\t\t', msg_q.msg
			print 'Expected\t', message
			sleep(0.5)
			self.serial_rx.reset()
			return 'Invalid echo'
		if len(msg_q.msg) != (len(message)+1): 
			print msg_q.msg
			return 'Invalid message length'
		# Look for ACK/NACK
		if response_len == 0: return msg_q.msg
		if msg_q.msg[-1] != 6:
			self.serial_rx.reset()
			if msg_q.msg[-1] == 0x15: return 'NACK'
			return 'No ACK received!'
		# Look for response
		try:
			# Block on receive with 2 second timeout
			msg_q = self.recv_q.get(True,2)
			if self.verbose: print ('RX : %s' % self.list_to_hex(msg_q.msg))
		except Queue.Empty:
			return "Timeout waiting for response"
		except serial.SerialTimeoutException:
			return "Serial timeout"
			#raise
		except TypeError:
			return "Invalid response"
		except AttributeError:
			raise
			#return "Invalid serial port"
		else:
			return (msg_q.msg)


	def getPlmLinkTable(self):
		links = []
		message = [0x02,self.messages['getFirstLink']]
		link = self.send_msg(message,10)
		if type(link) is list:
			links.append(link[2:])
			done = False
			while not done:
				message = [0x02,self.messages['getNextLink']]
				link = self.send_msg(message,10)
				if type(link) is list:
					links.append(link[2:])
				else: done = True
		return links


	def address_to_list(self, address):
		'''
		Convert any supported type of address to list.
		Returns None upon failure.
		'''
		if type(address) is str:
			if address.find('.') != -1:
				# Address is in dotted hex notation
				try:
					address = [int(str(k),16) for k in address.split('.')]
					if len(address) != 3: address = None
					else:
						# Check for invalid values
						for value in address:
							if not (0 <= value <= 255):
								address = None
								break
				except ValueError:
					address = None
			else:
				# Named address
				address, index = self.devices.findDevAddress(address)
		return address


	def getDevType(self, address):
		'''
		Returns the device subtype and type as strings
		'''
		if address == self.address:
			info = self.getPlmInfo()
			devSubtype = info[4]
			devType = info[3]
		else:
			recv = self.sendStdMessage(address,self.commands['ping'])
			try:
				if type(recv) is not list: return recv
				devSubtype = recv[-5]
				devType = recv[-6]
			except:
				raise
		return devSubtype, devType		


	def readEEPROM(self, insteonAddr, addrL, numTries=1):
		'''
		Returns the value stored at the specified low address.
			The high address should be set with 'setMSB()'
		'''
		while numTries:
			recv = self.sendStdMessage(insteonAddr,self.commands['peekEE'],addrL,0x05)
			if type(recv) is list:
				return recv[-1]
			else: 
				numTries -= 1
				sleep(0.5)
				#print ('Trying again')
		return recv


	def writeEEPROM(self, insteonAddr, dataByte, numTries=1):
		'''
		Writes a byte to the location having high byte specified by 'setMSB' and 
			low byte by 'readEEPROM'
		'''
		while numTries:
			status = self.sendStdMessage(insteonAddr,self.commands['pokeEE'],dataByte,0x05)
			if type(status) is list:
				return "OK"
			else:
				numTries -= 1
				sleep(0.5)
		return status


	def setMSB(self, insteonAddr, addrH):
		'''
		Sets the most significant byte of the EEPROM poke/peek address
		'''
		status = self.sendStdMessage(insteonAddr,self.commands['setHiAddr'],addrH,0x05)
		if type(status) is list:
			return "OK"
		else:	
			return status
			
	
	def sendGroupCmd(self, groupNum,cmd):
		'''
		Sends commands to all devices in a particular group
		Make sure the device has a responder link to the PLM.
		'''
		status = self.sendStdMessage([0x00,0x00,groupNum],cmd,0x00,0xCF)
		if type(status) is list:
			return "OK"
		else:	
			return status
			
	
	def getLinkTable(self, addr, record=None):
		'''
		Searches EEPROM for link table information.
		Specify a starting record if desired
		'''
		status = self.setMSB(addr,0x0F)
		if status is not "OK":
			return status
		if record is None:
			LSB = 0xF8
		else:
			LSB = 0xF8-(8*record)	# Starting LSB			
		totalList = []
		entriesLeft = True
		while entriesLeft:
			byte = self.readEEPROM(addr,LSB,3)
			if byte == 0: entriesLeft = False
			elif type(byte) is str:
				print ('Received %s while getting link table' % byte)
				entriesLeft = False
			else:
				List = []
				List.append(byte)
				for k in range(7):
					LSB += 1
					byte = self.readEEPROM(addr,LSB,3)
					if type(byte) is str:
						print ('Received %s while getting link element' % byte)
						entriesLeft = False
					else:
						List.append(byte)
				print ('%02X : %s' % (LSB-7,self.list_to_hex(List)))
				if record != None: 
					entriesLeft = False
					totalList = List
				else: 
					totalList.append(List)
					LSB -= 0x0F				
		return totalList


	def getUnusedLinkAddr(self, addr):
		'''
		Searches the link table for the first free link LSB address 
			(a 0x00 in the first position)
		
		So far it will only search MSB = 0x0F
		'''
		status = self.setMSB(addr,0x0F)
		if status is not "OK":
			return status
		LSB = 0xF8	# Starting LSB
		done = False
		while not done:
			byte = self.readEEPROM(addr,LSB,3)
			if byte == 0: done = True
			elif type(byte) is str:
				return byte
			else: LSB -= 0x8
		return LSB


# --- High-level methods ---

	
	def setLevel(self, address, level=100, usePercent=True):
		'''
		Sets the level of the dimmer at the given address in percent brightness.
		To use direct levels (0-255), set the usePercent parameter to False.
		'''
		if usePercent:
			if (0 <= level <= 100):
				level = int(round(2.55*level))
			else: return 'Percent level must be 0-100'
		else:
			if not (0 <= level <= 255):
				return 'Direct level must be 0-255'
		status = self.sendStdMessage(address,self.commands['ON'],level)
		if status[-1]==level:
			self.updateLevel(address, level)
			status = "OK"
		return status


	def getLevel(self, address, usePercent=True):
		'''
		Returns the current brightness level in percent as read from the Insteon device.
		To get direct levels (0-255), set the usePercent parameter to False.
		'''
		status = self.sendStdMessage(address,self.commands['statusRequest'])
		if type(status) is list:
			if usePercent:
				status = int(round(status[-1]*0.39216)) # Multiplying by 100/255
			else: status = int(status[-1])
		return status


	def fadeOut(self, address):
		'''
		Slowly fades to 0 brightness.  Returns immediately.
		'''
		status = self.sendStdMessage(address,self.commands['startChange'],0x00)
		if type(status) is list:
			self.updateLevel(address, 0)
			return "OK"
		else: return status


	def fadeIn(self, address):
		'''
		Slowly fades to 100 percent brightness.  Returns immediately.
		'''
		status = self.sendStdMessage(address,self.commands['startChange'],0x01)
		if type(status) is list:
			self.updateLevel(address, 255)
			return "OK"
		else: return status


	def fadeStop(self, address):
		'''
		Stops a previously started fade operation.
		'''
		status = self.sendStdMessage(address,self.commands['stopChange'])
		if type(status) is list:
			self.updateLevel(index, self.getLevel(address,False))
			return "OK"
		else: return status


	def plmDemo(self, address):
		'''
		This will eventually be cool
		'''
		for k in range(0,101,10):
			if self.setLevel(address, k) == 'OK':			
				lvl = self.getLevel(address)
				if k != lvl:
					try:
						print 'Tried setting %d, got %d instead' % (k, lvl)
						print type(lvl)
						print self.getLevel(address)
					except:
						print k
						print lvl
					#sleep(2)
				else:
					print k
			else:
				print ('Failed to set level')
		return 'OK'


	def createLink(self, ctrl_addr, resp_addr,
					ctrl_button=None, resp_button=None):
		'''
		Creates a link between the controller and responder addresses given.
		
		Specify a button number (A=1,B=2...) if either one of the targets is a
		keypad.
		'''
		ctrl_addr = self.address_to_list(ctrl_addr)
		resp_addr = self.address_to_list(resp_addr)
		# Get device types
		ctrl_subtype, ctrl_type = self.getDevType(ctrl_addr)
		resp_subtype, resp_type = self.getDevType(resp_addr)
		try:
			if ctrl_subtype == self.devSubtypes['KeypadLinc']:
				#print ('Controller is keypad')
				ctrl_is_keypad = True
				if ctrl_button is None:
					raise Exception('Must specify a button number for keypad devices')
			else: 
				#print ('Controller is NOT keypad')
				ctrl_is_keypad = False
			if resp_subtype == self.devSubtypes['KeypadLinc']:
				#print ('Responder is keypad')
				resp_is_keypad = True
				if resp_button is None:
					raise Exception('Must specify a button number for keypad devices')
			else: 
				#print ('Responder is NOT keypad')
				resp_is_keypad = False
		except KeyError:
			print ctrl_subtype
			print resp_subtype
			raise Exception('Found unknown subtype.  Please add it to plm.devSubtypes{}')
		# Search link table of controller
		print ('Getting controller LSB...')
		freeLSB_ctrl = self.getUnusedLinkAddr(ctrl_addr)
		if type(freeLSB_ctrl) is int:
			# Search link table of responder
			print ("Getting responder LSB...")
			freeLSB_resp = self.getUnusedLinkAddr(resp_addr)
			if type(freeLSB_resp) is int:
									
				
				if ((ctrl_is_keypad == False) and (ctrl_button != None)) or \
						((resp_is_keypad == False) and (resp_button != None)):
					raise Exception('You have specified a button number for a non-Keypad device.  If this is not an oversight, check your device subtype and add it to the list of acceptable types or notify the author.')
				
				'''
				Apparent facts:
				[ctrl/resp, group, addr, addr, addr, level, ramp, button]

				Always match group numbers, controller to responder, when linking.
				If controller is keypad, the button number matches the group number.
				
				If dimmer, the button number is always 0x00.
				If the controller is a dimmer, group is 0x1.
				'''
				if ctrl_is_keypad: 
					ctrl_group = ctrl_button
				else:
					ctrl_group = 1
					ctrl_button = 0
				
				if resp_is_keypad:
					if ctrl_is_keypad:
						resp_group = resp_button # Probably wrong
					else:
						resp_group = 1
				else:
					if ctrl_is_keypad:
						resp_group = ctrl_button
					else:
						resp_group = 1
					resp_button = 0
				
				write_list = [0xE2,ctrl_group,resp_addr[0],resp_addr[1],resp_addr[2],0xFF,0x1C,ctrl_button]
				#print (self.link_to_hex(write_list))
				for k in range(8):
					#print ('Writing 0x%X to %s' % (write_list[k], hex(freeLSB_ctrl+k)))
					if type(self.readEEPROM(ctrl_addr,freeLSB_ctrl+k,3)) is not int: 
						return 'Error while reading controller'
					if self.writeEEPROM(ctrl_addr,write_list[k],3) != 'OK': 
						return 'Error while writing controller'
				write_list = [0xA2,resp_group,ctrl_addr[0],ctrl_addr[1],ctrl_addr[2],0xFF,0x1C,resp_button]
				#print (self.link_to_hex(write_list))
				for k in range(8):
					#print ('Writing 0x%X to %s' % (write_list[k], hex(freeLSB_resp+k)))
					if type(self.readEEPROM(resp_addr,freeLSB_resp+k,3)) is not int: 
						return 'Error while reading responder'
					if self.writeEEPROM(resp_addr,write_list[k],3) != 'OK': 
						return 'Error while writing responder'
			else:
				return freeLSB_resp
		else:
			return freeLSB_ctrl
		return 'OK'


	def deleteLinkRecord(self,address,record=-1):
		'''
		Clears an entry from the link pool.  First record is 0.  
		Default argument deletes the last record.
		'''
		#print ('Finding last record...')
		freeLSB = self.getUnusedLinkAddr(address)
		lastRecord = ((0xF8-freeLSB)/0x08)-1
		if (record == -1) or (record == lastRecord):
			if type(freeLSB) is int:
				freeLSB += 0x8
		else: 
			# Copy last entry to deleted position.
			LSB = 0xF8-(record*0x8)
			record = self.getLinkTable(address,lastRecord)
			if len(record)==8 and type(record) is list:
				#print ('Writing %s' % self.list_to_hex(record))
				for k in range(8):
					#print ('Writing 0x%X to %s' % (record[k], hex(LSB+k)))
					if type(self.readEEPROM(address,LSB+k,3)) is not int: 
						return 'Error'
					if self.writeEEPROM(address,record[k],3) != 'OK': 
						return 'Error'
				freeLSB += 0x08 #self.getUnusedLinkAddr(address)+0x08
			else: return 'Error reading link record'
		# Do clearing of entries
		status = 'OK'
		if self.setMSB(address,0x0F) == "OK":
			# Clear the first entry last to minimize the chance of confusing 
			#	'getUnusedLinkAddr()' following an error.
			#print ('Writing zeros...')
			for k in range(7,-1,-1):
				#print ('Writing 0x00 to %s' % hex(freeLSB+k))
				if type(self.readEEPROM(address,freeLSB+k,3)) is not int: 
					status = 'Error'
					break
				if self.writeEEPROM(address,0x00,3) != 'OK':
					status = 'Error'
					break
		return status	


	def addResponder(self, resp_addr, ctrl_addr, button):
		'''
		Adds a '<respondTo>ctrl_addr:button' tag to the responder element.
		This allows level updates to occur for devices controlled by keypad
		buttons.
		
		Addresses must be given in dotted hex notation, e.g., '12.5F.5E'.
		'''
		if self.devices.filename is None: return 'Not using a device file'
		# New element
		d = self.devices.doc.createElement('respondsToBtn')
		txt = self.devices.doc.createTextNode(ctrl_addr.upper()+':'+str(button))
		d.appendChild(txt)
		# Search for device index.
		devIndex = self.devices.getIndexByAddress(self.address_to_list(resp_addr))
		# Add new element (with formatting text)
		c = self.devices.dev[devIndex].childNodes
		c_txt = c.item(c.length-3)
		if c_txt.nodeType == 3:
			c.insert(c.length-1,d)
			c.insert(c.length-2,c_txt)
		else:
			print (c_txt.toxml())
			return 'Wrong node type.  Should be text'			
		#print(self.devices.doc.toxml())
		self.devices.updateXML()
		return 'OK'


class SerialPacket():
	'''
	A standard serial message structure.
	'''
	def __init__(self,msg,recv_len=0):
		self.msg = msg
		self.recv_len = recv_len

		
class SerialRxThread(threading.Thread):
	'''
	Receives all serial messages from the PLM.  This is done in a thread so it
	can	do blocking reads.
	'''	
	def __init__(self, plm_obj):
		threading.Thread.__init__(self)
		self.setDaemon(True)
		self.plm_obj = plm_obj
		self.done = False
		self.start()
		
	
	def shutdown(self):
		if self.done: return
		self.done = True
		#self.join()

		
	def reset(self):
		'''
		Resets the serial loop to its initial state.
		'''
		'''
		print ('Resetting...')
		print ('Partial data received: %s' % self.data)
		print ('Expected length: %d,  Actual length: %d' % (self.expected_len, len(self.data)))
		print ('%d items in send queue' % self.plm_obj.send_q.qsize())
		print ('%d items in recv queue' % self.plm_obj.recv_q.qsize())
		print ('%d items in async queue' % self.plm_obj.async_q.qsize())
		'''
		self.data = []
		self.first_timeout = True
		self.expected_len = 11
		self.first_timeout = True
		self.plm_obj.send_q.queue.clear()
		self.plm_obj.recv_q.queue.clear()
		self.plm_obj.async_q.queue.clear()

	
	def run (self):
		'''
		Main serial thread.
		'''
		self.data = []
		self.first_timeout = True
		self.expected_len = 11
		self.waiting_for_first_byte = True
		self.async_event = False
		
		extra_bytes_flag = False
		extra_bytes = []
		
		while not self.done:
			# Check serial receive buffer for new data
			try:
				recv_byte = self.plm_obj.s.read(1)
				if recv_byte:
					#print(ord(recv_byte))
					self.data.append(ord(recv_byte))
					if self.waiting_for_first_byte:
						if self.data[0] != 0x02:
							extra_bytes_flag = True
							extra_bytes.append(ord(recv_byte))
							data = []
						else:
							self.waiting_for_first_byte = False
							if extra_bytes_flag:
								extra_bytes_flag = False
								#print ('Extra byte(s): %s' % extra_bytes)
								extra_bytes = []
							if not self.plm_obj.send_q.empty():
								# Receive a known number of bytes (before timeout)
								self.expected_len = self.plm_obj.send_q.get() #.recv_len
							else:
								# Got asynchronous update
								self.async_event = True
								self.expected_len = 11
					if len(self.data) >= self.expected_len:
						# Done receiving
						data_cpy = self.data
						self.data = []
						self.waiting_for_first_byte = True						
						if self.async_event:
							self.async_event = False
							self.plm_obj.async_q.put(SerialPacket(data_cpy))
						else:
							self.plm_obj.recv_q.put(SerialPacket(data_cpy))
				else:
					# Check for pending asynchronous events here...
					if not self.plm_obj.send_q.empty():
						'''
						Allow two timeout periods to fire to handle the case 
							where a command is issued near the end of the timeout 
							period causing it to be too short.  Actual timeout 
							period is variable from s.timeout (min) to 
							2*s.timeout (max)
						'''
						if self.first_timeout:
							self.first_timeout = False
						else:
							#print ('Message not received before timeout')
							# Remove queue object due to serial timeout
							self.reset()
				#if not self.waiting_for_first_byte:
					# Entire message must come within one second or else it is
					#	discarded.
					#self.reset()
					
			except (serial.SerialException, ValueError):
				self.done = True
			except:
				# Serial error
				raise				
				self.done = True


class AsyncEventThread(threading.Thread):
	'''
	Handles asynchronous messages from Insteon devices.
	'''	
	def __init__(self, plm_obj):
		threading.Thread.__init__(self)
		self.setDaemon(True)
		self.plm_obj = plm_obj
		self.last_cmd = [0x00, 0x00]
		self.last_addr = None
		self.time_came = 0
		self.last_to = None
		self.listeners = []
		self.start()
		
	def addListener(self, method):
		self.listeners.append(method)
	
	def run (self):		
		while True:
			msg_q = self.plm_obj.async_q.get()
			self.parse_async_event(msg_q.msg)
			#now call any subscribed methods
			if not self.dup:
				for l in self.listeners:
					l(msg_q.msg, self.last_addr, self.last_cmd)


	def parse_async_event(self, data):
		'''
		The intent here is to update the device file for asynchronous events.
		'''
		from_addr = data[2:5]
		to_addr = data[5:8]
		btn = data[7]
		flags = data[8]
		cmd1 = data[9]
		cmd2 = data[10]
		time_came = time()

		#'''
		if self.plm_obj.verbose:
			print
			print('Received async info from %02X.%02X.%02X' 
				% (data[2], data[3], data[4]))
			print('  Intended for %02X.%02X.%02X' 
				% (data[5], data[6], data[7]))
			print('  Message flags: 0x%02X' % flags)
			print('  Cmd1: 0x%02X' % cmd1)
			print('  Cmd2: 0x%02X' % cmd2)
			print

			print ('RX_ASYNC : %s' % self.plm_obj.list_to_hex(data))
		
		if self.last_cmd[0] == cmd1 and self.last_addr == from_addr and ((time_came - self.time_came) < 1):
			# Do not process redundant group messages
			#print ('Redundant info')
			self.dup = True
			return		
		else:
			self.dup = False

		self.last_addr = from_addr
		self.last_to_addr = to_addr
		self.last_cmd[0] = data[9]
		self.last_cmd[1] = data[10]
		self.time_came = time_came
		
		sleep(0.3)

		# Check for group cleanup messages
		BROADCAST = 0x80
		GROUP_CLEANUP = 0x40
		GROUP_BROADCAST = 0xC0
		DIRECT = 0x00
	
		flags_upper = flags & 0xF0
		
		if flags_upper == GROUP_BROADCAST:
			# GROUP_BROADCAST messages occur for devices that are part of a 
			#	group.
			for dev in self.plm_obj.devices.findResponders(from_addr, btn):
				if cmd1 == self.plm_obj.commands['ON']:
					self.plm_obj.updateLevel(dev,255)
				elif cmd1 == self.plm_obj.commands['OFF']:
					self.plm_obj.updateLevel(dev,0)
				elif cmd1 == self.plm_obj.commands['stopChange']:
					self.plm_obj.updateLevel(dev,self.plm_obj.getLevel(dev,False))
		elif flags_upper == GROUP_CLEANUP:
			if cmd1 == self.plm_obj.commands['stopChange']:
				self.process_update(from_addr)
				'''
				# Find named devices that match the intended target address
				for k in range(self.plm_obj.devices.numDevices):
					if self.plm_obj.devices.getAddressByIndex(k)==data[2:5]:
						name_str = self.plm_obj.devices.getNameByIndex(k)
						if name_str is not None:
							new_lvl = self.plm_obj.getLevel(name_str,False)
							self.plm_obj.devices.updateLevel(k, new_lvl)
				'''
			elif cmd1 == self.plm_obj.commands['ON'] or cmd1 == self.plm_obj.commands['fastOn']:
				self.process_update(from_addr, 255)
				'''
				# Find named devices that match the intended target address
				for k in range(self.plm_obj.devices.numDevices):
					if self.plm_obj.devices.getAddressByIndex(k)==data[2:5]:
						name_str = self.plm_obj.devices.getNameByIndex(k)
						if name_str is not None:
							self.plm_obj.devices.updateLevel(k, 255)
				'''
			elif cmd1 == self.plm_obj.commands['OFF'] or cmd1 == self.plm_obj.commands['fastOff']:
				self.process_update(from_addr, 0)
			#else:
				#print data[9]
		return

		
	def process_update(self, address, level=None):
		devIndex = self.plm_obj.devices.getIndexByAddress(address)
		if devIndex is not None:
			devName = self.plm_obj.devices.getNameByIndex(devIndex)
			if level is None:
				level = self.plm_obj.getLevel(name_str,False)
			self.plm_obj.devices.updateLevel(devIndex, level)



class ServerThread(threading.Thread):
	'''
	Waits for a client to connect and issue commands.
	
	The client should send string commands without a PLM object.
	For example:
	
		import socket
		HOST = 'localhost'
		PORT = 52006
		s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		s.connect((HOST,PORT))
		s.send("setLevel('room',50)")	
		s.close()		
	'''
	
	def __init__(self, plm_obj, PORT=52006):
		threading.Thread.__init__(self)
		self.setDaemon(True)
		self.done = False
		self.plm_obj = plm_obj
		self.plm_obj.sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		self.plm_obj.sock.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1) 
		self.plm_obj.sock.bind(('', PORT))
		self.plm_obj.sock.listen(1)
		self.start()
		

	def shutdown(self):
		if self.done: return
		self.done = True
		self.join()
		
	
	def run (self):		
		safe_list = ['self','self.plm_obj']
		safe_dict = dict([ (k, locals().get(k, None)) for k in safe_list ])
		safe_dict['True'] = True;
		safe_dict['False'] = False;

		while not self.done:
			rr,rw,err = select.select([self.plm_obj.sock],[],[], 1)
			if rr:
				self.plm_obj.conn, addr = self.plm_obj.sock.accept()
				#print 'Connected by', addr
				while 1:
					try:
						data = self.plm_obj.conn.recv(1024)
					except socket.error:
						break # Socket was probably closed by client
					if not data: break
					elif data == "q":
						self.done = True
						break
					else:		
						try:
							'''
							Execute the received string as if it were a 
							command, then send back the response as a string.
							Commands are limited to those in the safe list.
							'''
							#print data
							cmd_resp = eval('self.plm_obj.' + data, {"__builtins__":None}, safe_dict)
							#print cmd_resp
							self.plm_obj.conn.send(str(cmd_resp))
						except (AttributeError, NameError, SyntaxError):
							msg = 'Invalid TCP client command: %s' % data
							self.plm_obj.conn.send(msg)
							print(msg)							
							#raise
				self.plm_obj.conn.close()
		self.plm_obj.sock.close()
		#del self.plm_obj.sock
