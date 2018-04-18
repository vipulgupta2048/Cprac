#include <iostream>
using namespace std;
int factorial(int x);

int main()
{
	int a;
	cout<<"ENTER A NUMBER ";
	cin>>a;
	factorial(a);
	cout<<" the factorial is "<< factorial(a);
	return 0;
}
int factorial(int x)
{
	int fact=1;
	while (1<x)
	{
		fact = fact * x;
		x--;
	}
	return fact;
}
