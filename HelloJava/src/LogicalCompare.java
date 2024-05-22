
public class LogicalCompare {
	public static void main(String[] args) { 
		int firstNum = 5;
		int secondNum = 0;
		
		
		System.out.println("4-2번 문제");
		System.out.println("firstNum = " + firstNum + "\t secondNum = " + secondNum);
		System.out.println("++firstNum == 0 | secondNum++ != 0 => " 
			+ (++firstNum == 7 | secondNum++ != 0));
		System.out.println("firstNum = " + firstNum + "\t secondNum = " + secondNum);
		System.out.println();
		
		firstNum = 5;
		secondNum = 0;
		
		System.out.println("마지막 문제");
		System.out.println(firstNum==0 || ++secondNum!=0);
		System.out.print(firstNum + "\t" + secondNum);
		System.out.println();
		
	} 
}
