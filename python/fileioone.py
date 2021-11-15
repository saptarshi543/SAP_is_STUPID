print("we will check if the file exists")#working...
k=input("enter directory location\n")#success.....
d=input("enter what you want to write in that file..\n")
try:
    with open(k,"w",encoding ='utf-8')as f:
	    f.write(d)
except Exception as e:
	print("error occured")
	pass
finally:
	f.close()
	pass