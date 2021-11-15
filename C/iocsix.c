#include <stdio.h>
#include <stdlib.h>
int main(){
	char c[1000];
	FILE *f;
	printf("we will read from a file\nenter file location\n");
	gets(c);
	char v[1000];
	f=fopen(c,"r");
	if(f==NULL){
		printf("error encountered\n");
		exit(1);
	}
	fscanf(f,"%s",&v);
	printf("%s\n",v );
	fclose(f);
}//stops when encountering a space..