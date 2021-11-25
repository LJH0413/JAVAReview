package java14_lamda.lamda.lab01;

public class MyNumberTest {
	
	public static void main(String[] args) {
		
		
		//삼항 연산자 이용 최대값 출력
		MyNumber max = (x, y) -> (x >= y) ?  x:y;
		//람다식을 인터페이스 자료형 호출
		System.out.println("Lamda MAX: " + max.getMax(10, 20));
		
		MyNumber2 min = (x, y) -> (x <= y) ?  x:y;
		System.out.println("Lamda MIN: " + min.getMin(10, 20));
		
	}

}
