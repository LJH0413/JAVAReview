package java07_inheritance.lab10_polymorphism;

public class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리는 하늘 높이 납니다.");
	}

	
}
