
/* Armstrong number is when example
 * 153
 *
 * 1^3 + 5^3 + 3^3 = 153
 * Thus is a Armstrong Number
 */


import java.util.Scanner;
public class armisstrong {
    public static void main (String args[]) {
		try{
            int m,temp,sum =0 ;
            System.out.println("----------* Program to test Armstrong Number *---------- ");
            System.out.print("Enter a number = ");
            Scanner pro = new Scanner(System.in);
            int x = pro.nextInt();
            m = x;

            while(m>0){
                temp = m%10;
                sum = sum + temp*temp*temp;
                m = m/10;
                temp = 0;
            }
            if (x==sum){System.out.println("Number is an Armstrong Number");}
            else{System.out.println("Number is not an Armstrong Number");}
        }
        catch(ArithmeticException e){
            System.out.println("You multiplied something wrong there for a moment" +e);
            System.out.println("PROGRAM ENDED with errors");
            }
        finally{
            System.out.println("PROGRAM ENDED");

        }
    }
}
