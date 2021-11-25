package java14_lamda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sl = new ArrayList<String>();
		
		sl.add("Alpha");
		sl.add("Bravo");
		sl.add("Delta");
		sl.add("Charlie");
		sl.add("Echo");
		
		System.out.println("=== 스트림 사용하여 출력 ===");
		//1.첫번째 스트림
		Stream<String> stream = sl.stream(); //컬랙션의 스트림 생성
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println("\n");
		
		//2.두번째 스트림
		System.out.println("=== 정렬해서 출력 === (sorted)");
		sl.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println("\n");
		
		//3.세번째 스트림
		System.out.println("=== 배열의 글자수 출력 === (map)");
		sl.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));
		System.out.println("\n");
		
		//4.네번째 스트림
		System.out.println("=== 글자가 5자 이상 이름 출력: 필터(조건을 사용해서 걸러내는 것) ===");
		sl.stream().filter(s -> s.length() >=5).forEach(s -> System.out.print(s + " "));
		System.out.println("\n");
		
		String a = "ABCDEF";
		System.out.println(a + "의 바이트 수: "+a.length());
		
		
	}
}
