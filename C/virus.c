#include <stdio.h>
#include <string.h>
int main(){
	char user[100];
	printf("enter any string..\n");//program virus....
	scanf("%s",user);
	int len=strlen(user);
int i,j;
	for (i=0;i<len;i++)
	{
		for (j=0;j<len;j++)
		{
FILE *fptr;	
fptr=fopen("C:\\Program Files\\newprogram.exe","a");
fprintf(fptr, "%s\n",user );
}
}
}