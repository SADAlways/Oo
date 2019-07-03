package design.duck;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		// TODO Auto-generated constructor stub
		q = new MuteQuack();
		f = new FlyNoWay();
	}
	public void display(){
		System.out.println("I'm a Modelduck!");
	}
	
}
