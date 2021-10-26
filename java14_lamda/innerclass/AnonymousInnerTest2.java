package java14_lamda.innerclass;

class A {
	
	int a = 10;
	static int b = 20;
	
	void a() {
		System.out.println(a);
	}
	
	static void b() {
		System.out.println(b);
	}
}

class B {
	
	int a = 100;
	static int b = 200;
	
	Runnable c = new Runnable() { //익명클래스
		@Override
		public void run() {
			System.out.println("run method");
		}
		
	};
}

public class AnonymousInnerTest2 {

	public static void main(String[] args) {
		System.out.println("=== 인스턴스 변수 ===");
		A a = new A();
		a.a();
		a.b();
		
		System.out.println("=== 인스턴스 생성없이 객체이름으로 출력 ===");
		A.b();
		
		System.out.println("=== 익명 클래스 생성 ===");
		
		
	}
}
