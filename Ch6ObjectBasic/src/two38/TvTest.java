package two38;

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		
		Tv tv2 = new Tv();

		System.out.println("tv1의 채널값은 " + tv.channel + " 입니다");
		System.out.println("tv2의 채널값은 " + tv2.channel + " 입니다");
		
//		어떤 tv의 설정을 그래도 다른 tv에 적용하고 싶다
//		tv2 = tv;
		tv.channel = 8;
		System.out.println("tv1의 채널값을 8로 변경했습니다.");
		
		tv2.channel = 4;
		
		System.out.println("tv1의 채널값은 " + tv.channel + " 입니다");
		System.out.println("tv2의 채널값은 " + tv2.channel + " 입니다");
		
	}
	
}
