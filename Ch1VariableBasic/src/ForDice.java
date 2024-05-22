
public class ForDice {
	public static void main(String[] args) {

		int diceNum = 0;
		int cnt = 0;
		
		for (int i=0; i<=1000; i++) {

			diceNum = (int) (Math.random() * 6) + 1;
			
			cnt++;
				
			System.out.println("(" + diceNum + ")");
			if (diceNum == 6) {
				break;
			}
		}

		System.out.println("주사위를 굴린 총 횟수: " + cnt);
	}
}
