package java07_inheritance.lab6_super_error;

public class B extends A{
	
	public B() { //오류 발생, 상위클래스에서 매개변수 없는 생성자가 명시되지 않음
		//super();
		System.out.println("생성자 B");
	}
	

}
