package java10_exception.EX;

import java.util.Scanner;

public class CompleteCalc extends Calculator implements Calc {
	
	int a;
	int b;
	
	public CompleteCalc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//Calculator 추상매소드 구현
	@Override
	int substract(int a, int b) {
		return a - b;
	}
	@Override
	double divide(int a, int b) {
		
		return a / b;
	}
	
	//Calc interface 구현
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int times(int a, int b) {
		return a * b;
	}
	
	
	@Override
	public String toString() {
		return  "A + B = " + add(a, b) + "\n" 
				+ "A - B = " + substract(a, b) + "\n"
				+ "A * B = " + times(a, b) + "\n" 
				+ "A / B = " + divide(a, b);
		
	}

	public void cal(int a, int b) {
		System.out.println("A + B = " + add(a, b));
		System.out.println("A - B = " + substract(a, b));
		System.out.println("A * B = " + times(a, b));
		if(b == 0 ) {
			try {
				divide(a, b);
			} catch(ArithmeticException e) {
				System.out.print("Divide Methods Error:");
				System.out.print(e);
				System.out.println(" (catch block 호출)");
			}
		}else System.out.println("A / B = " + divide(a, b));

	}
	
	
	//인터페이스 구현 (Calc) = o
	//추상클래스 구현 (Calcuator) = o
	//스캐너로 두 정수 입력 받기, 객체 자체를 출력했을 때 4칙 연산이 모두 출력
	//System.out.println(CompleteCalc)
	// a / b : b가 0인경우 exception	발생
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요 (a, b)");
		int a = sc.nextInt();
		int b = sc.nextInt();
		CompleteCalc c = new CompleteCalc(a, b);
		
//		System.out.println(c.toString());

		try {
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("예외 발생");
		} System.out.println("프로그램 종료");

	}//main


}//class
