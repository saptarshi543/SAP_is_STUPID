#include <stdlib.h>
#include <string.h>
#include <stdio.h>
int main(){
	char c[100];
	printf("enter the file location\nwe will tell if it exists or not\n");
	gets(c);
	FILE *f;
	f=fopen(c,"r");
	if(f==NULL){
		printf("error\nfile does not exist");
	}
	else{
		printf("file exists\n");
		fscanf(f,"%s",c);
		printf("file contains...\n%s",c);
	}
	fclose(f);
}