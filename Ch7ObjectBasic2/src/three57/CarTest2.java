package three57;

import three57.basic.Ambulance;
import three57.basic.Car;
import three57.basic.FireEngine;

public class CarTest2 {

	public static void main(String[] args) {
		
		Car car = null;
//		소방차 1대
		FireEngine fe1 = new FireEngine();
		Ambulance am1 = null;
		
		fe1.water();
		
		car = (Car)fe1;
//		car.water();
		
//		명식적 형변환
		am1 = (Ambulance)car;
//		class three57.basic.FireEngine cannot be cast to 
//		class three57.basic.Ambulance 
//		(three57.basic.FireEngine and three57.basic.Ambulance are 
//				in unnamed module of loader 'app')
		
		am1.siren();
		
		
		
		
	}
	
	
}
