package design.duck;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		// TODO Auto-generated constructor stub
		q = new Squeak();
		f = new FlyNoWay();
	}
	public void display(){
		System.out.println("I'm a Rubberduck!");
	}

}
