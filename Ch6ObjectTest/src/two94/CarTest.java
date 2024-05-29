package two94;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car();

		car1.color = "white";
		car1.gearType = "auto";
		car1.door = 4;

		System.out.println("car1의 정보");
		System.out.println(car1.color);
		System.out.println(car1.gearType);
		System.out.println(car1.door);

		System.out.println();
		System.out.println();

		Car car2 = new Car("블랙", "수동", 4);


		System.out.println("car2의 정보");
		System.out.println(car2.color);
		System.out.println(car2.gearType);
		System.out.println(car2.door);
	}

}
