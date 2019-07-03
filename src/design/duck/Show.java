package design.duck;
/**
 * 策略模式:创建行为族,以行为类实现行为族接口的方式封装成行为组件,提高维护性,复用性.
 * @author Administrator
 *
 */
public class Show {
	Duck duck;
	public void show(Duck duck){
		duck.setFly(new FlyWithRocket());
		duck.performFly();
		duck.setQuack(new Quack());
		duck.performQuack();
		
	}

	public static void main(String[] args) {
		Show show = new Show();
		show.show(new RubberDuck());
		

	}

}
