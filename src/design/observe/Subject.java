package design.observe;

public interface Subject {
	public void registerObserver(Observer o);//ע��۲���
	public void removeObserver(Observer o);//�Ƴ��۲���
	public void notifyObservers();//֪ͨ�۲���
}
