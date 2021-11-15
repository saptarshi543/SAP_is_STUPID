#automatically sorts words in alphabetical oreder...and if there are numbers they are 
#sorted too...
#working.......but if one or more  elements start with the same thing the rest are being omitted
#success.......
myMap={}
user=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0']
print("enter words and number to sort them...enter no. of entries...")
i=int(input())
for l in range(0,i):
	tmp=input()
	if type(tmp)==int:
		myMap[tmp]=str(tmp)
	elif type(tmp)==str:
		myMap[(str(tmp[0]))]=str(tmp)
print(myMap,"\n--------------------\n")
for k in user:
	if k in myMap:
		print(myMap[k])