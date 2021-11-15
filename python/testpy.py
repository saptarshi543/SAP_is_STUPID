import time
#def f():
#	message = "Some fancy character printing!"
 #   for i in message:
  #      print(i)
   #time.sleep(0.3)
def style_l_to_r():#left to right is working..
	for x in range(0,15):
		print("   "*x, end="#\n")
#style_l_to_r()
def style_r_to_l():#right to left is working..
	for k in reversed(range(15)):
		print("   "*k, end="#\n")
style_l_to_r()
style_r_to_l()
#  	print(i)
#this file is only for testing small programs in python before using them in big projects
#feel free to use it...
"""
.
.
.
.
.#for dialog boxes in python...
.# python -m pip install pyautogui
import pyautogui

# Examples:
pyautogui.alert('Just a notification', "Title")  # always returns "OK"
pyautogui.confirm('Asks OK or Cancel')  # returns "OK" or "Cancel"
pyautogui.prompt('Asks for a string from user')  # returns string or None
pyautogui.password('Enter password')  # returns string or None

# Method signatures:
#   alert(text='', title='', button='OK')
#   confirm(text='', title='', buttons=['OK', 'Cancel'])
#   prompt(text='', title='' , default='')
#   password(text='', title='', default='', mask='*')
"""