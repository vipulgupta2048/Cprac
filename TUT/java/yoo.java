import java.util.Scanner;
public class yoo {

	public static void main (String args[]) {
        System.out.print("Enter Marks ");
        Scanner keyboard = new Scanner(System.in);
        float a = keyboard.nextFloat();
        System.out.println("Entered Marks " +a);

        if (a>101||a<0){
            System.out.println("Error - Why you do this");
        }else if (a==100 || a>91){
            System.out.println("GRADE A");
        }else if (a==90 || a>81){
            System.out.println("GRADE B");
        }else if (a==80 || a>71){
            System.out.println("GRADE C");
        }else if (a==70 || a>61){
            System.out.println("GRADE D");
        }else {
            System.out.println("FAIL");
        }
	}
}

