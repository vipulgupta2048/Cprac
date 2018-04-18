#include <stdio.h>
int factorial(int n)

int main()
{
	int a;
	a= factorial(5);
	printf("%d",a;
	return 0;
}

int factorial(int n)
{
	if (n==1){
		return 1;}
	else{ 	
		return n * factorial (n-1);}
	 
}
