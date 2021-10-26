package java07_inheritance.lab7;

public class ColorPoint extends Point{
	
	private String color;
	
	public ColorPoint(int x, int y, String color) { //생성자
		super(x, y);
		this.color = color; // x, y는 슈퍼로 호출해서 안써도 됨.
	}
	
	public void showColorPoint() {
		System.out.println("color: " + color);
		showPoint();
	}
	

}
