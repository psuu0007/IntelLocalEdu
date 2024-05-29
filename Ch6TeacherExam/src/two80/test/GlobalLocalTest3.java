package two80.test;

public class GlobalLocalTest3 {
	
	public static int globalNum = 10;
	public static int globalNum2 = 20;
	
	public static void numbering(){
		int localNum = 30;
		
//		System.out.println("globalNum = " + globalNum);
		System.out.println("globalNum2 = " + globalNum2);
		System.out.println("localNum = " + localNum);
	}
	
}
