import java.util.*;
public class pattern_90_right_aligned_replica
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int i,j,k,n;
  /*      System.out.println("Enter no of rows:");

        n=sc.nextInt();
*/
        for(i=1;i<=4;i++)
        {
            for(j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}