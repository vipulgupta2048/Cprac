#include <stdio.h>

struct dob 
{
	int day;
	int month;
	int year;
};
struct Person
{
	char name[30];
	int age;
	char address[50];
	struct dob d1;
};

int main()
{
	struct Person p1;
	printf("Enter name: ");
	gets(p1.name);
	printf("Enter Age: ");
	scanf("%d",&p1.age);
	
	printf("Enter address: ");
	scanf("%c",&p1.address);
	gets(p1.address);
	
	
	printf("Enter date of birth(DOB)(dd/mm/yyyy):");
	scanf("%d%d%d",&p1.d1.day,&p1.d1.month,&p1.d1.year);
	printf("The person named %s of %d age stays at %s and was born on %d/%d/%d in the republic of INDIA",p1.name,p1.age,p1.address,p1.d1.day,p1.d1.month,p1.d1.year);
	return 0;
}

