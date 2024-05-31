package three48;

public class Book_Jmy {
	
	String title; //제목
	String author; //저자
	String publisher; //출판사
	int price; //가격
	String publicationDate; //출판날짜
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getPrice() {
		return price;
	}
	public String getPublicationDate() {
		return publicationDate;
	}

}
