#include <stdio.h>
int main(){//success...
int num,f=1,i=1;//working...
printf("enter a number \nwe will find factorial\n");
scanf("%d",&num);
while(i<=num){
	f*=i;
	i++;
}
printf("the factorial is %d\n",f );
}