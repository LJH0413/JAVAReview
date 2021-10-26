package java11_basic_class.class_ex;

public class ClassTest {
	
	public static void main(String[] args) throws ReflectiveOperationException{
		
		Person p = new Person();
		
		Class pClass1 = p.getClass(); //오브잭트 클래스의 getclass매소드 사용
		
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class; //직접 클래스파일 대입 
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("basic_class11.class_ex.ClassTest");
		System.out.println(pClass3.getName());
	}

}
