#include <stdio.h>
#include <string.h>
int main()
{
	int len;
	char name[30];
	printf("enter your name\n");
	scanf("%s",&name);
	len=strlen(name);
	printf("your name is %d characters long\n",len);
}