import java.util.Scanner;

class prime{
    public static void main (String args[]){
        Scanner pro = new Scanner(System.in);
        System.out.print("Enter a number");
        int x = pro.nextint();

        int lag = 0;
        int m = x/2;
        if (x == 0 || x == 1)
            {System.out.println("NOT PRIME");}
        else{
            for(int i=2;i<=m;i++){
                if(x%i==0){
                    System.out.println(x+" is not prime number");
                    lag=1;
                    break;
                }
            }
        if(lag==0){
            System.out.println(x+" is prime number");
        }}
    }
}
