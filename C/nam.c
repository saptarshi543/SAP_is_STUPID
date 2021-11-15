#include <stdio.h>
#include <string.h>
int main()
{
	int h;
	char name[30];
	printf("enter your name:");
	scanf("%s",&name);
    h=strlen(name);
    printf("your name is %d characters long\n",h );
}