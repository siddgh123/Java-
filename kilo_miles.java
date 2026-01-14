import java.util.*;
public class kilo_miles{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double kilometers,miles;
        System.out.println("Kilometer to Miles conversion");
        System.out.println("Enter Kilometer: ");
        kilometers=sc.nextDouble();
        miles=kilometers *  0.621371;
         System.out.println("Miles = "+miles);
       

    }

}