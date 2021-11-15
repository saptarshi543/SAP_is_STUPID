"""..."""
def insertionSort(a):
	for step in range(1,len(a)):
		key=a[step]
		j=step-1
		while j>=0 and key<a[j]:
			a[j+1]=a[j]
			j-=1
		a[j+1]=key

#driver code...
a=[-2,45,0,11,-9]
insertionSort(a)
print(a)