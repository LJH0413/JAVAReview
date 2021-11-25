package Stream_API.middle_operation;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sorted {
	public static void main(String[] args) {
		
		Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
		Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
		
		//sorted 매소드 : 주어진 비교자(comparator)를 이용하여 정렬
		//비교자가 없으면 사전 편찬순으로 (natural order)으로 정렬
		stream1.sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
		
	}

}
