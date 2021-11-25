package Lamda;

import java.util.function.DoubleUnaryOperator;

public class Method_References_Basic {
	public static void main(String[] args) {
		
		/*
		 * MyClass obj = new MyClass;
		 * Function<String, Boolean> func = (a) -> obj.equals(a);
		 * Function<String, Boolean> func = obj :: equals(a);
		 */
		
		DoubleUnaryOperator oper;
		
		oper = (n) -> Math.abs(n);
		System.out.println(oper.applyAsDouble(-5));
		
		oper = Math :: abs;
		System.out.println(oper.applyAsDouble(-5));
		
		//생성자의 참조
		// (a) -> { return new Object(a);}
		// Object :: new ;
	}

}
