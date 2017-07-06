#include <stdio.h>

int main()
{
	int a,b,num, mult;
	printf(" enter number and multiplier ");
	scanf("%d%d",&num,&mult);
	a=1;
	b=num;
	while (a<mult)
	{
		num = num + b;
		a++;
	}
	printf("the product is %d",num );
	return 0;
}
