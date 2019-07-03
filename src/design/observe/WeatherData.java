package design.observe;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList observers;//记录观察者
	private float temperature;
	private float humidity;
	private float pressure;
	public WeatherData(){
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);//新观察者注册,只需加到ArrayList后
		
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);//获取对应观察者的下标索引
		if(i>=0){
			observers.remove(i);//移出对应下标观察者
		}
		
	}
/*
 * 数据更新时,通知所有观察者
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
