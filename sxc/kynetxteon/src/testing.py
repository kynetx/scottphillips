'''
Created on Oct 4, 2010

@author: sam
'''
import pylights, time
from pprint import pprint

p = pylights.plm("/dev/tty.USA19QW62P1.1","verbose")

p.fadeIn("11.11.11")
time.sleep(5)
p.fadeOut("11.11.11")



def showmessage(info):
    print "got message: "
    pprint(info)


pprint(p.getPlmLinkTable())

p.addEventListener(showmessage)


#p.startMonitorMode()

while(True):
    #print p.getLevel("11.11.11")
    time.sleep(5)