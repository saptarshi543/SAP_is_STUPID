#include <stdio.h>
#include <string.h>
int main()
{char user[100];
	printf("enter your name..\n");
scanf("%s",user);
int len=strlen(user);
int i,j;
for ( i = 0; i <len ; i++)
{
	for (j=1;j<(len+1);j++)
	{
		char ch=user[j];
		printf("%s",ch);
	}
	printf("\n");
}
}