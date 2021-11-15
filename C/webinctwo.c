#include <stdlib.h>
#include <string.h>
#include <stdio.h>//success....
int main(void){//working.....
	printf("enter search terms\n");
	char s[100];
	scanf("%s",&s);
    char new[]="start http://google.com/search?q=";
    strcat(new,s);
    system(new);
    printf("DONE\n");
}