#include <iostream>
using namespace std;

class B{
	int a;
public:
	int b;
	
	void set_ab();
	int get_a(void);
	void show_a(void);
};

class D : public B{
	int c;
public:
	void mul(void);
	void display(void);
};
//--------------------------------------------------
void B::set_ab(void)
{
	a = 10; 
	b = 11;
} 
int B::get_a()
{
	return a;
}
void B :: show_a(void)
{
	cout<<"HEY here goes a = "<<a;
}
void D :: mul()
{
	c = b * get_a();
}
void D :: display()
{
	cout<<"a ="<<get_a()<<"\n""\n";
	cout<<"b ="<<b<<"\n";
	cout<<"c ="<<c<<"\n";
}
//--------------------------------------------------

int main(){
	D z;
	z.set_ab();
	z.mul();
	z.show_a();
	z.display();

	z.b = 20;
	z.mul();
	z.display();

	return 0;
}


