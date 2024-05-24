
public class ArrayBasic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int[] ballArr = new int[45];
		
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i + 1;
		}
		
		int temp = 0; // 치환
		int n = 0; // 인덱스 접근
		
		
		for (int i = 0; i < 6; i++) {
			n = (int)(Math.random() * 45);
			
			temp = ballArr[i];
			ballArr[i] = ballArr[n];
			ballArr[n] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("[" + (i + 1) + "]" 
				+ "자동으로 나온 로또 번호: " + ballArr[i]);
		}
		
		// 확인용
//		for (int i = 0; i < ballArr.length; i++) {
//			System.out.print(ballArr[i] + " ");
//		}
		
		
		
	}

}
