package ch7.polyAnswer.product;

public class Computer extends Product {
	public Computer() {
		super(200);
	}

	public void use() {
		System.out.println("com을 사용 중");
	}
	
	public String toString() {
		return "Computer";
	}
}
