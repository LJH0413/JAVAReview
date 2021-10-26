package java07_inheritance.lab09;

public class Shape { //슈퍼클래스

		public Shape next; //객체 선언, next 인스턴스 변수
		public Shape() {
			next = null;
		}
		
		public void draw() {
			System.out.println("shape");
		}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}