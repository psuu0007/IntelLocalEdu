package three57;

import three57.basic.Car;
import three57.basic.FireEngine;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = null;
//		소방차 1대
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		fe1.water();
		
		car = (Car)fe1;
//		car.water();
		
		fe2 = (FireEngine)car;
		fe2.water();
		
		
	}
	
	
}
