#include <stdio.h>

int main()
{
	int n =10;
	int* pn;
	pn = &n;
	
	printf("Value of n is %d\n",n);
	printf("address of n is %d\n",&n );
	printf("address of n is %d\n",pn);
	printf("value of n is %d\n",*(&n));
	printf("address of pn is %d\n",&pn);
	printf("value of pn is %d \n",*pn);
	
	printf("\n ******************** \n");
	
	float f;
	float* pf;
	pf = &f;
	f= 10.22;
	printf("Value of f is %f\n",f);
	printf("address of f is %d\n",&f );
	printf("address of f is %d\n",pf);
	printf("value of f is %f\n",*(&f));
	printf("address of pf is %d\n",&pf);
	printf("value of pf is %f \n",*pf);
	
	printf("\n ******************** \n");
	
	char c;
	char* pc;
	pc = &c;
	c = 'A';
	printf("Value of c is %c\n",c);
	printf("address of c is %d\n",&c );
	printf("address of c is %d\n",pc);
	printf("value of c is %c\n",*(&c));
	printf("address of pc is %d\n",&pc);
	printf("value of pc is %c \n",*pc);
	
	return 0;
}

