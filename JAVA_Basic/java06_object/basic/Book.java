package java06_object.basic;

public class Book {
	
	
	String title;
	String author;
	
	void show() {
		System.out.println(title + ", " + author); 
	}
	
	public Book () { //매개변수 2개인 생성자 출력 (22행)
		this ("", ""); // 즉, title, author 공백으로 인풋변수를 받
		System.out.println("생성자 호출 됨.");
	}
	
	public Book(String title) {
		this(title, "작가 미상");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	

	public static void main(String[] args) {
		//this() 다른 생성자호출하기.
		// 생성자 중복 코드 제거. 
		Book littlePrince = new Book("어린왕자", "생텍쥐베리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		
		
		loveStory.show();
		littlePrince.show();
		emptyBook.show();
		
		

	}

}
