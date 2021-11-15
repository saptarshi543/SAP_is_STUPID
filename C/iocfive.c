#include <stdlib.h>
#include <stdio.h>
#include <string.h>
struct a
{
	char s[1000];
};
int main(){
	struct a j;
	printf("we will write to a file\nenter the file location...\n");
	FILE *f;
	char d[100];
	gets(d);
	printf("what do you want to erite?\n");
	gets((j.s));
	f=fopen(d,"w");
	if(f==NULL){
		printf("error opening file\n");
		exit(1);
	}
    fwrite(&(j.s), sizeof(struct a),1,f);
    fclose(f);
}//writes to a file but behaves abruptly by writing many many characters after the given string