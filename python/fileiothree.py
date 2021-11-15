"""we will ask user for file location...
then we will ask if user wants to write something or modify it orpreserve 
previous data and write some new data in it"""
#working.....
#success....
"""we can also run cmd commands..
import os
os.system('cmd /k"<what u want to write...>"')"""
import pyautogui as p
import time
import os
import easygui as e
import tkinter as tk
from tkinter import simpledialog
#now lets first try to ask user...
def askUser():
	global user
	user=e.enterbox("1-write to file\n2-delete everything write fresh\n3-read from file..\n4-quit")
	user=int(user)
def asklocation():
	global userloc
	userloc=e.enterbox("enter file location...")
	userloc=str(userloc)
def one(location):
	ROOT=tk.Tk()
	ROOT.withdraw()
	for_one=simpledialog.askstring(title="hello!",prompt="what do u want to write?")
	for_one=str(for_one)
	try:
		with open(location,"a",encoding='utf-8') as f:
			f.write(for_one)
	except Exception as e:
		raise e
	finally:
		pass
def read(loc):
	try:
		with open(loc,"r",encoding='utf-8') as g:
			for line in g:
				print(line,end='')
	except Exception as l:
		print("error occurred..")
		pass
	finally:
		g.close()
def two(loc):
	lo=str(lo)
	lo=simpledialog.askstring(title="hello!",prompt="what do u want to write?")
	try:
		with open(loc,"w",encoding='utf-8') as v:
			v.write(lo)
	except Exception as e:
		print ("error occurred..")
		pass
	finally:
		v.close()
		pass
def quit():
	exit()

#driver code...
askUser()
asklocation()
try:
	if user==1:
		one(userloc)
	elif user==2:
		two(userloc)
	elif user==3:
		read(userloc)
	elif user==4:
		quit()
	print("\nautomatically clearing screen in 10 seconds..")
except Exception as e:
	raise e
finally:
	time.sleep(10)
	os.system('cmd /k "cls"')