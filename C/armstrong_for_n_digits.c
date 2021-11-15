#include <stdio.h>//working...
#include <math.h>//success....
int main(){
	printf("enter a number of any no. of digits\nwe will check if its armstrong or not..");
	int n;
	scanf("%d",&n);
	int copy,f=0;
	int digit,copy2;
	float result=0.0;
	for(copy2=n;copy2!=0;++f){
		copy2/=10;
	}
	for(copy=n;copy!=0;copy/=10){
		digit=copy%10;
		result+=pow(digit,f);
	}
	if((int)(result)==n)
		printf("%d is an armstrong number\n",n );
	else
		printf("%d is not an armstrong number\n",n );
}