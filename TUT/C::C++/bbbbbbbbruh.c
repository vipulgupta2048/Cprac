#include <stdio.h>

int main()
{
	int n1,n2;
	char c;
	printf(" CALCULATOR BITCH \n");
	printf("Enter a operator =");
	scanf("%c",&c);
	printf("\n Enter the 2 numbers = ");
	scanf("%d%d",&n1,&n2);
	
	if (c=='+'){
		printf("Sum of the 2 number is %d + %d = %d",n1,n2,n1+n2);}
	//else if (c == '')
		
	
	
	return 0;
}

