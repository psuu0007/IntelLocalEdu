package ch7.polyExam;

// 다형성 활용 -> 메서드 매개변수
class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();

		Computer com = new Computer();

		customer.buy(new Tv());
		System.out.println(customer.toString());

		customer.buy(com);
		System.out.println(customer.toString());
	}

}
