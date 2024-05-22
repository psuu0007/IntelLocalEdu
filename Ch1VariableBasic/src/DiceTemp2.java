
public class DiceTemp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int diceNum = 0; // 1~6
		// int i = 0;

		for (int diceNum = 0; diceNum <= 6; diceNum++) {
			System.out.println((int) (Math.random() * 6) + 1);
			if (diceNum <= 5) {
				System.out.println("주사위");
			} else if (diceNum == 6) {
				System.out.println("주사위가 6이 나왔습니다.");
				break;
			}
		}
		
//		ctrl + shift + f: 포맷 정렬 
		
//		diceNum = 1;
//		System.out.println(diceNum);
//		
//		diceNum = 3;
//		System.out.println(diceNum);
//		
//		diceNum = 6;
//		System.out.println(diceNum);

		// 난수 => 무작위성 제공 6 나오면 끝
	}

}
