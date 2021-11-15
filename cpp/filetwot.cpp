#include <iostream>
#include <string>
#include <fstream>
int main(){
	//working...success..
	std::string text,target;
	std::cout<<"we will read from a file \n enter file location"<<std::endl;
	std::cin>>target;
	std::ifstream myfile(target);
	while(getline(myfile,text)){
		std::cout<<text<<std::endl;
	}
	myfile.close();
}