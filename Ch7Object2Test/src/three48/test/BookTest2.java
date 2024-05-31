package three48.test;


public class BookTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book2 b1 = new Book2();
		
		b1.setTitle("숨결이 바람될 때");
		b1.setAuthor("폴 칼라니티");
		b1.setPublisher("흐름출판");
		b1.setPrice(14000);
		b1.setPublishedDate("2016.08.22");
		
		System.out.println("제목: " + b1.getTitle());
		System.out.println("작가: " + b1.getAuthor());
		System.out.println("출판사: " + b1.getPublisher());
		System.out.println("가격: " + b1.getPrice() + "원");
		System.out.println("출판일: " + b1.getPublishedDate());
		
		System.out.println();
		
		Book2 b2 = new Book2("마법의 순간", "파울로 코엘료", "자음과모음", 4800, "2013.05.09");
		
		System.out.println("제목: " + b2.getTitle());
		System.out.println("작가: " + b2.getAuthor());
		System.out.println("출판사: " + b2.getPublisher());
		System.out.println("가격: " + b2.getPrice() + "원");
		System.out.println("출판일: " + b2.getPublishedDate());
	}

}
