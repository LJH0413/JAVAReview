package java11_basic_class.object;

public class Book1 {
	
	
	int bookNumber;
	String bookTitle;
	
	Book1(){}
	Book1(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookNumber + "," + bookTitle;
	}
	
	
	public static void main(String[] args) {
		
		Book1 b1 = new Book1(100, "토지");
		
		System.out.println(b1);
		
		System.out.println(b1.toString());
		
	}
	

}
