package two94;

public class Car2 {

	String color;
	String gearType;
	int door;

	Car2(){
		System.out.println("기본 생성자 호출됨");
	}
	
	Car2(String color, String gearType, int door){
		System.out.println("saddsfkkljsdf");
		
		System.out.println(this);
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void info() {
		System.out.println("car2의 정보");
		System.out.println(color);
		System.out.println(gearType);
		System.out.println(door);
	}
	
}
