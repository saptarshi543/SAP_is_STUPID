#include <stdio.h>
#include <stdlib.h>
#include <search.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
/*it works only for 2 alphabets
for eg :give whatever you want and it will work but it has to be only 2 alphabets
eg: "A B" , "F B", "E A" ,etc..
          but it fails for more than 2 alphabets...eg: "E F B"...gives wrong error
	  also works only for 1 digit number 
	  it can handle 1 digit no.s 
	  but fails when there are more than 2 alphabets or numbers*/
int hexaTO_DEC(int s,int check,int ans);
void check(char c[],int n);
int main(void){
	char c[]={'A','B','C','D','E','F'};
	char user[100]= "AAA";
	check(user,3);
}
void check(char c[],int n){
	int sizeC=n,check=0,ans=0;
	strrev(c);
	for(int i=0;i<sizeC;i++){
		   if(c[i]==' '){printf("continuing...\n");continue;}
		else if(c[i]=='A'){ans+=hexaTO_DEC(10,check++,ans);}
		else if(c[i]=='B'){ans+=hexaTO_DEC(11,check++,ans);}
		else if(c[i]=='C'){ans+=hexaTO_DEC(12,check++,ans);}
		else if(c[i]=='D'){ans+=hexaTO_DEC(13,check++,ans);}
		else if(c[i]=='E'){ans+=hexaTO_DEC(14,check++,ans);}
		else if(c[i]=='F'){ans+=hexaTO_DEC(15,check++,ans);}
		else if(c[i]=='1'){ans+=hexaTO_DEC(1,check++,ans);}
		else if(c[i]=='2'){ans+=hexaTO_DEC(2,check++,ans);}
		else if(c[i]=='3'){ans+=hexaTO_DEC(3,check++,ans);}
		else if(c[i]=='4'){ans+=hexaTO_DEC(4,check++,ans);}
		else if(c[i]=='5'){ans+=hexaTO_DEC(5,check++,ans);}
		else if(c[i]=='6'){ans+=hexaTO_DEC(6,check++,ans);}
		else if(c[i]=='7'){ans+=hexaTO_DEC(7,check++,ans);}
		else if(c[i]=='8'){ans+=hexaTO_DEC(8,check++,ans);}
		else if(c[i]=='9'){ans+=hexaTO_DEC(9,check++,ans);}
		else if(c[i]=='0'){ans+=hexaTO_DEC(0,check++,ans);}
	}
	// printf("...%d",ans);
}
int hexaTO_DEC(int s,int check,int ans){//the problem must be in this function
	//because the function check can efficiently detect the variables
	//and alphabets correctly...
int tmp=pow(16,check);
printf("check %d\ntmp %d\nans %d\ns %d\n",check,tmp,ans,s);
//check++;
ans+=(tmp * s);
printf("......>%d\n",ans);
return ans;
}
