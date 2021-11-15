/*let's find factorial*/
#include <iostream>
/*working....
success....*/
int main(){
	int n,f=1,i=1;
	std::cout<<"enter a number..\n";
	std::cin>>n;
	std::cin.clear();
	std::cin.ignore(1000,'\n');
	while(i<=n){
		f*=i;
		i++;
	}
	std::cout<<"factorial is "<<f<<std::endl;
}