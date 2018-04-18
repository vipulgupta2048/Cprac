#include <stdio.h>
void increment(int ar[], int len);
void a(int ar[],int len);

int main()
{
	int ar1[] = {1,2,3,4,5};
	a(ar1,5);
	int ar2[] ={1,2,3,4,5,6,7,8,9};
	increment(ar2,9);
	a(ar2,9);
	return 0;njnj
}
void a(int ar[],int len)
{
	for (int i=0;i<len;i++)
	{
		printf("%d",ar[i]);
	}
	printf("\n");
	
}
void increment(int ar[], int len)
{
	for (int i=0;i<len;i++)
		ar[i]++;
}
