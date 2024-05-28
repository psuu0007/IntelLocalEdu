package two38;

public class TvTest2 {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		
		Tv tv2 = new Tv();

		System.out.println("tv1의 채널값은 " + tv.channel + " 입니다");
		System.out.println("tv1의 채널값은 " + tv.color + " 입니다");
		System.out.println("tv2의 채널값은 " + tv2.channel + " 입니다");
		System.out.println("tv2의 채널값은 " + tv2.color + " 입니다");
		
//		어떤 tv의 설정을 그래도 다른 tv에 적용하고 싶다

		tv.color = "black";
		tv.channel = 8;
		
		System.out.println();
		
		tv2.color = tv.color;
		tv2.channel = tv.channel + 1;
		
		System.out.println("tv1의 채널값은 " + tv.channel + " 입니다");
		System.out.println("tv1의 채널값은 " + tv.color + " 입니다");
		System.out.println("tv2의 채널값은 " + tv2.channel + " 입니다");
		System.out.println("tv2의 채널값은 " + tv2.color + " 입니다");
		
	}
	
}
