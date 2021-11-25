package java14_lamda;

class aaa {
	int a = 1;
	String b = "abc";
	
	void print() {
		System.out.println("부모클래스 print method");
	}
	void test() {
		System.out.println("부모클래스 test method");
	}
}


public class Test {

	public static void main(String[] args) {
		
		aaa a = new aaa() { //익명클래스 
		
		@Override
		void print() {
			System.out.println("익명 오버라이딩");
		}
		}; 
		a.print();
		a.test();

	}

}
