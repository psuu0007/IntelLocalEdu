package two48;
//스태틱 변수와 인스턴스 변수 특징1
public class CardTest {

	public static void main(String[] args) {
		
		System.out.println("카드 w: " + Card.width);
		System.out.println("카드 h: " + Card.height);
		
//		c1.kind = "Heart";
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("카드1 정보");
		System.out.println("c1.kind :" + c1.kind);
		System.out.println("c1.number :"+ c1.number);
		System.out.println("c1.width :"	+ Card.width);
		System.out.println("c1.height :" + c1.height);
		
		System.out.println("카드2 정보");
		System.out.println("c2.kind :" + c2.kind);
		System.out.println("c2.number :"+ c2.number);
		System.out.println("c2.width :"	+ c2.width);
		System.out.println("c2.height :" + Card.height);
		
		System.out.println("=========================");
		System.out.println("\n");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("카드1 정보");
		System.out.println("c1.kind :" + c1.kind);
		System.out.println("c1.number :"+ c1.number);
		System.out.println("c1.width :"	+ c1.width);
		System.out.println("c1.height :" + c1.height);
		
		System.out.println("카드2 정보");
		System.out.println("c2.kind :" + c2.kind);
		System.out.println("c2.number :"+ c2.number);
		System.out.println("c2.width :"	+ c2.width);
		System.out.println("c2.height :" + c2.height);
		
	}
	
}
