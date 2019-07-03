package design.duck;

public abstract class Duck {
	protected FlyPerformance f;
	protected QuackPerformance q;
	public Duck() {
		// TODO Auto-generated constructor stub
		display();
	}
	public abstract void display();
	public void performFly(){
		f.fly();
	}
	public void performQuack(){
		q.quack();
	}
	public void swim(){
		System.out.println("All ducks float");
	}
	public void setFly(FlyPerformance fp){
		f = fp;
	}
	public void setQuack(QuackPerformance qp){
		q = qp;
	}

}
