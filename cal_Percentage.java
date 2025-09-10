/*Calculate percentage of CBSE student of his 5 sybject accept marks from user*/
import java.util.*;
public class cal_percentage{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,m4,m5,sum;
        float percentage;
        System.out.println("Enter Marks Subject 1: ");
        m1=sc.nextInt();
        System.out.println("Enter Marks Subject 2: ");
        m2=sc.nextInt();
        System.out.println("Enter Marks Subject 3: ");
        m3=sc.nextInt();
        System.out.println("Enter Marks Subject 4: ");
        m4=sc.nextInt();
        System.out.println("Enter Marks Subject 5: ");
        m5=sc.nextInt();
        percentage=((m1+m2+m3+m4+m5)/500.0f) * 100 ;
        System.out.println("CBSE Board ");
        System.out.println("Percentage = "+percentage);

    }

}