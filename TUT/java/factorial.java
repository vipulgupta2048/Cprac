import java.util.Scanner;

public class factorial {

	public  void main (String args[]) {
        double temp=1;
        System.out.println("Enter a number");
        Scanner pro = new Scanner(System.in);
        double x = pro.nextDouble();
        double fact = fact(x);

/*WITHOUT RECURSION (Do change the printing.)
        while(x>0){
        temp = temp * x;
        x--;
        }*/
        System.out.println("The factorial is " +fact);
    }

    public int fact(double x){
        if(x==0){return;}
        else{return(x * fact(x-1));}
    }
}
