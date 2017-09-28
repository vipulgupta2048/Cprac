#include <stdio.h>

int main()
{
	int a,d,x;
	int* b = &a;
	int* c = &d;
	printf("enter 2 numbers");
	scanf("%d%d",&a,&d);
	x = *b;
	*b = *c;
	*c = x;
	printf("number is %d and %d \n",*b,*c);
	//printf ("\n%d",&a);
	return 0;
}
	
/*   pt = &arr1[n - 1];
 printf("\n The elements of array in reverse order are :");

   for (i = n; i > 0; i--) 
   {
      printf("\n element - %d : %d  ", i, *pt);
      pt--;
   }
   
         

void findFact(int n,int *f)
		{
        int i;

       *f =1;
       for(i=1;i<=n;i++)
       *f=*f*i;
       }

   */
