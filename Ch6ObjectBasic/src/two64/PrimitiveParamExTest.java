package two64;

public class PrimitiveParamExTest {

	public static void main(String[] args) {
		
		Data d = new Data();
		
		System.out.println(d.x);
		
		d.x = 10;
		
		System.out.println(d.x);
		
		PrimitiveEx1 pe = new PrimitiveEx1();
		
		pe.change(d.x);
		
		System.out.println();
		System.out.println("main: x: " + d.x);
		
	}
	
	
}
