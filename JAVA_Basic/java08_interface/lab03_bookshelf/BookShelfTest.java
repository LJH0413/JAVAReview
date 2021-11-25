package java08_interface.lab03_bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		
		//책장에 책 넣기
		shelfQueue.enQueue("난중일기"); 
		shelfQueue.enQueue("태백산맥");
		shelfQueue.enQueue("토지");
		shelfQueue.enQueue("정의란 무엇인가");
		shelfQueue.enQueue("리어왕");
		System.out.println("남은책: " + shelfQueue.getSize());
		System.out.println();
		
		//책장에서 책 빼기
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	
		System.out.println();
		System.out.println("남은책: " + shelfQueue.getSize());
	}

}
