package Stream_API.Basic;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_API_Numbers {
	public static void main(String[] args) {
		
		//가변 매개변수에서 스트림 생성 
		//of( ) 매소드
		System.out.println("가변 매개변수 of()매소드");
		Stream<Double> stream = Stream.of(4.2, 2.5, 3.1, 1.9);
		stream.forEach(System.out :: println);
		System.out.println();
		
		//지정된 범위의 연속된 정수
		//intStream, LongStream 인터페이스에 range(), rangeClosed() 정의
		System.out.println("지정된 범위의 연속된 정수 range(). rangeclosed() 매소드");
		IntStream stream1 = IntStream.range(1,  4);
		stream1.forEach(e -> System.out.print(e + " "));
		System.out.println();
		// range: 범위의 마지막 정수 포함x, rangeclosed : 범위의 마지막 정수 포함 o	
		IntStream stream2 = IntStream.rangeClosed(1,  4);
		stream2.forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//특정 타입의 난수들
		//Random 클래스에 ints(), longs(), doubles()
		// 매개변수를 전달 받지 않으면 무한스트림 반환
		System.out.println("특정 타입의 난수들");
		IntStream stream3 = new Random().ints(4);
		stream3.forEach(System.out::println);
	}

}
