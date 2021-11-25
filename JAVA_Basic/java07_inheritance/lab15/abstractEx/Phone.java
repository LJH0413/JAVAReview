package java07_inheritance.lab15.abstractEx;

public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//매소드
	public void turnOn() {
		System.out.println("Turn On");
	}
	public void turnOff() {
		System.out.println("Turn Off");
	}
}
