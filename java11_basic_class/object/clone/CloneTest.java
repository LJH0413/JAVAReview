package java11_basic_class.object.clone;

class Point {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() { //객체를 출력할 때 toString 매소드 출력
		return "x = " + x + ", " + "y = " + y;
	}
}

class Circle implements Cloneable { //클래스복제 허용: implements Cloneable
	
	Point point; //객체변수 point 
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "원점:	" + point + ", 반지름: " + radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { //clone()메소드
		return super.clone();
	}
	
}

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 30); //circle 객체 생성
		
		Circle copyCircle = (Circle)circle.clone(); //circle 객체 복사 
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println();
		
		System.out.println(circle.toString());
		System.out.println(copyCircle.toString());
		
		System.out.println();
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));

	}

}
