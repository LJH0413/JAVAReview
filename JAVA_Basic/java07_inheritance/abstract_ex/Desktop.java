package java07_inheritance.abstract_ex;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop Display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop Typing");
	}

	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("TurnOn Desktop");
	}

	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("TurnOff Desktop");
	}
	
	public void desktopOnly() {
		System.out.println("desktop");
	}
	

}
