package java08_interface.lab03_bookshelf;

public class BookShelfTest02 {

	public static void main(String[] args) {
		//책장에 100권을 넣고 출력은 30권
		//for문 사용
		
		//객체 생성
		Queue book = new BookShelf();
		
		//책 넣기(100권)
		for(int i=1; i<101; i++) {
			book.enQueue("태백산맥" + i);
		}
		System.out.println("현재 책 개수: " + book.getSize());
		
		//책 빼기
		for(int i=1; i<31; i++) {
			System.out.println(book.deQueue());
		}
		System.out.println("현재 책 개수: " + book.getSize());
		
	}//main
	

}//class
