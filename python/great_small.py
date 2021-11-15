import array as arr
"""working...
success...."""
def greatest(at):#this function is working....
	at.sort()
	great=at[k-1]
	print("greatest number is ",great)
def small(ae):#this function is working....
	ae.sort()
	if 0 in ae :
		print("the smallest number is ", (ae[1]))
	else:
		print("the smallest number is ", (ae[0]))
print("we will find greatest and smallest no.\nenter no. of entries..\n")
k=int(input())
a=arr.array('i')
a=[]*(k-1)
for s in range(0,k):
	a.append(int(input()))
greatest(a)#this one is working...
small(a)#this one is working.....