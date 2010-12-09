#!/usr/bin/python
'''
Created on Oct 4, 2010

@author: sam
'''
import pylights, time, kynetx
from pprint import pprint

p = pylights.plm("/dev/tty.serial") #,"verbose")
d = pylights.deviceFile("./devices.xml")
c = pylights.commandsFile("./commands.xml")

app = kynetx.kynetx("a41x138")

def showmessage(info, from_addr, command):
	print
	index = d.getIndexByAddress(from_addr)
	from_name = d.getNameByIndex(index)
	print "got message from: " + from_name
	print "command hex: " + hex(command[0])
	command_name = c.getCommandFromHex(command[0])
	event_num = c.getCommandNumFromHex(command[0])
	print "with command: " + command_name + " and event number: " + event_num

	directive = app.raise_event("insteon",command_name, {"from":from_name, "number":event_num})
	for directive in app.directives:
		run_directive(directive)

p.addEventListener(showmessage);

def run_directive(directive_to_run):
	action = directive_to_run['action']
	if action == "fadein":
		address = directive_to_run['options']['address']
		p.fadeIn(address.encode('latin-1'))
	elif action == "fadeout":
		address = directive_to_run['options']['address']
		p.fadeOut(address.encode('latin-1'))
	elif action == "linktable":
		print "linked to:"
		pprint(p.getPlmLinkTable())
		print "\n"
	elif action == "monitor":
		p.startMonitorMode()
		p.addEventListener(showmessage)
	elif action == "link":
		linked = raw_input("enter the id of the responder: ")
		p.createLink("11.11.11","AA.AA.AA")

def docheckin():
	app.raise_event("insteon","checkin")
	for directive in app.directives:
		run_directive(directive)



while(True):
	#docheckin()
	time.sleep(5)
