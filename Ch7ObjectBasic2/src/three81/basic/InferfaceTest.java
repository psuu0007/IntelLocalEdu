package three81.basic;

public class InferfaceTest {

	public static void main(String[] args) {
		
//		Tv tv = new Tv();
		
		CaptionTv t = new CaptionTv();

//		t.power = true;
		t.power();
		t.channelUp();
		
		t.recordMovie();
		
	}
	
	
}
