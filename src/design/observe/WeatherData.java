package design.observe;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList observers;//��¼�۲���
	private float temperature;
	private float humidity;
	private float pressure;
	public WeatherData(){
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);//�¹۲���ע��,ֻ��ӵ�ArrayList��
		
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);//��ȡ��Ӧ�۲��ߵ��±�����
		if(i>=0){
			observers.remove(i);//�Ƴ���Ӧ�±�۲���
		}
		
	}
/*
 * ���ݸ���ʱ,֪ͨ���й۲���
 */
	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, temperature);
					
		}
		
	}
	public void measurementsChanged(){
		notifyObservers();
	}
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
