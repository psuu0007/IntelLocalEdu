package two94;

public class Car {

	String color;
	String gearType;
	int door;
	
//	생성자
//	기본(default) 생성자
	Car(){
		System.out.println("기본 생성자 호출됨");
	}
	
//	매개변수
//	생성자?
	Car(String c, String g, int d){
		System.out.println("다른 생성자 호출됨");
		System.out.println("인스턴스 변수를 초기화 한다");
		color = c;
		gearType = g;
		door = d;
	}
	
}
