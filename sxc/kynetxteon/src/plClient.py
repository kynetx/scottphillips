# Python pyLights client
#
# A pylights plm object will accept commands from this client.

import sys, socket


def main():
	'''
	This script is meant to be run from a command prompt after setting the HOST
	address veriable below.  A PLM object must be set up and running on the 
	host machine.  It can (in theory) run any of the commands you
	might give a PLM object and can also return responses.
	
	Example:
	
		python plClient.py "setLevel('Kitchen',100)"
		
	Double quotes surrounding the command are necessary when strings are 
	passed as arguments.
	'''
	HOST = 'localhost' #'192.168.2.103'
	PORT = 52006

	if len(sys.argv) == 2:
		s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		try:
			s.connect((HOST,PORT))
		except socket.error:
			print 'Could not connect to server'
		else:
			s.send(sys.argv[1])
			s.settimeout(2.0)
			try:
				resp = s.recv(1024)
				print resp
			except socket.timeout:
				print "Socket timeout waiting for response, probably due to a bad command."
			except:
				raise
			s.close()
			#del s

if __name__ == "__main__":
	main()