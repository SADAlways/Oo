package design.observe;

public interface Subject {
	public void registerObserver(Observer o);//注册观察者
	public void removeObserver(Observer o);//移出观察者
	public void notifyObservers();//通知观察者
}
