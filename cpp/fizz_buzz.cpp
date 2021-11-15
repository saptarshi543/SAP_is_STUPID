#include <iostream>
// working....
void buzzFizz(int upper_bound,int lower_bound,int arg1,int arg2){
	for (int i = lower_bound; i <=upper_bound; i++){
		if((i%arg1==0)&&(i%arg2==0)){
			std::cout<<"FizzBuzz"<<std::endl;
		}
		else if(i%arg1==0){std::cout<<"Fizz"<<std::endl;}
		else if(i%arg2==0){std::cout<<"Buzz"<<std::endl;}
		else{std::cout<<i<<std::endl;}
	}
}
int main(){
	std::cout<<"enter upper bound,lower bound, arg1 ,arg2\n arg are the numbers of which multiples will be checked"<<std::endl;
	int upp,lower,a1,a2;
	std::cin>>upp;
	std::cin>>lower;
	std::cin>>a1;
	std::cin>>a2;
	buzzFizz(upp,lower,a1,a2);
}