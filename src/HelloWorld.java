
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalPrice;
		int totalPages;
		
		System.out.println("Hello World");
		System.out.println("Welcome!!!");
		
		Book javaBook = new Book("Java Programming");
		Book cplusBook = new Book("C++ Programming");
		System.out.println(javaBook.getTitle());
		Book rubyBook = new Book("Ruby Proogramming", "Vinay", 400, 225);
		
		javaBook.setPrice(100);
		System.out.println("Java Book Price:");
		System.out.println(javaBook.getPrice());
		
		System.out.println("Java Book Pages:");
		javaBook.setPages(300);
		System.out.println(javaBook.getPages());
		
		System.out.println("C++ Book Price:");
		cplusBook.setPrice(150);
		System.out.println(cplusBook.getPrice());
		
		System.out.println("C++ Book Pages:");
		cplusBook.setPages(450);
		System.out.println(cplusBook.getPages());
		
		totalPrice = javaBook.getPrice() + cplusBook.getPrice() + rubyBook.getPrice();
		System.out.println("Total Price: "+ totalPrice);
		
		totalPages = javaBook.getPages() + cplusBook.getPages() + rubyBook.getPages();
		System.out.println("Total Pages: "+ totalPages);
	}

}
