
public class ArrayBasic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		임의의 숫자들을 작은 값에서 큰값으로 정렬하시오
//		(오름차순)
		int[] jumsuArr = {
			70, 80, 50, 100, 1	
		};
		
		// 확인용
		for (int i = 0; i < jumsuArr.length; i++) {
			System.out.print(jumsuArr[i] + " ");
		}
		System.out.println();
//		전체조회, 일반정렬
		
		int temp = 0;
		for (int i = 0; i < jumsuArr.length; i++) {

			for (int n = 0; n < jumsuArr.length; n++) {
				if(jumsuArr[i] < jumsuArr[n]) {
					temp = jumsuArr[i];
					jumsuArr[i] = jumsuArr[n];
					jumsuArr[n] = temp;
				} // if문
				
			} // 내부 for
			
		} // 외부 for 

		for (int i = 0; i < jumsuArr.length; i++) {
			System.out.print(jumsuArr[i] + " ");
		}

	}

}
