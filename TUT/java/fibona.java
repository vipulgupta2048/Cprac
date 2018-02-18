/*
 * In fibonacci series,
 * Next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
 * The first two numbers of fibonacci series are 0 and 1.
 */

/*
 * The first program is without recursion


class fibona{
    public static void main (String args[]){
        int a = 0,b = 1, sum=0;
        System.out.print(a + "  , " + b);
        for (int i = 0; i<10; i++){
            sum = a + b;
            System.out.print(" , " + sum);
            a = b;
            b = sum;
        }
    }
}
*/

// With recursion.
class fibona{
    static int a = 0,b = 1, sum=0;
    static void algo (int count){
        if (count>0) {
            sum = a + b;
            System.out.print(" , " + sum);
            a = b;
            b = sum;
            algo(count - 1);
        }

    }

    public static void main (String args[]){
        int count = 10;
        System.out.print(a + "  , " + b);
        algo(count);
        }
}
