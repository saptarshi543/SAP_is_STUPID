"""take an array in put and replace 0s but we will maintain the order..."""
def removeDuplicate(user:[int]):
	lenofuser=len(user)
	#user.remove(0)
	for i in user:
		if i==0:
			user.remove(0)
	lenofusernow=len(user)
	for i3 in range(0,(lenofuser-lenofusernow)):
		user.append(0)
	print (user)
def driver():
	print("enter array size..")
	k=int(input())
	user=[]
	for i in range(0,k):
		user.append(int(input()))
	print(user)
	removeDuplicate(user)
driver()