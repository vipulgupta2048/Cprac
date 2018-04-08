import java.util.Scanner;
import java.lang.Math;

public class rad {

	public static void main (String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter something floaty");
        float a = keyboard.nextFloat();
        int b = (int)Math.round(a);
        System.out.println("Entered something - " +a);
        if (b>a){
            System.out.println("Smallest bigger than float - " +b);
        }
        else if (b<a){
            System.out.println("greatest smaller than float - " +b);
        }
        else
            System.out.println("The integer is equal to  - " +b);
    }
}

