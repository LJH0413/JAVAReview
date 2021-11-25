package java07_inheritance.abstract_ex;

public abstract class Computer { //추상클래스: 클래스 내부에 추상메소드가 1개 이상 존재하면 
								//추상클래스는 객체화 불가능
								//상속과 오버라이딩으로 구현화
	
	public abstract void display(); //추상매소드 실행부가 없는 매소드, 선언만 되어있음
									//자식 클래스에서 메소드 오버라이딩을 통해서 구현
									//매소드 이름 규칙을 만듦
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("turnOn");
	}
	
	public void turnOff() {
		System.out.println("turnOff");
	}
}
