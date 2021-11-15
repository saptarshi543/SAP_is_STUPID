#include <stdio.h>
#include <string.h>
int main()
{
	int user,ou;
	printf("Today we will convert ascii value to string\n");
	printf("enter the number of entries\n");
	scanf("%d",&user);
	char ne[100];
	char ji[user];
	int i;
	for (int i = 0; i <user ; i++)
	{
		printf("enter the number\n");
		scanf("%d",&ou);
		char ne=(char)ou;
	printf("%c\n",ne);
	}
}