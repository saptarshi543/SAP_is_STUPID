#include <iostream>
int main(){/*working....
success...*/
std::cout<<"enter 2 number"<<std::endl;
int one,two;
std::cin>>one;
std::cin.clear();
std::cin.ignore(1000,'\n');
std::cin>>two;
std::cin.clear();
std::cin.ignore(1000,'\n');
std::cout<<"u entered.."<<one+two;
}