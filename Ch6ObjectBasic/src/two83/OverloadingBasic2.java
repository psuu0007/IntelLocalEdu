package two83;

public class OverloadingBasic2 {

	public static void main(String[] args) {
		
		OverloadingBasic1 o = new OverloadingBasic1();
		
//		The method print(long, int) is ambiguous for the type OverloadingBasic1
		String s = o.print(1L, 3240);
//		int -> long 
		o.print(10, 32l);
		
				
		
	}
	
}
