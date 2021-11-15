#include <stdio.h>
#include <string.h>
int main()
{
	int i,j;
	printf("enter your name\n");//pattern
	char user[50],ne[0];//assuming input is> abcd
	scanf("%s",user);//output >>
	int len=strlen(user);      //a
	for ( i = 0; i <=len ; i++)//bb
	{                          //ccc
		for (j=0;j<=i  ;j++ )  //dddd
		{
		char ch=user[i];
		printf("%c",ch );
		}
		printf("\n");
	}
}