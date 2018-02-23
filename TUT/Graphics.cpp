#include<iostream.h>
#include<graphics.h>
#include<conio.h>
#include<math.h>
using namespace std;
void draw();

void main()
{   float a[3][3] = {1,0,0,0,1,0,0,0,1};
    int b[3][3] = {30,50,70,40,40,80,1,1,1};
    int c[5][5],m,n,p,q,i,j,k;
    int gd=DETECT,gm;
    initgraph(&gd,&gm,"C:\\TC\\BGI");
    cout<<"Enter rows and columns of first matrix:";
    cin>>m>>n;
    cout<<"Enter rows and columns of second matrix:";
    cin>>p>>q;

    if(n==p)
    {/*
    cout<<"\nEnter first matrix:\n";
    for(i=0;i<m;++i)
        for(j=0;j<n;++j)
        cin>>a[i][j];

    cout<<"\nEnter second matrix:\n";
    for(i=0;i<p;++i)
        for(j=0;j<q;++j)
        cin>>b[i][j];
      */
    cout<<"The matrix is:\n";
    for(i=0;i<m;++i)
    {
        for(j=0;j<q;++j)
        {
        c[i][j]=0;
        for(k=0;k<n;++k)
        c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
        cout<<c[i][j]<<" ";

        }
        cout<<"\n";
    }
    }

    else
    cout<<"\n Sorry!!! Matrix multiplication can't be done";

    clrscr();
    clearviewport();
    //algo don't touch
    line(100+c[0][0],100+c[1][0],100+c[0][1],100+c[1][1]);
    line(100+c[0][1],100+c[1][1],100+c[0][2],100+c[1][2]);
    line(100+c[0][2],100+c[1][2],100+c[0][0],100+c[1][0]);

    rerun:
    int e;
    cout<<"What do u want to do (1-translation|2-rotation|3-scaling)";
    cin>>e;

// Translating by whatever units you need
    if (e==1){
    int tx,ty;
    cout<<"Enter the value of tx and ty";
    cin>>tx>>ty;
    a[0][2]=tx;
    a[1][2]=ty;
    draw();
    }

// Rotating by whatever angle you need
    else if (e==2){
    float r,d;
    cout<<"Enter angle to be rotated in degrees";
    cin>>r;
//When negative then it is in the fourth quad thus everything you do is opposite. THEREFORe +ve is clockwise  and -ve is anticlockwise
    d = (r*3.14)/180;

    a[0][0] = cos(d);
    a[0][1] = -1*sin(d);
    a[1][0] = sin(d);
    a[1][1] = cos(d);
    draw();
    }

// Scaling by whatever size you want
    else if (e==3){
    int q;
    cout<<"Okay, how big (or small) do you want it to be?";
    cin>>q;
    a[0][0] = q;
    a[1][1] = q;
    draw();
    }

    else{return;}
    char g;
    cout<<("TRY AGAIN (Y|N)");
    cin>>g;
    while(g=="y"||g == "Y")
    {goto rerun:}
    else{return;}
}

    void draw(){
    cout<<"\n The new matrix after translation/rotation/scaling is: \n";
    for(i=0;i<m;++i)
    {
        for(j=0;j<q;++j)
        {
        c[i][j]=0;
        for(k=0;k<n;++k)
        c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
        cout<<c[i][j]<<" ";
        }
        cout<<"\n";
    }
    setcolor(GREEN);
    line(100+c[0][0],100+c[1][0],100+c[0][1],100+c[1][1]);
    line(100+c[0][1],100+c[1][1],100+c[0][2],100+c[1][2]);
    line(100+c[0][2],100+c[1][2],100+c[0][0],100+c[1][0]);
    getch();
}

