
public class ArrayBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열(Array)
//		같은 타입의 여러 변수를 하나의 묶음으로 다루는 것

		int kor = 10;
		int kor2 = 20;
		int kor3 = 30;
		int kor4 = 40;
		int kor5 = 50;
			
		kor = kor + 5;
		kor2 = kor2 + 5;
		kor3 = kor3 + 5;
		kor4 = kor4 + 5;
		
		System.out.println("1번 국어점수 " + kor);
		System.out.println("2번 국어점수 " + kor2);
		System.out.println("3번 국어점수 " + kor3);
		System.out.println("4번 국어점수 " + kor4);
		System.out.println("5번 국어점수 " + kor5);

//		
		System.out.println("===========================");
		int[] numArr = new int[5];

		for (int i = 0; i < 5; i++) {
			numArr[i] = (i + 1) * 10;
		}

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번 국어점수: " + numArr[i]);
		}

	}

}
