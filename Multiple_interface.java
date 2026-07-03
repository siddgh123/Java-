interface one
{
    void meth_one();
}
interface two extends one
{
    void meth_two();
}
public class Multiple_interface implements one,two
{
    public void meth_one(){
        System.out.println("Interface one...");
    }
    public void meth_two(){
        System.out.println("Interface two...");
    }
	public static void main(String[] args) {
	
	    System.out.println("Multiple inheritance by Interfaces");
	   Multiple_interface m=new Multiple_interface();
	   m.meth_one();
	   m.meth_two();
	    
	}
}