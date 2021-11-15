#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(){//working.....
	char c[100];//success....but terminates process if space is encountered
	FILE *f;
	f=fopen("E:\\dap\\experimentalforc.txt","r");
	if(f==NULL){
		printf("error opening file..\n");
		exit(1);
	}
	fscanf(f,"%s",c);
	printf("%s\n",c );
	fclose(f);
}