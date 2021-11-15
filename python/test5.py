#import time as t
#working...comparing time
# def time():
# 	c=t.localtime()
#     c2=t.strftime("%H %M", c)
#     print(c,"\n",c2)
#     if c2>="14 40":
# 	    print(1)
#     else:
# 	    print(2)
def stringTest():
	# i,k="abcd",'abcd'
	sap=["a","b","c","d"]
	sap2=['a','c','b','d']
	target=["a",'a']
	# if i==k:
	# 	print("same")
	if target[0] in sap2:
		print("sap1")
	if target[1] in sap:
		print("sap2")
#driver code
stringTest()