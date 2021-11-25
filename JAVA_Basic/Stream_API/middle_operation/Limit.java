package Stream_API.middle_operation;

import java.util.stream.IntStream;

public class Limit {
	public static void main(String[] args) {
		
		IntStream stream1 = IntStream.range(0, 10);
		IntStream stream2 = IntStream.range(0, 10);
		IntStream stream3 = IntStream.range(0, 10);
		
//		stream1.forEach(e -> System.out.print(e + " "));
		
		//skip 매소드 첫번째 요소부터 전달된 개수만큼 제외한 나머 
		stream1.skip(4).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//limit 매소드 : 첫번째 요소부터 전달된 개수만큼 반
		stream2.limit(5).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//3번째요소부터 5개 출력
		stream3.skip(3).limit(5).forEach(n -> System.out.print(n + " "));
		
	}

}
