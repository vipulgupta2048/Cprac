public class toy {
	public static void main (String args[]) {
        int arr[];
        int sum = 0;

        arr = new int[1000];
        for (int i=100;i<=200;i++){
            if (i%7==0){
                arr[i] = i;
                System.out.println("" +arr[i]);
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum is " +sum);
    }
}

