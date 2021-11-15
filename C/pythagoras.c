#include <stdio.h>//working....
#include <math.h>//success.......
int main(){
	int side2,side1;
	printf("we will use pythagoras theorem\nand find the 3rd side");
	printf("enter 1st side and 2nd side\n");
	scanf("%d\n%d",&side1,&side2);
	double newside1=pow(side1,2);
    double newside2=pow(side2,2);
    double final=sqrt(newside1+newside2);
printf("the third side is %lf\n",final );
}