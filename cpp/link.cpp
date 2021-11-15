/*google creates random links without offensive words in it...lets try that out
working....success...
it sometimes gives an upward arrow in the link...*/
#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>
#include <random>
using namespace std;
int random(int from, int to){
    return rand() % (to - from + 1) + from;
}
int main(){
	srand(time(0));
	cout<<"generating link..\n";
	string f="";
	char container[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	for(int i=0;i<12;i++){
		if(i==3 || i==8){
			f+='-';
		}
		else{f+=container[random(0,(sizeof(container)/sizeof(container[0])))];}
	}
//	cout<<(sizeof(container)/sizeof(container[0]))<<endl;
	cout<<f;
}