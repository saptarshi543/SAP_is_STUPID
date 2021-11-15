#include <stdio.h>
int main()
{
	int num;
	char name[30];
	printf("enter a number..");
    printf("enter your name \n");
	scanf("%d",&num);
	scanf("%s",&name);
	printf("you have entered=%d MR/MS:%s",num,name);
}