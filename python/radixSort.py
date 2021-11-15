"""..."""
def countingSort(a,place):
	size=len(a)
	output=[0] * size
	count=[0] * 10
	for i in range(0,size):
		index = a[i]//place
		count[index%10] += 1
	for i in range(1,10):
		count[i]+=count[i-1]
	i=size-1
	while i>=0:
		index=a[i]//place
		output[count[index%10]-1]=a[i]
		count[index%10] -=1
		i -= 1
	for  i in range(0,size):
		a[i]=output[i]

def radixSort(a):
	max_element=max(a)
	place=1
	while max_element // place >0:
		countingSort(a,place)
		place*=10


#driver code
a=[121, 432, 564, 23, 1, 45, 788]
radixSort(a)
print(a)