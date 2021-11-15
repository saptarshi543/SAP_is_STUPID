#include<iostream>//success...
int main(){//working...
	std::cout<<"enter number of entries...we will find addition"<<std::endl;
	int n;
	std::cin>>n;
	std::cin.clear();
	std::cin.ignore(1000,'\n');
	int w[n];
	for (int i = 0; i < n; i++)
	{
		std::cin>>w[i];
	}
	int sum=0;
	for(int o=0;o<((sizeof(w))/(sizeof(w[0])));o++){
		sum+=w[o];
	}
	std::cout<<"sum is = "<<sum<<std::endl;
}