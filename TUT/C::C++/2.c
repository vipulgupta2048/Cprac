#include <stdio.h>

int main()
{
	int year=0;
	printf("Enter year");
	scanf("%d",&year);
	if (year %400==0 || year%100 !=0 && year %4 ==0)
	{
		printf("Then it is a leap year");
	}
	return 0; 
}
