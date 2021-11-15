import time
#working...........
#success..............
def delay():#this function is working...
#it considers milliseconds...
	time.sleep(0.05)
def style_l_to_r():#left to right is working..
	for x in range(0,15):
		print("   "*x, end="#\n")
		delay()
def style_r_to_l():#right to left is working..
	for k in reversed(range(15)):
		print("   "*k, end="#\n")
		delay()
#now the main body...
def main():
	tr=True
	while tr==True:
		style_l_to_r()
		style_r_to_l()
main()