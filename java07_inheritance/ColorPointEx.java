package java07_inheritance;

public class ColorPointEx {

	public static void main(String[] args) {

		Point p = new Point();  //포인트 객체 생성
		p.set(1, 2);
		p.showPoint();
		
		System.out.println(p);
		
		ColorPoint cp = new ColorPoint(); // 컬러포인트 객체 생성
		cp.set(3, 4);
		cp.setColor("Red");
		cp.showColorPoint();
		
		System.out.println(cp); //객체 자신을 출력했을 때 객체의 주소를 출력함
	}

}
