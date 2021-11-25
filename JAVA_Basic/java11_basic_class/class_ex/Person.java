package java11_basic_class.class_ex;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}

}
