#include <stdio.h>

int main()
{
	int size;
	char std[20];
	
	printf("Enter size of string");
	scanf("%d",&size);
	printf("Enter string");
	scanf("%s",&std[size]);
	
	for (int i=0;i<size;i++)
	{
		scanf("%c[^\n]",&std[i]);
	}
	for (int i=0;i<size;i++)
	{
		printf("You entered %c\n",std[i]);
	}
	return 0;
}
