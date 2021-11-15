"""working...success..."""
def selectionSort(a,size):
	for step in range(size):
	    min_idx=step
	    for i in range(step+1,size):
		    if a[i]<a[min_idx]:
			    min_idx=i
		    a[step],a[min_idx]=a[min_idx],a[step]

#driver code...
a=[-2,45,0,11,-9]
selectionSort(a,len(a))
print(a)