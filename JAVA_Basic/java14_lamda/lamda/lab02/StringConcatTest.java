package java14_lamda.lamda.lab02;

public class StringConcatTest {

	public static void main(String[] args) {
		
		
		//1. 객체지향으로 출력: 객체의 메소드 호출
		String s1 = "Hello";
		String s2 = "GoodNight";
		
		System.out.println("=== Call Method by new object ===");
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		System.out.println();
		
		//2. 람다식을 사용해서 출력
		System.out.println("=== Call Method by Lamda ===");
		StringConcat concat2 = (s, v) -> {System.out.println(s1 + ", " +s2);};		 
		concat2.makeString(s1, s2); //람다식으로 던져주는 변수
		System.out.println();
		
		//3. 익명 내부클래스를 사용해서 출력
		System.out.println("=== Call Method by anonymous Class ===");
		StringConcatImpl concat3 = new StringConcatImpl() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		concat3.makeString(s1, s2);
		
	}
}
