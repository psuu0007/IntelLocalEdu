package ch7.polyAnswer.product;

public class Tv extends Product {
	public Tv() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 한다.
	}
	
	public void use() {
		System.out.println("tv 시청 중");
	}

	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
		return "Tv";
	}
}
