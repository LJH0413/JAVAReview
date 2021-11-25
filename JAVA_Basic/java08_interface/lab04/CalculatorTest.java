package java08_interface.lab04;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		
		System.out.println("add: " + calc.add(num1, num2));
		System.out.println("sub: " + calc.substract(num1, num2));
		System.out.println("mul: " + calc.times(num1, num2));
		System.out.println("did: " + calc.divide(num1, num2));
		System.out.println();
		
		Calc newCalc = calc;
		
		calc.description();
		System.out.println();
		
		int [] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr)); //정적매소드 호출
	
	}

}
