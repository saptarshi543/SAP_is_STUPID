#include <stdio.h>
void add_one(int *ptr);
int main(){
    printf("Pointers..\n");
    int* p,i=10;
    p=&i;
    printf("%d\n",*p);
    add_one(p);
    add_one(p);
    add_one(p);
    printf("%d",*p);
}
void add_one(int* ptr){
    (*ptr)++;
}