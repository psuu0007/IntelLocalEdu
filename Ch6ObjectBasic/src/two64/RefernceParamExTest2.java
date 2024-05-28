package two64;

public class RefernceParamExTest2 {

	public static void main(String[] args) {
		
		Data d = new Data();
		
		System.out.println(d.x);
		
		d.x = 10;
		
		System.out.println(d.x);
		
		RefernceEx2 re = new RefernceEx2();
		
		re.change(d);
		
		System.out.println();
		System.out.println("main: x " + d.x);
		
	}
	
	
}
