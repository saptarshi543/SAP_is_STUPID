
def buzz_fizz(upper_bound,lower_bound,arg1,arg2):
	for i in range(lower_bound,upper_bound+1):
		print("FizzBuzz" if ((i%arg1==0)and(i%arg2==0)) else ("Fizz" if (i%arg1==0) else ("Buzz" if (i%arg2==0) else i)))


#driver code
print("enter upper bound,lower bound, arg1 ,arg2\n arg are the numbers of which multiples will be checked")
upp=int(input())
lower=int(input())
a1=int(input())
a2=int(input())
buzz_fizz(upp,lower,a1,a2)