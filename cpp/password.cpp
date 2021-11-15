#include <iostream>
#include <random>
#include <stack>
#include <Stack>
#include <vector>
#include<cstring>
#include <ctime>
#include <cstdlib>
/*working...success...
but it can't handle special characters in the terminal.but the
algorithm is working...*/
using namespace std;
int add(char final[],char toadd[],int Tmp,int size){//this function is working...
	for(int r=0;r<size;r++){
		final[Tmp]=toadd[r];
		++Tmp;
	}
	return Tmp;
}
int main(){
	srand(time(0));
	int l_max,l_min,k_space,k_num,k_alpha,k_letter,k_special,finalLen;
	cout<<"welcome to unique password generator..."<<endl;
	cout<<"do you wish to include the following..." <<endl;
	cout<< "enter min length of password- "<<endl;
	cin>>l_min;
	cout<<"enter max length of password- " <<endl;
	cin>>l_max;
	if(l_max<l_min){cout<<"poor choice..exiting.."<<endl;exit(0);}
	else if((l_max>l_min)||(l_min==l_max)){finalLen=rand() % l_max + l_min;}
	cout<<"should it contain special characters?  :1-yes  :2-no " <<endl;
	cin>>k_special;
	cout<<"should it contain numbers? :1-yes  :2-no " <<endl;
	cin>>k_num;
	cout<<"should it contain spaces? :1-yes  :2-no " <<endl;
	cin>>k_space;
	cout<<"should it contain letters? :1-yes  :2-no " <<endl;
	cin>>k_letter;
	cout<<"should it contain alphabets? :1-yes  :2-no " <<endl;
	cin>>k_alpha;
	// ...asking done...
	int Tmp=0,fin=0;

if (k_special==1){fin+=7;}
if(k_alpha==1){fin+=26;}
if(k_letter==1){fin+=26;}
if(k_space==1){fin+=1;}
if(k_num==1){fin+=10;}

	char final[fin];
    char num[]={'1','2','3','4','5','6','7','8','9','0'};
    char space[]={' '};
    char alpha[]={'A','B', 'C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char special[]={'!','@','#','$','%','&','*'};
    char letter[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	if(k_num==1){Tmp=add(final,num,Tmp,10);}
	if(k_space==1){Tmp=add(final,space,Tmp,1);}
	if(k_special==1){Tmp=add(final,special,Tmp,7);}
	if(k_alpha==1){Tmp=add(final,alpha,Tmp,26);}
	if(k_letter==1){Tmp=add(final,letter,Tmp,26);}
//uncomment this section the final array after user's choice...
// for(int itr=0;itr<Tmp;itr++){
// 	cout<<final[itr]<<" ";
// }
// cout<<(sizeof(final)/sizeof(final[0]));//show length of final array
//                                         after user's choice

	//give the passoword
	cout<<">> ";
	int f_tmp;
	for(int itr1=0;itr1<finalLen;itr1++){
		f_tmp=rand() % (sizeof(final)/sizeof(final[0])) + 0;
		cout<<final[f_tmp];
	}
	cout<<" <<";
}