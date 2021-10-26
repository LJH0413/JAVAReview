package java07_inheritance;

public class Point extends Object { // {x, y} 를 한점에 표현하는 포인트 클래스와 
					 //이를 상속 받아 색을 가진 점에 표현하는 컬러포인트 클래스
					//부모클래스
	private int x, y; //coordinate of point
	
	public void set	(int x, int y) { //메소드로 좌표값 변수에 적용
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}

}
