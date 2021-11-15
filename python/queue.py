"""queue
working....success..."""
class Queue:
	def __init__(self):
		self.queue=[]
	#add element	
	def enqueue(self,item):
		self.queue.append(item)

	#remove element
	def dequeue(self):
		if len(self.queue)<1:
			return None
		return self.queue.pop(0)

	#display queue
	def display(self):
		print(self.queue)

	#show size
	def size(self):
		return len(self.queue)

#driver code..

q=Queue()
while(True):
	print("1: add\t 2:remove\t 3: show queue\t 4:show size of Queue")
	tmp=int(input())
	if tmp==1:
		a=int(input())
		q.enqueue(a)
	elif tmp==2:
		q.dequeue()
	elif tmp==3:
		q.display()
	elif tmp==4:
		print(q.size())
	else:
		break