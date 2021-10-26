package java06_object.basic;

import java.util.Scanner;

public class Rectangle {  //넓이와 높이를 입력 받아서 사각형 넓이 구하

	int width; //전연 변수 
	int height; //전역 변수 

	public int getArea() { //int 값 리턴 
		return width * height;
	}

	public Rectangle() {} //기본 생성자 생략 가능 단, 다른 생성자가 없는 경우, 외부에서 호출하지 않는 경우 

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>  ");

		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();

		System.out.println("Rectangle Area: " + rect.getArea());


	}//main
}//class
