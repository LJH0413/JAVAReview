package java07_inheritance.abstract_ex;

public class MyNotebook extends Notebook{

	@Override
	public void typing() {
		System.out.println("MyNotebook Typing");
	}

	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("TurnOn MyNotebook");
	}

	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("TurnOff MyNotebook");
	}
	public void myNotebookOnly() {
		System.out.println("My Notebook");
	}
	

}
