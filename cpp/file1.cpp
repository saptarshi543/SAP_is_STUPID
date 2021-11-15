#include <iostream>
#include <fstream>
#include <string>
int main(){
	std::string user,toWrite;
	std::cout<<"we will write to a file.."<<std::endl<<"enter file location.."<<std::endl;
	std::cin>>user;
	ofstream myFile(user);
	std::cout<<"what do you want to write?"<<std::endl;
	std:cin>>toWrite;
	myFile<<toWrite;
	myFile.close();
}