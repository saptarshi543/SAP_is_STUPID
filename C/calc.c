#include <stdio.h>
int main()
{
	int u,o,p;
	char operator;
	printf("welcome to calculator\n");
	printf("enter 2 numbers\n");
	printf("choose from these\n");
	printf("+  -   *   /  % \n");
        printf("+ plus\n - subtract\n * multiplication \n / division \n % remainder\n");
	scanf("%d %d \n",&o,&p);
	scanf("%c",&operator);
	switch(operator)
	{
	       case '+':
        u=(o+p);
        printf("the sum is %d\n",u );
        break;
        case '-':
        u=(o-p);
        printf("the subtraction is %d\n",u );
        break;
        case '*':
        u=(o*p);
        printf("the multiplication is %d\n",u );
        break;
        case '/':
        u=(o/p);
        printf("the division is %d\n",u );
        break;
        case '%':
        u=o%p;
        printf("the remainder is %d\n",u);
        break;
        default:
        printf("error.....\n");
	}
	return 0;
}