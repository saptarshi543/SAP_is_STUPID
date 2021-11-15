#include <string>
#include <iostream>
using namespace std;
/*working...
success...
this time takes string input with space...*/
int main(){
	cout<<"hello enter your name"<<endl;
	string name;
	char name2[100];
	getline(cin,name);
	cout<<"hello "<<name<<" where do you live?..\n";
	cin.getline(name2,100);
	cout<<"u live in "<<name2;
}