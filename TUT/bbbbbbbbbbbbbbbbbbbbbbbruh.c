#include<stdio.h>

void sum (int num1, int num2)
{
    return num1+num2;
}
int main()
{
    void (*f2p) (int, int);
    f2p = sum;
    int op1 = f2p (10, 13);
    int op2 = sum (10, 13);

    printf("Output 1 – for function call via Pointer: %d \n",op1);
    printf("Output2 – for direct function call: %d \n", op2);

    return 0;
}

