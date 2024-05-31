package three81.basic;
//						구현하다
public class CaptionTv implements Tv{
//	The type CaptionTv must implement the inherited abstract method Tv.power()

	public void power() {
//		power = !power;
		System.out.println(POWER);
	}
	
	public void channelUp() {
//		channel++;
		System.out.println(CHANNEL);
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("mp3 음악 재생");
	}

	@Override
	public void recordMovie() {
		// TODO Auto-generated method stub
		System.out.println("영상 녹화");
	}
	
}
