#unique password generator
#lets ask the user about detalis
"""working...
success..."""
import numpy as np
import random
import sys
l_min=int(input('enter min length of password- '))
l_max=int(input('enter max length of password- '))
print("should it contain special characters?\n1-yes\n2-no")
k_sp_char=int(input())
print("should it contain numbers?\n1-yes\n2-no")
k_num=int(input())
print("should it contain alphabets characters?\n1-yes\n2-no")
k_aplha=int(input())
print("should it contain spaces?\n1-yes\n2-no")
k_space=int(input())
print("should it contain letters?\n1-yes\n2-no")
k_letter=int(input())
special_characters=['!','@','#','$','%','&','*']
numbers=['1','2','3','4','5','6','7','8','9','0']
space=[' ']
alphabet_arr=['A','B', 'C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U','V','W','X','Y','Z']
letter_arr=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
final_arr=[]
if (k_num==2) and (k_space==2) and (k_aplha==2) and (k_letter==2) and (k_sp_char==2):
	print("poor choice.....\nexiting....")
	sys.exit()
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
new=[]
new=np.concatenate((new,special_characters))
new=np.concatenate((new,alphabet_arr))
new=np.concatenate((new,letter_arr))
random.shuffle(new)
if (l_max==l_min):
	final_length=l_max
else:
	final_length=random.randint(l_min,l_max)
for s in range(1,(final_length)):
	tmp=final_arr[(random.randint(0,((len(final_arr))-1)))]
	final_pass+=(str)(tmp)
if (final_pass.find(" "))!=-1:#prevents a password from starting with a space " "...
	final_pass=final_pass.replace(" ",(new[(random.randint(0,((len(new))-1)))]))
print("your password is>\n",">>",final_pass,"<<")