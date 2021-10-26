package java06_object.basic;

public class Circle {
		
	int radius; //정수형 변수 [기본타입의 자료형: 8]  
			//원의 반지름 
				
	String name; //문자열 변수 [참조 자료형(객체형 자료형): 대문자 시작] 
			// 원의 이름
	
	public Circle () {} // 기본 생성자: 클래스 이름과 동일한 이름을 가진 매소드
						// = 인풋 매개변수와 실행부가 없는 생성자를 기본 생성자/
						// - 기본 생성자는 생략이 가능 
	 					// 생성자는 리턴을 돌려주지 않음 (return 있는 경우 void)
						//		return 을 돌려줄 자료형 명시. 
	
	
	
	public double getArea() { //매소드 gerArea 호출하면 return에 함수가 실행.
		return 3.14 * radius * radius;
	}
	

	public static void main(String[] args) {
		Circle pizza;  //circle = 객체형 자료 pizza = 참조변수 (메서드안에 있는 변수)
		pizza = new Circle();  // new 생성자 호출, 메모리 힙 영역에 객체생
		
		/*
		 * 2] Circle pizza = new Circle();
		 */
		
		pizza.radius = 10; 
		pizza.name = "javaPizza";
		double Area = pizza.getArea();
		System.out.println("pizza name: "+pizza.name);
		System.out.println("pizza Area: " + Area);
		
		
		Circle dount = new Circle();
		dount.radius = 2;
		dount.name = "java dount";
		double area = dount.getArea();
		System.out.println("dount name: " + dount.name);
		System.out.println("dount name: " + area);
		
		
	}//main

}//class
