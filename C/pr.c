#include <stdio.h>
int main()
{
	char num[30];
	printf("enter a number\n");
	scanf("%[^\n]%*c",num);
	printf("you have entered%s\n",num);
}