
abstract class Pen{
	abstract void penInk();
	abstract void penBody();
	
}

class Fountain_pen extends Pen {
	public void penInk(){
		System.out.println("Pen Ink : Blue...");
	}
	public void penBody(){
		System.out.println("Pen Body : Plastic...");
	}
	public void penName(){
		System.out.println("Pen Name : Fountain Pen...");

	}
	public static void main(String args[]){
		Pen p=new Fountain_pen();
		
		p.penName();// not allowed as not methods of pen class
		p.penInk();
		p.penBody();
	}
}