package ch8.exam1;

public class ChildAnswer extends Parent{

	public ChildAnswer() {
		// TODO Auto-generated constructor stub
	}
	
	public ChildAnswer(int a, int b){
		super(a, b);
	}
	
	// 부모클래스의 void add(int a, int b)를 재정의 한다면?
	@Override
	void add(int a, int b) throws InvalidNumberException, NotANumberException {
		// TODO Auto-generated method stub
		
//		super.add(a, b);
		System.out.println("자식의: " + a + b);
		
	}
	
	
}
