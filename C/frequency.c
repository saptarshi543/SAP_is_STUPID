#include <stdio.h>
#include <string.h>
int main(){
	char str[1000],ch;//working.......
	int count=0;//success.......
	printf("enter a string....\n");
	fgets(str,sizeof(str), stdin);
	printf("enter a character to find its frequency\n");
	scanf("%c",&ch);
	int len=strlen(str);
    for (int i=0;i<len;i++)
    {
      if (ch==str[i])
      {
      	++count;
      }
    }
    printf("the number of frequency=%d\n",count );
}