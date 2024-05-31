package three54;

import three54.basic.CaptionTv;
import three54.basic.Tv;

public class TvTest {

	public static void main(String[] args) {
//		부모타입은 자식 타입의 객체를 가질 수 있다
		Tv t = new CaptionTv();
		
		t.channel = 1;
		t.channelUp();
		
		t.power();
		
//		The method caption() is undefined for the type Tv
//		t.caption();
		
//		CaptionTv capTv = new Tv();
//		
//		capTv.channel = 2;
//		capTv.caption();
		
		CaptionTv capTv2 = new CaptionTv();
		
		
		capTv2.caption();
		
		
		
	}
}
