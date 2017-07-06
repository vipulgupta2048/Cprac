#include <stdio.h>

int n;
double d;
void* add_int(void *px,void *py)
{
	int *p1 = (int*) px;
	int *p2 = (int*) py;
	n = (*p1 + *p2);
	return &n;
}
void* add_double(void *px,void *py)
{
	double *p1 = (double*)px;
	double *p2 = (double*)py;
	d = *p1 + *p2;
	return &d;
}
void* processing(void *pa,void *pb,void* (*operation)(void*,void*))
{
	void *res= operation(pa,pb);
	return res;
}
int main()
	{
	void* (*op)(void*,void*);
	op = add_double;
	double n1,n2;
	n1 =10; n2 =12;
	double *pd = (double*)processing(&n1,&n2,op);
	printf ("%f",*pd);
	
	void* (*op2)(void*, void*);
	op2 = add_int ;
	int m1,m2;
	m1 = 10; m2 = 11;
	int *pi = (int*)processing(&m1,&m2,op);
	printf("\n %d",*pi);
	
	return 0;
	}


