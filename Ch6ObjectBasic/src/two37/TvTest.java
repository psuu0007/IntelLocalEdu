package two37;

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		
		Tv tv2 = new Tv();

		System.out.println("tv1의 채널값은 " + tv.channel + " 입니다");
		System.out.println("tv2의 채널값은 " + tv2.channel + " 입니다");
		
		tv.channel = 8;
		System.out.println("tv1의 채널값을 8로 변경했습니다.");
		
		tv2.channel = 4;
		
		System.out.println("tv1의 채널값은 " + tv.channel + " 입니다");
		System.out.println("tv2의 채널값은 " + tv2.channel + " 입니다");
		
	}
	
}
