#include <iostream>
using namespace std;

class Ratio{
public:
	void assign (int, int);
	double convert();
	void invert();
	void print();
private:
	int num, den; 
};

int main()
{
	Ratio x;
	x.assign(22,7);
	cout<< " x= " ;x.print();
	cout<<"="<< x.convert() << endl;
	x.invert();
	cout<< " the inverted fraction is = "; x.print();

}


void Ratio::assign(int nume, int deno){
	num = nume;
	den = deno;
} 

double Ratio::convert(){
	return double(num)/den;
}

void Ratio::invert(){
	int temp;
	temp = num;
	num = den;
	den = temp;
}

void Ratio::print(){
	cout<<num <<'/'<<den ;
}

