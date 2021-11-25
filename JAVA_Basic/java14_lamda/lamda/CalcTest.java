package java14_lamda.lamda;

import java.util.Scanner;

class Calc implements Calculator{

	@Override
	public void calculator(int x, int y) {
		int sum = (x + y);
		int sub = (x - y);
		int times = (x * y);
		int divide = (x / y);
		
		System.out.println("x + y = " + sum);
		System.out.println("x - y = " + sub);
		System.out.println("x * y = " + times);
		System.out.println("x / y = " + (double)divide);
	}
}

public class CalcTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert Number >");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//1. 객체지향으로 출력
		try {
			System.out.println("=== Call Method By New Object ===");
			Calc calc1 = new Calc();
			calc1.calculator(x, y);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}  	System.out.println("프로그램 종료");
	
		System.out.println();
		
		
		//2. 람다식을 사용하여 출력
		System.out.println("=== Call Method By Lamda ===");
		Calculator calc2 = (a, b) -> {System.out.println("a + b = " + (a+b));
									  System.out.println("a - b = " + (a-b));
									  System.out.println("a * b = " + (a*b));
									  System.out.println("a / b = " + (double)(a/b)); }; 

		try {
			calc2.calculator(x, y);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("예외 발생");
		} System.out.println("프로그램 종료");
 
		System.out.println();
		
		
		//3. 익명클래스 사용 출력
		System.out.println("=== Call Method by anonymous Class ===");
		Calc calc3 = new Calc() {

			@Override
			public void calculator(int x, int y) {
				System.out.println("a + b = " + (x+y));
				System.out.println("a - b = " + (x-y));
				System.out.println("a * b = " + (x*y));
				System.out.println("a / b = " + (double)(x/y));
			}
		};
		try {
			calc3.calculator(x, y);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("예외 발생");
		} System.out.println("프로그램 종료");
	}
	
}
