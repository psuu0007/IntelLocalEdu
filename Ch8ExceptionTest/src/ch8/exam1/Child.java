package ch8.exam1;

public class Child extends Parent{

	public Child() {
		// TODO Auto-generated constructor stub
	}
	
	public Child(int a, int b){
		super(a, b);
	}
	
	// 부모클래스의 void add(int a, int b)를 재정의 한다면?
	void add(int a, int b) {
		System.out.println("부모의: " + a + b);
	}
	
}
