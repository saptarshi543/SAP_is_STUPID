#include <stdio.h>
#include <string.h>
int main()//working.....
{//success....
	printf("enter a string..\n");//working.....
	int len,vowels=0,constants=0,space=0;//success.....
	char user[1000],ch;
	fgets(user,sizeof(user),stdin);
    len=strlen(user);
    for (int i = 0;i<len ; i++)
    {
    	char ch=user[i];
      if ((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
     {
           ++vowels;
     }
      else if(ch==' ')
      {
        ++space;
      }
      else       {
        ++constants;
        continue;
      }
  }
    printf("the number of vowels are >%d\n",vowels );
    printf("the number of other characters are >%d\n",(constants-1) );
    printf("the number of spaces are >%d\n",space );
    }