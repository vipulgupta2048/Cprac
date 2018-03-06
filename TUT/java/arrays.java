public class arrays{
    public static void main (String args[]){
        //Get and Set array objects here here
            System.out.println("-------------*** Addition of Arrays ***-----------------");
            int a[][] =
            a[][] = {{1,1,1},{1,1,1},{1,1,1}};
            b[][] = {{1,1,1},{1,1,1},{1,1,1}};
            int c[][] = new int[3][3];

            for (int i = 0; i<3; i++){
                for (int j = 0; j<3; j++){
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("The Result of the addition is ");

            for (int i = 0; i<3; i++){
                for (int j = 0; j<3; j++){
                    System.out.print(c[i][j]);
                }
            }
    }
}
//IMPLEMENT IN DATA PROTECTION WITH GET SET METHODS
