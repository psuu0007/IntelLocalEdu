
public class TvTest {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		
		tv.channel = 7;
		
		tv.channelDown();
		tv.channelUp();
		
		System.out.println("현재 채널은 " + tv.channel + " 입니다");
	}
	
}
