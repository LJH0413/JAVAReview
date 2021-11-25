package java11_basic_class;

public class B {
	
	int a = 1;
	void b() {
		System.out.println("a: " + a);
	}

	public static void main(String[] args) {
		
		B b = new B();
		
		b.b();
		b.a = 10;
		b.b();
		
		
		b.toString(); //object 클래스의 메소드
		

	}

}
