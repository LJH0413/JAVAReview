package java07_inheritance;

public class ColorPoint extends Point {
	//point클래스를 상속 받는 클래스
	
	private String color; //color of point
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() { //컬러 점의 좌표값 변수에 적용
		System.out.println(color);
		showPoint(); //부모클래스에서 상속받은 메소드
	}

	}

