#include <stdio.h>
void cube();
void lol(int a);
int main()
{
	cube();
	cube();
	cube();
	lol(10);
	return 0;
}
void cube()
{
	int a;
	scanf("%d",&a);
	printf("The cube is = %d",a*a*a);
	//return a*a*a;
}
void lol (int a)
{
	
	if (a>0)
		printf(" a is greater than 0");
	else 
		printf("a is smaller than 0");
	printf("a is  =%d",a);
}
	

