package ch7.polyAnswer.customer;

import ch7.polyAnswer.product.Book;
import ch7.polyAnswer.product.Computer;
import ch7.polyAnswer.product.Product;
import ch7.polyAnswer.product.SmartPhone;
import ch7.polyAnswer.product.Tv;

public class Customer {
	public int money = 1000; // 소유금액
	public int bonusPoint = 0; // 보너스점수
	public Product product = null;

	public void buy(Product product) {
		if (money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}

		money -= product.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += product.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(product + "을/를 구입하셨습니다.");
		this.product = product;
	}

	public void useProduct() {
//	다형성을 위한 조건문
		if(product instanceof Book) {
			Book book = (Book)product;
			
			book.use();
		}else if(product instanceof Computer) {
			Computer com = (Computer)product;
			
			com.use();
		}else if(product instanceof SmartPhone) {
			SmartPhone smartPhone = (SmartPhone)product;
			
			smartPhone.use();
		}else if(product instanceof Tv) {
			Tv tv = (Tv)product;
			
			tv.use();
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "현재 남은 돈은 " + money + "만원입니다.\n";
		str = str + "현재 보너스점수는 " + bonusPoint + "점입니다.";

		return str;
	}
}
