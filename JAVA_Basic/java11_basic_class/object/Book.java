package java11_basic_class.object;

public class Book {
	
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	public static void main(String[] args) {
		
		Book b1 = new Book(200, "개미");
		
		System.out.println(b1);
		System.out.println(b1.toString());
		
	}

}
