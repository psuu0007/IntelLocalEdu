package three54.basic;

public class Tv {

//		인스턴스 생성 표현식
//		클래스명 변수명;
//		변수명 = new 클래스명();

	public String color;
	public boolean power;
	public int channel;

	public void power() {
		power = !power;
	}

	public void channelUp() {
		channel++;
		System.out.println("채널 1증가");
	}
	
	public void channelDown() {
		channel--;
		System.out.println("채널 1감소");
	}
	
}
