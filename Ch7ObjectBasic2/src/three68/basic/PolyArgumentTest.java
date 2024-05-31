package three68.basic;

public class PolyArgumentTest {

	public static void main(String[] args) {
		
		Buyer buy1 = new Buyer();
		
		Tv t = new Tv();
		
		buy1.buy(t);
		
		System.out.println("현재 남은 돈은 : " + buy1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 : " + buy1.bonusPoint + "점입니다");
		
		System.out.println();
		Com com = new Com();
		
		buy1.buy(com);
		
		System.out.println("현재 남은 돈은 : " + buy1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 : " + buy1.bonusPoint + "점입니다");
	}

}