package etc;

//카드 만들기
public class CardTest {

	
	public static void main(String[] args) {
		
		Card card1 = new Card();
		
		card1.init();
		
		String cardStr = card1.getCard();
		
		System.out.println(cardStr);
		
		
		Card card2 = new Card(3, 12);
//		card2.init(2, 6);
		
		String cardStr2 = card2.getCard();
		
		System.out.println(cardStr2);
		
	}
	
	
}
