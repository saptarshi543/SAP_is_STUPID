/*working...success.....
but sometimes 2nd brackets come in the password though it is very rare..*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define randnum(min,max) \
  ((rand() % (int)(((max) + 1) - (min))) + (min))

int add(char f[], char toadd[],int Tmp,int size);
int main(){//unique password generator
	int Lmin,Lmax;
	printf("enter min length of password\n");
	scanf("%d",&Lmin);
	printf("enter max length of password\n");
	scanf("%d",&Lmax);
	int fLen=0;
	if(Lmin>Lmax){printf("error \n password length is wrong exiting...");exit(0);}
	else if(Lmin==Lmax){fLen=Lmax;}
	else {
		fLen=randnum(Lmin,Lmax);
	}
	int Tmp=0,Kspecial,Kalpha,Kletter,Kspace,Knumber;
	printf("would you like to include the following?\n");
	printf("special characters? :1-yes  :2-no \t");
	printf("alphabets? :1-yes  :2-no \t");
	printf("letters? :1-yes  :2-no \t");
	printf("spaces? :1-yes  :2-no  \t");
	printf("numbers? :1-yes  :2-no  \n");
	printf("\n enter any input at the end to continue..\n\n");
	char num[]={'1','2','3','4','5','6','7','8','9','0'};
    char space[]={' '};
    char alpha[]={'A','B', 'C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char special[]={'!','@','#','$','%','&','*'};
    char letter[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	scanf("%d \n %d \n %d \n %d \n %d",&Kspecial,&Kalpha,&Kletter,&Kspace,&Knumber);
	srand(time(NULL));
	int fin=0;

if (Kspecial==1){fin+=7;}
if(Kalpha==1){fin+=26;}
if(Kletter==1){fin+=26;}
if(Kspace==1){fin+=1;}
if(Knumber==1){fin+=10;}
char final[fin];

	if(Kspecial==1){Tmp=add(final,special,Tmp,7);}
	if(Kalpha==1){Tmp=add(final,alpha,Tmp,26);}
	if(Kletter==1){Tmp=add(final,letter,Tmp,26);}
	if(Kspace==1){Tmp=add(final,space,Tmp,1);}
	if(Knumber==1){Tmp=add(final,num,Tmp,10);}
	int forF=(sizeof(final)/sizeof(final[0]));
	//uncomment this section to see final array after user's choice
	//printf("len of final %d\n",forF);//len should be 70 but its showing 100
	// for(int r2=0;r2<70;r2++){printf("%c",final[r2]);}
	for(int r=0;r<=fLen;r++){
	printf("%c",(final[randnum(0,forF)]));
	}
}
int add(char f[],char toadd[],int Tmp,int size){
	for (int r=0;r<size;r++){
		f[Tmp]=toadd[r];
		++Tmp;
	}
	return Tmp;
}