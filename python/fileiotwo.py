print("we will check if the file exists and read from it..")#success..
k=input("enter directory location\n")#working........
try:
	with open(k,"r",encoding ='utf-8') as f:
		for line in f:
			print(line ,end='')
except Exception as e:
	print("error occured")
	pass
finally:
	f.close()
	pass