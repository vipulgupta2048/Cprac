#include <iostream>
using namespace std;

class ratio{
	public:
	ratio(){cout<<"CONSTRUCTOR \n";}
	~ratio(){cout<<"DESTRUCTOR  \n";}
	private:
	int num,den;
};

int main()
{
	ratio x;
	cout<<"the is alive \n";
	return 0;
} 

