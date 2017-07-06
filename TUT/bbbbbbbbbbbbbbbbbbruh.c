#include <stdio.h>

int add(int n,int m)
{
	return m+n;
}

int sub(int n,int m)
{
	return m-n;
}

int main()
{
	int input;
	int a,b;
	int (*op)(int ,int);
	
	printf(" enter the op (add=0/ sub=1)");
	scanf("%d\n",&input);
	
	if (input==0)
		op = &add;
	else if (input == 1)
		op = &sub;
	
	else 
	{
		printf("****ERROR****");
		return;
	}
	
	printf("enter a number");
	scanf("%d",&a);
	printf("enter a number");
	scanf("%d",&b);
	
		
	int res = op(a,b);
	printf("result is = %d",res);
	
	return 0;
}

