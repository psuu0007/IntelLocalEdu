package two38;

public class Tv {

//		인스턴스 생성 표현식
//		클래스명 변수명;
//		변수명 = new 클래스명();

	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
		System.out.println("채널 1증가");
	}
	
	void channelDown() {
		channel--;
		System.out.println("채널 1감소");
	}
	
}
