/*Q8. WAP to input your full name and print its initials. Example:- if name is “Amit Kumar Singh” then print A.K.S*/

import java.util.*;
public class vipuuul{
    public static void main(String args[]) {
        String name;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = s1.nextLine();
        length(name.length(),name);

    }

    public static void length(int l, String name){
        System.out.println("");
        System.out.print("Initials of the name are: " +name.charAt(0)+ ". ");
        for (int i =0; i<l; i++) {
            char ch = name.charAt(i);
            if (ch == ' ') {
                System.out.print(name.charAt(i+1) + ".");
            }
        }
    }
}
