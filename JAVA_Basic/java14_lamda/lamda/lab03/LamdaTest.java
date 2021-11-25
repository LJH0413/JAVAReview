package java14_lamda.lamda.lab03;


@FunctionalInterface
interface PrintString {
	
	void showString(String str); //매개변수 받는 매소드
	
}


public class LamdaTest {
	
	public static void showMyString(PrintString p) {
		p.showString("Good Night Lamda");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + " World ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("== 1. 람다식을 변수에 대입 ==");
		PrintString lamdaStr1 = s -> System.out.println(s);
		lamdaStr1.showString("Hello Lamda");
		
		System.out.println("== 2. 매소드의 매개변수로 전달 ==");
		showMyString(lamdaStr1);
		
		
		System.out.println("== 3. 리턴 값으로 람다식 사용 ==");
		PrintString ps = returnString();
		ps.showString("Hello");
	}

}
