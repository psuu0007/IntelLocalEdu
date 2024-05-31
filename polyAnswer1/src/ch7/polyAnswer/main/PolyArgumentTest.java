package ch7.polyAnswer.main;

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
		
		customer.buy(new Tv());
		System.out.println(customer.toString());
		System.out.println();
		
		customer.buy(com);
		System.out.println(customer.toString());
		System.out.println();
		
		customer.buy(smartPhone);
		System.out.println(customer);
		System.out.println();
		
		customer.buy(book);
		System.out.println(customer);
	}

}
