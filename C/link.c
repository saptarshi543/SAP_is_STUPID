/*google creates random links without offensive words in it...lets try that out
working....success....*/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define randnum(min,max) \
((rand() % (int)(((max) + 1) - (min))) + (min))
void make();
int  main(){
	srand(time(NULL));
	make();
}
void make(){
char link[12];
char container[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
int s=sizeof(container)/sizeof(container[0]);
for(int i=0;i<12;i++){
	if(i==3 || i==8){link[i]='-';}
	else{link[i]=container[randnum(0,s-1)];}
}
for(int i=0;i<12;i++){printf("%c",link[i]);}
}