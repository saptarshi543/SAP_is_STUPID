"""google creates random links without offensive words in it...lets try that out"""
#it works fine when creting links...but fails to effectively check for offensive words in the link..
import random as r

def make():
	container=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
	final=""
	for i3 in range(0,12):
	    if i3==3 or i3==8:
		    final+="-"
	    else:
		    final+=container[r.randint(0,(len(container)-1))]
	return final

def check(arg):
	dBase=["fuck","dick","sex","xxx","bbc"]
	e=0
	arr=arg.split("-")
	print(arr)
	for tmp in range(0,2):
		if arr[tmp] in dBase:
			++e
	if e>0:
		return 1
	else:
		return 0
#driver code
#ans=make()
# print(ans)
justchecking="sex-fuck-yut"
errs=check(justchecking)
print(errs)
if errs==1:
	print("errors found..")
else:
	print("no errors..")