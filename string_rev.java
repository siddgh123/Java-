import java.util.*;
public class string_rev
{
public static void main(String args[])
{
    
    Scanner sc=new Scanner(System.in);
String str;
    System.out.print("Enter a string : ");
    str=sc.nextLine();
    String rev="";
    for(int i=str.length()-1;i>=0;i--)
    {
        rev=rev+str.charAt(i);
    }
    System.out.println(rev);

//print substring of eavry string from 3 to 6 th index 
  /* System.out.println("Enter String: "); 
   String s=sc.nextLine();
   System.out.println(s.substring(2,6));*/

   String s="hello";
    String s1="hello";
    if(s==s1)
    {
System.out.println("Same");
    }

}


}