#include <stdio.h>

int main()
{
	int n;
	int a[n];
	//collection of variables having same names  and same data types.
	// 5 indicates the size of the aray 
	// it now stores 5 elements
	printf(" How many elements do you need ");
	scanf("%d",&n);
	int i,sum=0;
	for (i=0;i<n;i++){  
		printf("enter element for the array :");
		scanf("%d",&a[i]);
		sum = sum + a[i];
		printf(" The array has the following elements :- %d\n",a[i]);
	}
	printf("\n sum of the array is = %d",sum);
	return 0;
}

 
