#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <stdbool.h>
/*gonna have to work on it...*/
int getNoOfDigits(int n);//working....
int DecimalToOctal(int n);//working...
int DecimalToHexa(int n);//working..
int OctalToDecimal(int n);//working...but it gives a error...it says 'pow' is an undefined reference
int HexaToDecimal(char n[]);//i want to implement dictionary for this..
int reverse(int r);//working...
int power(int t,int t2);
int main(){
	// int user,u1,u2;
	// printf("1:Decimal To Octal\n2:Decimal To Hexadecimal\n3:Octal To Decimal\n4:Hexadecimal to Decimal\n");
	// printf("enter your choice.- \n");
	// scanf("%d",&u1);
	// if(u1==1){printf("enter the number\n");scanf("%d",&u2);printf("%d\n",DecimalToOctal(u2));}
	// else if(u1==2){printf("enter the number\n");scanf("%d",&u2);printf("%d\n",DecimalToHexa(u2));}
	// else if(u1==3){printf("enter the number\n");scanf("%d",&u2);printf("%d\n",OctalToDecimal(u2));}
	// else if(u1==4){printf("enter number or if you want to give characters b/w them \neg: input> 7CE\nenter it as 7 C E"\n);scanf ("%[^\n]%*c", uS);printf("%d\n",HexaToDecimal(name));}
	
	
	char s[]="A C E";
	printf(">>>%d",HexaToDecimal(s));
}
int DecimalToOctal(int n){//working...
	int ans=0;
	int copy=n,tmp=0;
	while(true){
		tmp=copy%8;
		ans*=10;
		// if(getNoOfDigits(tmp)==1){ans*=10;}
		// else if(getNoOfDigits(tmp)==2){ans*=100;}
		// else if(getNoOfDigits(tmp)>=3){ans*=1000;}
		ans=ans+tmp;
		if ((copy<=0)||(copy<8)){break;}
		copy=(int)copy/8;
	}
	return reverse(ans);
}
int DecimalToHexa(int n){//working...
	int ans=0,copy=n,tmp=0;
	while(true){
		tmp=copy%16;
		if(getNoOfDigits(tmp)==1){ans*=10;}
		else if(getNoOfDigits(tmp)==2){ans*=100;}
		else if (getNoOfDigits(tmp)>=3){ans*=1000;}
		ans+=tmp;
		if((copy<=0)||(copy<16)){break;}
		copy=(int)copy/16;
	}
	return reverse(ans);
}
int OctalToDecimal(int n){//working...
	int copy=n,sumofdigit=getNoOfDigits(n),ans=0;
	//first find out the no. of digits
		for(int i=0;i<sumofdigit;i++){
			ans+=((copy%10)*((int)(power(8,i))));
		copy/=10;
		}
		return ans;
}
int HexaToDecimal(char n[]){
	int T[]={10,11,12,13,14,15};
	char data[]={'A','B','C','D','E','F'};
	int count=0,size=0,ans=0;
	char ch;
	do{// *size is coming right
		ch=n[count];
		count++;
		size++;
	}while(ch!='\0');
	size-=1;
	char new_n[size];
	int count2=0;

	/*
	! reversing the array here
	! somehow array mew_n is filled with blank characters 
	*/
	for(int i=size-1;i>=0;i--){
		new_n[count2]=n[i];
		count2++;
	}

	/* 
	! just for testing 
	! uncomment to see the reverse string
    *for(int u=0;u<size;u++){printf("%c",new_n[u]);}*/
    int count3=1;
	for(int i=0;i<size;i++){
	    char tmp_check=new_n[i];
	    printf("tmp_check %c\n",tmp_check);
	        if(tmp_check=' '){continue;}
	        else if(tmp_check=='A'){
		ans+=(power(16,count3))*10;
		printf("\n count>>%d\n ans %d>",count3,ans);
	}
	        else if(tmp_check=='B'){
		ans+=(power(16,count3))*11;
		printf("\n count>>%d\n ans %d>",count3,ans);
	}
	        else if(tmp_check=='C'){
		ans+=(power(16,count3))*12;
		printf("\n count>>%d\n ans %d>",count3,ans);
	}
	        else if(tmp_check=='D'){
		ans+=(power(16,count3))*13;
		printf("\n count>>%d\n ans %d>",count3,ans);
	}
	        else if(tmp_check=='E'){
		ans+=(power(16,count3))*14;
		printf("\n count>>%d\n ans %d>",count3,ans);
	}
	        else if(tmp_check=='F'){
		ans+=(power(16,count3))*15;
		printf("\n count>>%d\n ans %d>",count3,ans);
	}
	        else{
		int tmp_n=tmp_check-'0';
		ans+=(power(16,count3))*tmp_n;
	}
	        count3++;
        }
	return ans;
}
int getNoOfDigits(int n){//working..
	int ans=0,copy=n;
	while(copy!=0){
		copy/=10;
		++ans;
	}
	return ans;
}
int reverse(int r){//working..
int rev=0;
while(r!=0){
	rev*=10;
	rev+=(r%10);
	r/=10;}
	return rev;
	}
int power(int t,int t2){//working...
int ans=1;
for(int tmp=1;tmp<=t2;tmp++){
	ans*=t;
}
return ans;
}
