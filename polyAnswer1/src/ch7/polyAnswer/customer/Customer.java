package ch7.polyAnswer.customer;

import ch7.polyAnswer.product.Product;

public class Customer {
	public int money = 1000; // 소유금액
	public int bonusPoint = 0; // 보너스점수

	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}

		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "현재 남은 돈은 " + money + "만원입니다.\n";
		str = str + "현재 보너스점수는 " + bonusPoint + "점입니다.";
		
		return str;
	}
}
