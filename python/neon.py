#working..........
#success.......
def isNEON(k):
	m=(k*k)
	res=0
	copy=m
	while copy!=0:
		d=(int)(copy%10)
		res+=d
		copy=copy//10
	if res==k:
		print(k ," is a neon number")
	else:
		print(k ," is not a neon number")
print("we will check for neon number..\n enter a number")
k=int(input())
isNEON(k)