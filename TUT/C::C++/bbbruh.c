#include <stdio.h>

int main()
{
	int a,x=0,b;
	printf("enter a number whose factorial needs to be found ");
	scanf("%d",&a);
	b=1;
	x=a;
	while (x>1)
	{
		b *= x;
		x--;
	}
	printf("the factorial of %d is %d",a,b);
	
	return 0;
}
