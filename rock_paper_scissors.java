import java.util.*;
public class rock_paper_scissors {
    public static void main(String[] args) {
        int min = 1, max = 3;
        String ch;    
    Scanner sc=new Scanner(System.in);
        int randomNumber = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Enter your turn (rock,paper,scissors): ");
        ch=sc.next();    
        if(ch.equalsIgnoreCase("rock"))
        {
            if(randomNumber==1)
            {
                System.out.println("Tie");
            }
            else if(randomNumber==2)
            {
                System.out.println("Computer chose paper. You lose");
            }
            else
            {
                System.out.println("Computer chose scissors. You win");
            }
        }   
       else if(ch.equalsIgnoreCase("paper"))
        {
            if(randomNumber==2)
            {
                System.out.println("Tie");
            }
            else if(randomNumber==1)
            {
                System.out.println("Computer chose rock. You win");
            }
            else
            {
                System.out.println("Computer chose scissors. You lose");
            }
        }  
      else if(ch.equalsIgnoreCase("scissors"))
      {
        if(randomNumber==3)
            {
                System.out.println("Tie");
            }
            else if(randomNumber==2)
            {
                System.out.println("Computer chose paper. You win");
            }
            else
            {
                System.out.println("Computer chose rock. You lose");
            }
      }
      else{
        System.out.println("Enter valid choice");
      }
    }
}
