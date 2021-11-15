"""stack
working....success...."""
def create():
	print("enter no.of terms...")
	s=[]
	return s

def add(target,key):
	target.append(key)
	print("add..",key)

def remove(target):
	if(len(target)==0):
		print("empty")
	return target.pop()

def show(target):
	print(target)

#driver code
stack=create()
print("original...\n",stack)
while(True):
	print("1: add\t 2:remove\t 3: show stack")
	tmp=int(input())
	if tmp==1:
		print("enter item to add")
		a=int(input())
		add(stack,a)
	elif tmp==2:
		print("enter item to remove")
		remove(stack)
	elif tmp==3:
		show(stack)
	else:
		break