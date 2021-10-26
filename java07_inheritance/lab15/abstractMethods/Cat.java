package java07_inheritance.lab15.abstractMethods;

public class Cat extends Animal{
	
	public Cat( ) {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
