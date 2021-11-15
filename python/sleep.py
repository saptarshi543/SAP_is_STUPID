import time
print("hello>")#working...
print("for how long do you want to delay the next message?")
a=input("....")
print("\n")
o=float(a)
def hello():
	time.sleep(o)
	print("hello...\n")
hello()