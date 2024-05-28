package etc;

public class CardCase {

	// 전체 카드 수
	int numOfCards = Card.shape.length * Card.number.length;
	Card[] cardArr = new Card[numOfCards];

	CardCase() {

	}

	// 52장의 카드가 나란히 만들어진다
	void init() {
		int totalCnt = 0;

		for (int i = 0; i < Card.shape.length; i++) {
			for (int n = 0; n < Card.number.length; n++) {
				cardArr[totalCnt++] = new Card(i, n);
			}
		} // 전체 for end

	}

	// 임의의 카드 뽑기
	Card pick() {
		int index = (int) (Math.random() * numOfCards);

		Card card = cardArr[index];

		return card;
	}

	// 카드 직접 뽑기
	Card pick(int index) {

		Card card = cardArr[index];

		return card;
	}

	// 카드 섞기
	void shuffle() {
		for (int i = 0; i < cardArr.length; i++) {
			int rand = (int)(Math.random() * numOfCards);
			
			Card tempCard = cardArr[i];
			cardArr[i] = cardArr[rand];
			cardArr[rand] = tempCard;
		}
	}
	
	
	// 카드케이스의 전체 카드 보기
	void cardCaseShow() {
		for (int i = 0; i < numOfCards; i++) {
			String myCard = "";
			myCard = cardArr[i].getCard();
			
			System.out.print(myCard + " ");
			if((i+1) % 13 == 0) {
				System.out.println();
			}
		}
	}
}
