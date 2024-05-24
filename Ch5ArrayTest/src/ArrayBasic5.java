
public class ArrayBasic5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numberArr = new int[4];
		int number = 0;

		for (int i = 0; i < 3; i++) {
			number = number + 1;
		}
		
		for (int i = 0; i < 3; i++) {
			numberArr[i] = number + i;
		}

		for (int i = 0; i < numberArr.length; i++) {
			System.out.print(numberArr[i] + "\t");
			number = number + numberArr[i];
		}
		
		System.out.println("number는? " + number);
				
		
		
		
		

	}

}
