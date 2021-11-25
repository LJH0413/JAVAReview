package java11_basic_class.object.clone;

import java.util.ArrayList;

class MyBook implements Cloneable {
	//필드
	String title;
	//생성자
	public MyBook(String title) {
		this.title = title;
	}
	//매소드
	public void setTitle (String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class ObjectArrayClone {

	public static void main(String[] args) {
		ArrayList<MyBook> bookList = new ArrayList<MyBook>();
		
		MyBook b1 = new MyBook("C언어");
		MyBook b2 = new MyBook("JS");
		MyBook b3 = new MyBook("Python");
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		System.out.println("bookList");
		for(MyBook n : bookList) {
			System.out.print(n + " ");
		} System.out.println();
		
		ArrayList<MyBook> copyList = (ArrayList) bookList.clone();
		
		MyBook b4 = new MyBook("C++");
		copyList.add(b4);
		
		copyList.add(new MyBook("Ruby"));
		
		System.out.println();
		System.out.println("copyList");
		for(MyBook n : copyList) {
			System.out.print(n + " ");
		} System.out.println();
		
		b3.setTitle("자바"); //원본을 수정하면 clone도 수정됨.	
		System.out.println();
		System.out.println(bookList);
		System.out.println(copyList);
		

	}

}
