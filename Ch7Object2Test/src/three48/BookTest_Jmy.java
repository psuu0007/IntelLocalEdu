package three48;

public class BookTest_Jmy {

	public static void main(String[] args) {
		
		Book_Jmy book1 = new Book_Jmy();
		
		book1.setTitle("삼국지");
		book1.setAuthor("나관중");
		book1.setPublisher("책에반하다");
		book1.setPrice(13050);
		book1.setPublicationDate("2024.02.22");
		
		System.out.println();
		
		System.out.println("Title : " + book1.getTitle());
		System.out.println("Author : " + book1.getAuthor());
		System.out.println("Publisher : " + book1.getPublisher());
		System.out.println("Price : " + book1.getPrice());
		System.out.println("PublicationDate : " + book1.getPublicationDate());
		
		Book_Jmy book2 = new Book_Jmy();
		
		book2.setTitle("삼체");
		book2.setAuthor("류츠신");
		book2.setPublisher("자음과모음");
		book2.setPrice(15300);
		book2.setPublicationDate("2022.02.15");
		
		System.out.println();
		
		System.out.println("Title : " + book2.getTitle());
		System.out.println("Author : " + book2.getAuthor());
		System.out.println("Publisher : " + book2.getPublisher());
		System.out.println("Price : " + book2.getPrice());
		System.out.println("PublicationDate : " + book2.getPublicationDate());
		
	}
	
}
