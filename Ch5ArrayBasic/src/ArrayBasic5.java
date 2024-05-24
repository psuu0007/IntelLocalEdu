
public class ArrayBasic5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		임의의 숫자들을 작은 값에서 큰값으로 정렬하시오
//		(오름차순)
//		int[] jumsuArr = {
//			70, 80, 50, 100, 1	
//		};
		
		int[] jumsuArr = {
			70, 90, 50, 40, 100	
		};
//		for (int i = 0; i < jumsuArr.length; i++) {
//			0~100점 가능
//			jumsuArr[i] = (int) (Math.random() * 101);
//		}

		// 확인용
		for (int i = 0; i < jumsuArr.length; i++) {
			System.out.print(jumsuArr[i] + " ");
		}
		System.out.println();
//		버블정렬
		int temp = 0;
		for (int i = 0; i < jumsuArr.length; i++) {

			for (int n = 0; n < jumsuArr.length-1; n++) {
				if(jumsuArr[n] > jumsuArr[n+1]) {
					temp = jumsuArr[n];
					jumsuArr[n] = jumsuArr[n+1];
					jumsuArr[n+1] = temp;
				} // if문
				
			} // 내부 for
			
		} // 외부 for 

		for (int i = 0; i < jumsuArr.length; i++) {
			System.out.print(jumsuArr[i] + " ");
		}
		
		

	}

}
