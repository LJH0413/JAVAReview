package java07_inheritance.lab15.abstractMethods;

public abstract class Animal {
	
	public String kind;
	
	public void breath() {
		System.out.println("take a breath");
	}

	public abstract void sound();
}
