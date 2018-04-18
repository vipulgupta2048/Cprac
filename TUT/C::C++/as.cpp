#include <iostream>
using namespace std;

class B{
	int a;
public:
	int b;
	void set_ab();
	int get_ab(void);
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
int B::get_ab()
{
	return a;
}
void B :: show_a(void)
{
	cout<<"HEY here goes a"<<a<<;
}
//--------------------------------------------------

int main(){
	D z;
	return 0;
}
