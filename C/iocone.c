#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main(){
	char c[100];//success.....
	FILE *f;//working......
	f=fopen("E:\\dap\\experimentalforc.txt","w");
	if(f==NULL){
		printf("error encountered\n");
		exit(1);
	}
	printf("enter text to save in E:\\dap\\experimentalforc.txt\n");
    gets(c);
    fprintf(f,"%s",c);
    fclose(f);
}