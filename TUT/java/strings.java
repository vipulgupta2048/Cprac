// No strings attached to the syllabus though

public class strings {

	public static void main (String args[]) {
        String str = "Vipul";
        String str4 = "Vipul";

        String str3 = new String("V");
        //public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        if (str.startsWith(str3 , 2)){
            System.out.println("ITS TRUEE");
        }else{System.out.println("ITS fALSE");}

        String str2 = new String(str);
        System.out.println(str2);
        System.out.println(str2.charAt(1));
        System.out.println(str2.length());
    }
}
