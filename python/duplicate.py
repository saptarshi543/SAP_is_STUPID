import array as arr
def find_duplicate(arr):
	arr.sort()
	for d in range(0,(len(arr)-1)):
		if arr[d]==arr[d+1]:
			print(arr[d]," exists more than once")
print("we will find duplicate no.s in an array\n enter no. of an array\n")
k=int(input())
arr.array('i')
arr=[]*(k-1)
for x in range(0,k):
	arr.append(input())
find_duplicate(arr)
#working......
#success.....