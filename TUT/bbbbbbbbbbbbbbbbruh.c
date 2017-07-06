#include <stdio.h>
void hello(char* name)
{
	printf("HELL0 %s \n",name);
}

int sum(int a, int b)
{
	return a+b;
}
int main()
{ 
	void (*ptr)(char*);
	int  (*lol)(int,int);
	ptr = &hello;
	lol = sum;
	ptr("SImino");
	int q = lol (12,13);
	printf("The sum is %d",q);
	return 0;
}

/*f2p = sum;
    int op1 = f2p (10, 13);
    int op2 = sum (10, 13);
*/
