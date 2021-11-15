#include <stdio.h>
int main()
{
	char name[30];
    printf("hello\nNice to meet you");
    printf("please enter your name>\n");
    scanf("%s",&name);
    printf("nice to meet you MR./MS.%s\nwelcome in the system>>>", name);
}