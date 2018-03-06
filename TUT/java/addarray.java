import java.util.Scanner;
class array{
    void get_array(){
        System.out.print("How big ? (Specify row and columns) ");
        Scanner pro = new Scanner(System.in);
        int n = pro.nextInt();
        int m = pro.nextInt();
        int arr[][] = new int[n][m];
    }

    void set_array(){
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.println("Enter element of row " +i+ " and column " +j);
                int x = pro.nextInt();
                arr[i][j] =  x;
            }
        }
    }
}

public class addarray{
    public static void main (String args[]){
        //Get and Set array objects here here
        System.out.println("-------------*** Addition of Arrays ***-----------------");
        array a1 = new array();
        array a2 = new array();
        array a3 = new array();

        //a1.get_array();
        //a1.set_array();

        //a2.get_array();
        //a2.set_array();

        //a3.get_array();

    }
}



//IMPLEMENT IN DATA PROTECTION WITH GET SET METHODS
