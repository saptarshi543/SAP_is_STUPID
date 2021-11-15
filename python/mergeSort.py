"""working...uccess..."""
def mergeSort(a):
	if len(a)>1:
		r=len(a)//2
		l=a[:r]
		m=a[r:]
		mergeSort(l)
		mergeSort(m)
		i=j=k=0
		while i<len(l) and j<len(m):
			if l[i]<m[j]:
				a[k]=l[i]
				i+=1
			else:
				a[k]=m[j]
				j+=1
			k+=1
		while i<len(l):
			a[k]=l[i]
			i+=1
			k+=1
		while j<len(m):
			a[k]=m[j]
			j+=1
			k+=1

#driver code...
a=[-2,45,0,11,-9]
mergeSort(a)
print(a)