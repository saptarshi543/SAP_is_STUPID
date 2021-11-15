#include <stdio.h>
#include <string.h>
int main()//reversal of a string
{
	char user[100];
   printf("enter any string\n");
   gets(user);
   strrev(user);
   printf("the reversal form is\n %s\n",user );
}