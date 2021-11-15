#include <stdio.h>
int main()
{
	int len,bre;
int o,u;
   printf("we are going to find the area and perimeter of a rectangle...\n");
   printf("please enter length and breadth...\n");
scanf("%d",&len);
scanf("%d",&bre);
o=2*(len+bre);
u=len*bre;
printf("the area is=%d\n",u);
printf("the perimeter is=%d",o);
}