
public class Book {
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String title;
	private String author;
	private int pages;
	private int price;

	public Book(String title) {
		// TODO Auto-generated constructor stub
		
		this.title = title;
	}

	public Book(String title, String author, int pages, int price) {
		// TODO Auto-generated constructor stub
		
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		
		
		return title;
	}
}
