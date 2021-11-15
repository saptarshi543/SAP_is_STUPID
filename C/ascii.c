#include <stdio.h>
int main()//character to ASCII value conversion
{
	char ch;
	printf("enter a character>\n");
	scanf("%c",&ch);
	printf("you entered > %c.\n", ch);
	printf("the ascii value is> %d.",ch);
	return 0;
}