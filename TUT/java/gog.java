import java.util.Scanner;
public class gog {

	public static void main (String args[]) {
        System.out.print("Enter digit ");
        Scanner keyboard = new Scanner(System.in);
        float a = keyboard.nextFloat();
        float b = a + a;
        float c = a * a;
        System.out.println("Sum is " +b);
        System.out.println("Product is " +c);

	}
}

