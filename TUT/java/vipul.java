// Q7. WAP to input a string and count only those words that starts with uppercase vowel. Example:- if string is “Carry An Umbrella” then o/p is:- 2

import java.util.*;

public class vipul {
    public static void main(String m[]){
        Scanner a = new Scanner(System.in);
        String b = new String();
        System.out.print("Enter line: ");
        b = a.nextLine();
        uvowel(b);
    }

    public static void uvowel(String b){
        int letters =0;
        for(int i=0;i<b.length();i++)
        {
            char vowel=b.charAt(i);
            if(vowel=='A' || vowel=='E' || vowel=='I' || vowel=='O' || vowel=='U'){letters++;}
        }
        System.out.println("total number of words start with Uppercase Vowel letters are : "+letters);

    }

}


