package design.duck;

public class FlyWithRocket implements FlyPerformance{

	@Override
	public void fly() {
		System.out.println("I'm fly with a rocket!");
	}

}
