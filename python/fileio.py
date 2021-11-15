print("we will check if the file exists")
k=input("enter directory location\n")#success...
d=input("enter what you want to write in that file..")
try:#working....
	f=open(k,"w")
	f.write(d)
except Exception as e:
	print("error occured");
	pass
finally:
	f.close()
	pass