#include <stdio.h>
void build(int rows,int col,int ar[][3]);

int main()
{
	int ar1[2][3];
	int ar2[2][3]; 
	int ar3[2][3];
	build (2,3,ar1);
	build (2,3,ar2);

	int i,j;
	printf("The sum of the 2 Arrays are :- \n ");
	for (i=0;i<2;i++)
	{
		for (j=0;j<3;j++)
		{
			ar3[i][j] = ar2[i][j] + ar1[i][j];
			printf("%d ",ar3[i][j]);
		}
		printf("\n");
	}
	return 0;
}

void build(int rows,int col,int ar[][3])
{
	int i,j;
	for (i=0;i<rows;i++)
	{
		for(j=0;j<col;j++)
		{
			printf(" Enter element of row %d and coloumn %d ",i,j);
			scanf("%d",&ar[i][j]);
		}
	}
	for (i=0;i<2;i++)
	{
		for(j=0;j<3;j++)
			printf(" %d ",ar[i][j]);
		printf("\n");
	}
	
}

 
