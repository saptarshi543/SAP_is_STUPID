"""working...success..."""
def partition(a,low,high):
	pivot=a[high]
	i=low-1
	for j in range(low,high):
		if a[j]<= pivot:
			i+=1
			a[i],a[j]=a[j],a[i]
		a[i+1],a[high]=a[high],a[i+1]
	return i+1
def quickSort(a,low,high):
	if low<high:
		pi=partition(a,low,high)
		quickSort(a,low,pi-1)
		quickSort(a,pi+1,high)

#driver code
a=[8, 7, 2, 1, 0, 9, 6]
quickSort(a,0,(len(a)-1))
print(a)