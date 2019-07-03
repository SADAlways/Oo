package design.duck;

public class MuteQuack implements QuackPerformance{

	@Override
	public void quack() {
		System.out.println("<Silence>");
		
	}

}
