//test file...
#include <iostream>
#include <random>
/*looks like though it generates a random no. after copiling the no. stays the same..
to get a new no. we have to re-compile it again...*/
int random(int from, int to){
    return rand() % (to - from + 1) + from;
}

int main(){
	std::cout<<random(0,100);
}