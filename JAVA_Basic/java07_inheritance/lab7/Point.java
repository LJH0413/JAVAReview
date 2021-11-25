package java07_inheritance.lab7;

public class Point {
	
	private int x, y;
	
	public Point() {
		this.x = this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() { //점의 좌표 출력
		System.out.println("(" + x + ", " + y + ")");
	}
}
