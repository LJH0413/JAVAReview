package java11_basic_class.class_ex;

public class NewInstanceTest {

	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("basic_class11.class_ex.Person");
		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);
		
		
	}
}
