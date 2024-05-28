package two58;

public class Gugudan {

//	클래스 타입
	
//	구구단?
	
//	리턴 타입?
	
	int gugudan1(int dan) {
		
		for (int i = dan; i <= 9; i++) {
			for (int n = 1; n <= 9; n++) {
				System.out.print(i + " * " + n + " = " + (i * n) + "\t");
			}
			System.out.println();
		}
		
		return 0;
	}
	
	void gugudan2(int dan) {
		
		for (int i = dan; i <= 9; i++) {
			for (int n = 1; n <= 9; n++) {
				System.out.print(i + " * " + n + " = " + (i * n) + "\t");
			}
			System.out.println();
		}
		
	}
	
}
