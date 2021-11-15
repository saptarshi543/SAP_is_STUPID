#encrypt
"""
>>sap is stupid..."""
#eg..>>"12_34_3_32_x_y_z...."
"""convert them separately..."""
"""working...
success....
here's how to use it...
to encrypt..enter simple text ..it will return some codes...
to decrypt enter the codes but remove the last underscore"""
def encrypt(user):#working...
	arr=[]
	arr[:]=user
	for r in range(0,(len(arr))):#this one is working....
		tempchar=arr[r]#it encrypts any string...
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
print("1-encrypt\n2-decrypt...")
us=int(input())
print("enter info...")
damn=str(input())
if us==1:
    encrypt(damn)
elif us==2:
    decrypt(damn)
else:
    print("wrong choice..")
