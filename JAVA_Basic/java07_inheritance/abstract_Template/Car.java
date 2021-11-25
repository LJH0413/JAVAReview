package java07_inheritance.abstract_Template;

public abstract class Car {
	
	public abstract void drive(); //추상매소드
	
	public abstract void stop(); //추상매소드 
	
	public void	turnOn() {
		System.out.println("Turn On The Car");
	}		
	public void	turnOff() {
		System.out.println("Turn Off The Car");
	}
	final public void RUN() { //템플릿 매소드: 하위클래스에서 오버라이딩 할 수 없다.
		turnOn();
		drive();
		stop();
		turnOff();
	}
	

}
