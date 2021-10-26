package java07_inheritance.abstract_ex;

public abstract class Notebook extends Computer{

	@Override
	public void display() {
		System.out.println("Notebook Display");
	}

	@Override
	public void typing() {
		System.out.println("Notebook Typing");
	}

}
