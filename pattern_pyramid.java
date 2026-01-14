import java.util.*;
public class pattern_pyramid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int i,j,k,n;
  /*      System.out.println("Enter no of rows:");

        n=sc.nextInt();
*/
        for(i=1;i<=5;i++)
        {
            for(j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    float v=14;
        float u=10;
        float a=2;
        float s=99;
   float res=(v*v) - (u*u) / (2*a*s);
   System.out.println(res);
   res=(v*v-u*u)/(2*a*s);   System.out.println(res);

    }}