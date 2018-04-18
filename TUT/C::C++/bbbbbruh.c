#include <stdio.h>

int main()
{
	int a,b;
	printf(" enter number ");
	scanf("%d",&a);
	b=a;
	int sum  =0;
	int c=0;
	while(b % 10 != 0)
	{
		int a=b%10;
		sum += a;
		printf(" %d",b%10);
		c = c * 10 +a ;
		b = b/10;
		
	}
	printf("\n the sum of the digits of integer is %d",sum);
	printf("\n%d",c);
	return 0;
}
/* 12345
 * 1+2+3+4+5
 * 
*/
