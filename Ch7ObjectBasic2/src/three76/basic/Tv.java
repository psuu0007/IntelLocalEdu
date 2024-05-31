package three76.basic;

// 추상클래스
public abstract class Tv {

	public String color;
	public boolean power;
	public int channel;

//	추상 메서드
	public abstract void caption();
//	주석을 덧붙여 어떤 기능을 수행할 목적으로 작성되었는지 알려 주고
	// 신입 이거 이렇게 이렇게 된거 회의 때 알지? 그대로 만들어
	
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
