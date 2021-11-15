#check for an evenpal number....
"""working...
success..."""
"""evenpal number is a no. which has even no. of digits and the reverse 
of it is the same as the original no."""
def check(n):
	copy1,copy2,rev,sumD=n,n,0,0
	#reverse..
	while copy2!=0:
		rev=(rev*10)+(copy2%10)
		copy2//=10
	while copy2!=0:
		sumD+=(copy2%10)
		copy2//=10
	if rev==n and sumD%2==0:
		return 0
	else:
		return 1

#driver code...
print("we will check if its an evenpal no.\nenter a no. ")
ans=check(int(input()))
if ans==0:
	print("an evenpal no.")
else:
	print("not an evenpal no.")