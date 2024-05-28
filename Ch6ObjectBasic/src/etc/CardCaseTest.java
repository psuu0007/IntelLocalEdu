package etc;

//카드 만들기
public class CardCaseTest {

	
	public static void main(String[] args) {
		
		CardCase cc = new CardCase();
		
		cc.init();
		
		Card card1 = cc.pick();
		
//		System.out.println(card1.getCard());
		
//		cc.pick(0).getCard();
		
//		System.out.println(cc.pick(0).getCard());
//		System.out.println(cc.pick(1).getCard());
//		System.out.println(cc.pick(2).getCard());
//		System.out.println(cc.pick(12).getCard());
		
		cc.cardCaseShow();
	
		System.out.println();
		
		cc.shuffle();
		
		cc.cardCaseShow();
	}
	
	
}
