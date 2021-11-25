package java08_interface.lab04;

public interface Calc {
	
	//상수 public static final 생략
	double PI = 3.14;
	int ERROR = -99999999;
	
	//매소드 public abstract 생략
	int add(int num1, int num2); 
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//디폴트매소드 : 상속되어 사용 가능
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); //private method
	}
	
	static int total(int[] arr) { //스태틱 매소드: 객체 생성없이 사용 가능
		int total = 0;
		for(int i : arr) {
			total += i;
			myStaticMethod(); //private static method
		} return total;
	}

	//private 매소드: 자바 9.0부터 지원
	private void myMethod() {
		System.out.println("Private Method");
	}
	
	private static void myStaticMethod() {
		System.out.println("Private Static Method");
	}
}
