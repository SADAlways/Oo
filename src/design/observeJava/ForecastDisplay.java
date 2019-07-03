package design.observeJava;

import java.util.Observable;
import java.util.Observer;

import design.observe.DisplayElement;

public class ForecastDisplay implements Observer,DisplayElement {

	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		observable.addObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Last pressure:"+lastPressure+",Current pressure:"+currentPressure);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData)o;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
		
	}

}
