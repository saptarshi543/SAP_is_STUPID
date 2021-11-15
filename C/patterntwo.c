#include <stdio.h>
#include <string.h>
int main()
{
	char user[100],ne[0];
	printf("enter your name...\n");
	scanf("%s",user);
	int len=strlen(user);
    for (int i = 0; i <len ; i++)
    {
    	char ch=user[i];
    	printf("%c\n",ch );//assuming input is abcd
    }/*the output will be
    a
    b
    c
    d*/
}