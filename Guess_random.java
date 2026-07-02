import java.util.*;

class Guess_random{
	int num;
	int user;
	Scanner sc=new Scanner(System.in);
	
	Guess_random(){
		int min=1,max=5;
		Random r=new Random();
		num = r.nextInt(max-min+1)+min;
	}
	public void take()
	{
		System.out.print("Enter number from 1 to 5 : ");
		user=sc.nextInt();
	}
	public void check()
	{
		if(num==user)
			System.out.print("You won ...");
		else
			System.out.print("Better luck next time...");
	}
	
	public static void main(String args[]){
		Guess_random g=new Guess_random();
		g.take();
		g.check();
	}
	
}