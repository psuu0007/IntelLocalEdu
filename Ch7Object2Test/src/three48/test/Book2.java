package three48.test;

public class Book2 {
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String publishedDate;
	
	public Book2() {
		
	}
	
	public Book2(String title, String author
		, String publisher, int price, String publishedDate) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.publishedDate = publishedDate;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	public String getPublishedDate() {
		return this.publishedDate;
	}
}
