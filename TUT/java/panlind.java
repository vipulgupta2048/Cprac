import java.util.Scanner;
public class panlind{
        public static void main (String args[]) {
            int a,r,sum =0;
            Scanner pro = new Scanner(System.in);

            System.out.println("Enter a number to be tested for Panlindrome");
            int x = pro.nextInt();

            while (x>0){
                r = x%10;
                sum = (sum *10) + r;
                x = x/10;
                }

            if (x==sum){System.out.println("Panlindrome");}
            else{System.out.println("NOT Panlindrome");}
        }
    }


