import java.util.*;
class tax_cal
{
    public static void main(String args[])
    {
       double income;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter salary: ");
       income=sc.nextDouble();
       double tax=0;
       if(income<=250000)
       {
        tax=0;
       }
       else if(income>250000 && income<=500000)
       {
          tax=(income-250000)*0.05f;

       }
       else if(income>500000 && income<=1000000)
       {
            tax=(500000-250000)*0.05f;
            tax=tax+(income-500000)*0.2f;
       }
       else{

            tax=(500000-250000)*0.05f;
            tax=tax+(1000000-500000)*0.2f;
            tax=tax+(income-1000000)*0.3f;
       }
        System.out.format("Tax to be paid : %.2f",tax);
    }
}