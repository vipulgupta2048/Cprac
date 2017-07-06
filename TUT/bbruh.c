#include <stdio.h>

int main()
{
	int x=1,a=0;
	int power,base,product;
	printf("enter base");
	scanf("%d",&base); 
	printf("enter power ");
	scanf("%d",&power);
	product = base ;
	while(x < power)
	{
	base = base * product ; 
	x++;
	}
	printf("The thing is equal to %d",base);
	return 0;
	
}
