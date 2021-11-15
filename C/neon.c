/*working......
success....*/
#include <stdio.h>
int isNEON(int a);
int main(){
	printf("we will check for neon number..\n enter a number\n");
	int n;
	scanf("%d",&n);
	isNEON(n);
}
int isNEON(int a){
	int r=(a*a);
	int copy=r,digit,sumofdigit=0;
	while(copy!=0){
		digit=copy%10;
		sumofdigit+=digit;
		copy/=10;
	}
	if (sumofdigit==a){
		printf("%d is neon number\n",a );
	}
	else{
		printf("%d is not neon number\n",a );
	}
}