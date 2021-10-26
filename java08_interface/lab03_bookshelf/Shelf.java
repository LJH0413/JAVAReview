package java08_interface.lab03_bookshelf;

import java.util.ArrayList;

public class Shelf {
	//필드
	protected ArrayList<String> shelf; //ArrayList 선언, shelf = 인스턴스변수(객체형변수)- new를 통하여 만들면 활성화 
	
	//생성자
	public Shelf() { 
		shelf = new ArrayList<String>(); //ArrayList 생성
	}
	
	//매소드
	public ArrayList<String> getShelf() { //getter	: shelf = ArrayList
		return shelf;
	}
	public int getCount() {
		return shelf.size(); //ArrayList의 배열의 길이: 책장에 남아있는 책의 개수
	}
	
}
