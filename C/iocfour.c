#include <stdlib.h>
#include <stdio.h>
#include <string.h>
int main(){
	char d[100],c[100];
	printf("enter file location.\n");
	scanf("%s",&c);
	FILE *g;//this program overwrites the files data...
	g=fopen(c,"w");
	if(g!=NULL){
        gets(d);
        fprintf(g, "%s\n",d );
	}
	else
		printf("error file does not exists\n");
	fclose(g);
}