#include <stdio.h>

int main()
{
	int a,b=0,pro,c;
	printf("Enter a number whose table neds to be found = ");
	scanf("%d",&a);
	printf(" How long = ");
	scanf("%d",&c);
	printf("THE multiplication table for %d :-",a);
	while(b != c+1)
	{
		pro = a*b;
		printf("\n %d * %d = %d",a,b,pro);
		b++;
	}
	
	return 0;
}

/* 1*1
 * 1*2
 * 1*3
 * 
 * 
 * 1*10
 
 * 
 * */
