#include <stdio.h>
#include <stdlib.h>
int main(){
    int *ptr,i,n1,n2;
    n1=3;
    ptr=(int*) malloc(n1* sizeof(int));
    printf("original addresses\n");
    for(i=0;i<n1;i++){
        printf("%pc\n",ptr+i);
    }
    n2=5;
    ptr=realloc(ptr,n2*sizeof(int));
    printf("final addresses\n");
    for(i=0;i<n2;i++){
        printf("%pc\n",ptr+i);
    }
    free(ptr);
}