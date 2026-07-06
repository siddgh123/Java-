class Monkey{
	public void jump(){
		System.out.println("monkey Jumped...");	
	}
	public void bite(){
		System.out.println("Monkey bites...");	
	}
}

interface BasicAnimal{
	public void eat();
	public void sleep();
}

class Human extends Monkey implements BasicAnimal{
	public void eat(){
		System.out.println("Eating...");
	}
	public void sleep(){
	    System.out.println("Sleeping...");
	}
	public static void main(String args[]){
		Monkey m=new Human();
		m.jump();
		m.bite();
		
		BasicAnimal b=new Human();
		b.eat();
		b.sleep();
	}
}