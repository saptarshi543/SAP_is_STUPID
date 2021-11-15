#include <stdio.h>
#include<string.h>
int main()
{
	char name[30];
	printf("enter your name\n");
    gets(name);
    int ou=strlen(name);
    for (int i = 0; i < ou; i++)
    {
    	char two=name[i];
    	printf("...%d\n",two);
    }
}