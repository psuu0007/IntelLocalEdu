package ch7.polyAnswer.main;

import java.util.Scanner;

import ch7.polyAnswer.customer.Customer;
import ch7.polyAnswer.product.Book;
import ch7.polyAnswer.product.Computer;
import ch7.polyAnswer.product.SmartPhone;
import ch7.polyAnswer.product.Tv;

// 다형성 활용 -> 메서드 매개변수
public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		Computer com = new Computer();
		SmartPhone smartPhone = new SmartPhone();
		Book book = new Book();

		Scanner scan = new Scanner(System.in);
		int userChoiceNum = 0;

		System.out.println("구매할 물건의 번호를 입력하세요");
		System.out.println("1번 tv");
		System.out.println("2번 컴퓨터");
		System.out.println("3번 스마트폰");
		System.out.println("4번 책");
		userChoiceNum = scan.nextInt();

		System.out.println();
		switch (userChoiceNum) {
			case 1:
				customer.buy(new Tv());
				System.out.println(customer.toString());
				break;
			case 2:
				customer.buy(com);
				System.out.println(customer.toString());
				break;
			case 3:
				customer.buy(smartPhone);
				System.out.println(customer);
				break;
			case 4:
				customer.buy(book);
				System.out.println(customer);
				break;
			default:
				System.out.println("없는 번호를 선택하셨습니다.");
				break;
		}

		System.out.println();
		
		customer.useProduct();
		
	}

}
