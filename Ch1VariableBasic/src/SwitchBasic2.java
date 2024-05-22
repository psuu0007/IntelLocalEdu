import java.util.Scanner;

public class SwitchBasic2 {
	public static void main(String[] args) {

		
		int month = 5;
		String monthStr = "";
		
		switch (month) {
			case 3: case 4: case 5:
				monthStr = "봄";
				break;
			
			default:
				monthStr = "특이한 계절";
				break;
		}
		System.out.println("계절: " + monthStr);

	}

}
