import java.util.*;
public class vippul
{
    public int TravellerCode,No_of_travellers,No_of_buses;
    public String place;
    public vippul()
    {
        TravelCode=201;
        place="Nainital";
        No_of_travellers=10;
        No_of_buses=1;
    }
    public void NewTravel()
    {
        Scanner sc= new Scanner(System.in);
        TravellerCode=sc.nextInt();
        place=sc.next();
        No_of_travellers=sc.nextInt();

        if(No_of_travellers<=20)
        {
            No_of_buses=1;
        }
        else if(No_of_travellers>20 && No_of_travellers<=40)
        {
            No_of_buses=2;
        }
        else
        {
            No_of_buses=3;
        }
    }
    public void ShowTravel()
    {
        System.out.println("Travel Code: "+TravelCode);
        System.out.println("Place: "+place);
        System.out.println("Number of Travellers: "+No_of_travellers);
        System.out.println("number of Buses: "+No_of_buses);
        System.out.println(" ");
    }
    public static void main(String args[])
    {
        Travel t1= new Travel();
        t1.NewTravel();
        t1.ShowTravel();
    }
}
