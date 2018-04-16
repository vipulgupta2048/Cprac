public class demo_throw throws NullPointerException{
    public static void threw(){
        try{
        throw new NullPointerException("Gotta catch them all");
        }
        catch(Exception e){
            System.out.println("Catched DEMO in threw ");
        }
    }

    public static void main(String args[]){
        demo_throw d = new demo_throw();
        try{
            d.threw();

            throw new NullPointerException("Gotta catch them all");
        }
        catch(Exception e){
            System.out.println("Got it again in main: " +e);
        }

    }

}
