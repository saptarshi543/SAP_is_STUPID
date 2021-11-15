//check for armstrong number
#include <stdio.h>//success.....
int main(){//working....but only for 3 digit numbers
	printf("enter a number to check if its an armstrong number or not\n");
	int orinum;
	scanf("%d",&orinum);
	int k=0,d;
	int num=orinum;
	while(num!=0){
       d= num % 10;
       k+=(d*d*d);
       num=(num/10);
	}
	if(orinum==k){
		printf("%d is an armstrong number\n",orinum );
	}
	else{
		printf("NOT armstrong number\n");
	}
}