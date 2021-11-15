"""makes a password but this time it makes sure all characters go in...
previously...it was based on happenstance whichever char the computer will choose randomly

so for eg: if a user wishes to include space....it  may get included or not
but this time it will get included...this program will be more compact.."""
import numpy as np
import random
import sys
l_min=int(input('enter min length of password- '))
l_max=int(input('enter max length of password- '))
if l_min>l_max:
	print("poor choice.....\nexiting....")
	sys.exit()
print("should it contain special characters?\n1-yes\n2-no")
k_sp_char=int(input())
print("should it contain numbers?\n1-yes\n2-no")
k_num=int(input())
print("should it contain alphabets characters?\n1-yes\n2-no")
k_aplha=int(input())
print("should it contain spaces?\n1-yes\n2-no")
k_space=int(input())
print("should it contain letters?\n1-yes\n2-no")
if (k_num==2) and (k_space==2) and (k_aplha==2) and (k_letter==2) and (k_sp_char==2):
	print("poor choice.....\nexiting....")
	sys.exit()
k_letter=int(input())
special_characters=['!','@','#','$','%','&','*']
numbers=['1','2','3','4','5','6','7','8','9','0']
space=[' ']
alphabet_arr=['A','B', 'C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U','V','W','X','Y','Z']
letter_arr=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
final_arr=[]
if k_sp_char==1:
	final_arr=np.concatenate((final_arr,special_characters))
if k_num==1:
	final_arr=np.concatenate((final_arr,numbers))
if k_aplha==1:
	final_arr=np.concatenate((final_arr,alphabet_arr))
if k_space:
	final_arr=np.concatenate((final_arr,space))
if k_letter==1:
	final_arr=np.concatenate((final_arr,letter_arr))
random.shuffle(final_arr)
final_pass=""
errFound=False
final_len=int(final_len)
if l_min==l_max:
	final_len=l_max
else:
	final_len=random.randint(l_min,l_max)
for s in range(1,final_len):
	tmp=final_arr[(random.randint(0,((len(final_arr))-1)))]
	final_pass+=(str)(tmp)
print(">>",final_pass,"<<")
print("checking........")
if k_sp_char==1:
	for i in special_characters:
		if (final_pass.find(i,0,(len(final_pass)-1)))<=-1:
			errFound=True
if k_num==1:
	for i2 in numbers:
		if(final_pass.find(i2,0,(len(final_pass)-1)))<=-1:
			errFound=True
if k_aplha==1:
	for i3 in alphabet_arr:
		if(final_pass.find(i3,0,(len(final_pass)-1)))<=-1:
			errFound=True
if k_space:
	for i4 in space:
		if(final_pass.find(i4,0,(len(final_pass)-1)))<=-1:
			errFound=True
if k_letter==1:
	for i5 in letter_arr:
		if(final_pass.find(i5,0,(len(final_pass)-1)))<=-1:
			errFound=True
if errFound==True:
	print("errs found...")
	print("modifying....")
else:
	print("no errs found..")
