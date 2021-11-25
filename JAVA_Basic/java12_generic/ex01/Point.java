package java12_generic.ex01;

public class Point<T, V> { //제네릭 클래스, 두점을 입력 받아 좌표와 넓이를 구함 
	
	T x; //데이터타입 변수
	V y;
	
	Point(T x, V y) { //생성자
		this.x = x;
		this.y = y;
				
	}
	
	public T getX() { //x 변수값 리턴
		return x;
	}
	public V getY() { //y 변수값 리턴
		return y;
	}
	
	
	
	

}
