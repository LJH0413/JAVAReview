package java07_inheritance.lab6_super_error;

public class A { //기본생성자를 명시하지 않아서 오류가 나는 경우
	
	public A () {
		System.out.println("생성자 A");
	}
	
	
	public A(int x) {
		System.out.println("매개변수 생성자: A" + x);
	}

}
