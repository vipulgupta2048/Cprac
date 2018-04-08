import java.util.*;
import java.lang.*;

public class vipuul{
    public static void main(String args[]) {
        int i=0,j=1,k=1;
        double s=0.0,p=1.0,q,r;

        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the values of q and r");
        q=s1.nextDouble();
        r=s1.nextDouble();
        for(i=1;i<=r;i++)
        {
            k=1;
            for(j=1;j<=(i*i);j++)
            {
               k*=j;
            }
            p=Math.pow(q,i);
            s+=p/k;
        }
        System.out.println("Sum of series ="+s);
    }
}
