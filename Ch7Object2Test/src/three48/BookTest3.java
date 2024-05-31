package three48;

public class BookTest3 {
	
	public static void main(String[] args) {
		
		Book3 book = new Book3();
		
		book.setTitle("해리포터");
		book.setAuthor("J.K. 롤링");
		book.setPublisher("문학수첩");
		book.setPrice(18000);
		book.setPublicationDate(1997);
		
		String title = book.getTitle();
		String author = book.getTAuthor();
		String publisher = book.getPublisher();
		int price = book.getPrice();
		int publicationdate = book.getPublicationDate();
		
		System.out.println(title);
		System.out.println(author);
		System.out.println(publisher);
		System.out.println(price);
		System.out.println(publicationdate);
		
		
       
	}

}
