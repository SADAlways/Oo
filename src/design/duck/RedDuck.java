package design.duck;

public class RedDuck extends Duck{
	
	public RedDuck() {
		// TODO Auto-generated constructor stub
		q = new Quack();
		f = new FlyWithWings();
	}
	public void display(){
		System.out.println("I'm a Redduck!");
	}

}
