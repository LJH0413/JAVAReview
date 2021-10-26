package java07_inheritance.lab09;

public class MethodOverringEx {
	
	static void paint(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {

		Line line = new Line(); //line 객체를 생성 후 
		paint(line); //객체를 페인트 메소드 매개변수로 입력
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
