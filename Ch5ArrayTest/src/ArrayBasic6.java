
/**
 * @author PSU
 *  키보드 입력으로 
 *	5개의 숫자를 배열에 입력한 후
 	배열에 담은 값을 순차적으로 출력하시오
출력예시
10
20
30
40
50
 */
public class ArrayBasic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numberArr = new int[5];

		// 10부터 50까지의 숫자를 배열에 입력
//		for (int i = 0; i < 5; i++) {
//			numberArr[i] = (i + 1) * 10;
//		}

		numberArr[0] = (1 + 1) * 10;
		numberArr[0] = (1 + 1) * 10;
		numberArr[0] = (1 + 1) * 10;
		
		
		// 배열에 담은 값을 순차적으로 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(numberArr[i]);
		}

	}

}
