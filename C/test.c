#include <stdio.h>
#include <math.h>
// #include <stdlib.h>
// #include <time.h>

// #define print() \
// printf("hello")

// //working.....
// #define randnum(min,max) \
//   ((rand() % (int)(((max) + 1) - (min))) + (min))
// int getNoOfDigits(int n);
// int exponent(int target,int times);
int power(int t,int t2);
int main(){
  // srand(time(NULL));
  // printf("%d",randnum(1,4));
  // printf("%d\n",getNoOfDigits(1242));
  printf("%d",power(10,2));
}

int power(int t,int t2){//working...
int ans=1;
for(int tmp=1;tmp<=t2;tmp++){
	ans*=t;
}
return ans;
}

// int exponent(int target,int times){
//   return pow(target,times);
// }


// int getNoOfDigits(int n){
//   int ans=0,copy=n;
//   while(copy!=0){
//     copy/=10;
//     ++ans;
//   }
//   return ans;
// }