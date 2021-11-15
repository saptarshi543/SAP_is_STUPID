def one(user):#working...
	ar=[]
	ar[:]=user
	print(ar)
def two(user):#working...
	a=[]
	a=user.split('_')
	print(a)
	print(((int)(a[2])))
def th(user):#working...
	ar=[]
	ar[:]=user
	for i in range(0,len(ar)):
		print((ord(ar[i])),end="_")
def encrypt(user):#working...
	arr=[]
	arr[:]=user
	for r in range(0,(len(arr))):
		tempchar=arr[r]
		tmp=(ord(tempchar)+r)*2
		print(tmp,end="_")
def decrypt(user):#working...
	ard=[]
	ard=user.split('_')
	de=""
	for c in range(0,len(ard)):
		t=(int)(ard[c])
		tm1=t/2
		tm2=tm1-c
		tmpch=chr((int)(tm2))
		de+=tmpch
	print(de)
#k=input()
#decrypt(k)
#encrypt(k)
#th(k)
#two(k)
#one(k)