package design.duck;
/**
 * ����ģʽ:������Ϊ��,����Ϊ��ʵ����Ϊ��ӿڵķ�ʽ��װ����Ϊ���,���ά����,������.
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
