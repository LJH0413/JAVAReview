package java11_basic_class.wrapper;

public class Boxing_unBoxing {
	//AutoBoxing 기본자료형의 데이터를 객체형 변수에 할당
	//unBoxing 	객체형의 자료형을 기본 자료형으로 사용

	public static void main(String[] args) {
		
		Integer num1 = new Integer(100);
		int num2 = 200;
		
		int sum = num1 + num2; //num1 자동으로 언박싱, num1.intValue( );
		int sum2 = num1.intValue()+num2;
		
		Integer num3 = num2; //오토박싱: integer.ValueOf(num2)자동으로 변환

	}

}
