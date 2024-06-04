package ch8.exam1;

public class TestAnswer {

	public static void main(String[] args) {
		
		ChildAnswer child = new ChildAnswer();
		
//		try {
//			child.add(10, 20);
//		} catch (InvalidNumberException ine) {
//			// TODO: handle exception
//			System.out.println(ine.getMessage());
//		} catch (NotANumberException nane) {
//			// TODO: handle exception
//			System.out.println(nane.getMessage());
//		}
		
		try {
			child.add(10, 20);
		} catch (InvalidNumberException | NotANumberException ine) {
			// TODO: handle exception
			System.out.println(ine.getMessage());
		}
		
		
	}
	
}
