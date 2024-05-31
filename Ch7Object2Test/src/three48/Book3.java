package three48;

public class Book3 {
	
	//제목, 지은이, 출판사, 가격, 출판날짜
	
	String title;
	String author;
	String publisher;
	int price;
	int publicationDate;
	
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	
	String getTAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	
	String getPublisher() {
		return publisher;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	int getPublicationDate() {
		return publicationDate;
	}
	void setPublicationDate(int publicationDate) {
		this.publicationDate = publicationDate;
	}

}
