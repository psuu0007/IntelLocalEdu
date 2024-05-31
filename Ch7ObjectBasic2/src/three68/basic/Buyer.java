package three68.basic;

public class Buyer {

	public int money = 1000;
	public int bonusPoint = 0;
	
//	tv구매
	public void buy(Tv t) {
		
		if(money < t.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= t.price;
		bonusPoint = bonusPoint + t.bonusPoint;
		
		System.out.println(t.toString() + "을/를 구입하셨습니다.");
	}
	
//	com구매
	public void buy(Com com) {
		
		if(money < com.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= com.price;
		bonusPoint = bonusPoint + com.bonusPoint;
		
		System.out.println(com.toString() + "을/를 구입하셨습니다.");
	}
	
	
	
}
