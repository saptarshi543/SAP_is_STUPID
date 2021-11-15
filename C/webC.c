#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*working...
success...
this program converts all spaces to[+]..*/
int main(){
	printf("enter searc terms..\n");
	char search[100];
	gets(search);
	char final[]="start http://google.com/search?q=";
	int len=strlen(search);
for(int g=0;g<len;g++){
	if(search[g]==' '){search[g]='+';}
}
	strcat(final,search);
	system(final);
}