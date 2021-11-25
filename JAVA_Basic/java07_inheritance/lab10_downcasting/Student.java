package java07_inheritance.lab10_downcasting;

public class Student extends Person{
	
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
	
	@Override
	public void fly() {
		System.out.println("flying - Student Class");
	}
}
