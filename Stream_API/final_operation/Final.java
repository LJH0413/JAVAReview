package Stream_API.final_operation;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Final {
	public static void main(String[] args) {
		
		
		System.out.println("use forEach( )");
		Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
		stream1.forEach(System.out :: println);
		System.out.println();
		
		//요소의 소모 reduce
		System.out.println("use reduce( )");
		Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
		Stream<String> stream3 = Stream.of("넷", "둘", "셋", "하나");
		
		Optional<String> result2 = stream2.reduce((s1, s2) -> s1 + "++" + s2);
		result2.ifPresent(System.out::println);
		
		String result3 = stream3.reduce("시작", (s1, s2) -> s1 + "++" + s2);
		System.out.println(result2);
		System.out.println();
		
		//요소의 검색
		//findFirst(), findAny() 해당 스트림에 첫번째 요소 참조 반환
		System.out.println("use findFirst( ), findAny( )");
		IntStream stream4 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
		IntStream stream5 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
		
		OptionalInt result4 = stream4.sorted().findFirst();
		System.out.println(result4.getAsInt());
		
		OptionalInt result5 = stream5.sorted().findAny();
		System.out.println(result5.getAsInt());
		System.out.println();
		
		//요소의 검사
		//anyMatch() : 스트림의 일부 요소가 특정조건 만족시 true 반환	
		//allMatch() : 스트림의 모든 요소가 특정 조건을 만족할 경우에 true 반환	
		//noneMatch() : 스트림의 모든요소가 특정 조건을 만족하지 않은경우 true 반환
		System.out.println("use anyMatch( ), allMatch( ), noneMatch( )");
		IntStream stream6 = IntStream.of(30, 90, 70, 10);
		IntStream stream7 = IntStream.of(30, 90, 70, 10);
		IntStream stream8 = IntStream.of(30, 90, 70, 10);
		
		System.out.println(stream6.anyMatch(n -> n > 80));
		System.out.println(stream7.allMatch(n -> n > 80));
		System.out.println(stream8.noneMatch(n -> n > 80));
		System.out.println();
		
		//요소의 통계
		System.out.println("use count( ), min( ), max( )");
		IntStream str1 = IntStream.of(30, 90, 70, 10);
		IntStream str2 = IntStream.of(30, 90, 70, 10);
		IntStream str3 = IntStream.of(30, 90, 70, 10);
		IntStream str4 = IntStream.of(30, 90, 70, 10);
		IntStream str5 = IntStream.of(30, 90, 70, 10);
		 
		System.out.println(str1.count());
		System.out.println(str2.max().getAsInt());
		System.out.println(str3.min().getAsInt());
		System.out.println(str4.sum());
		System.out.println(str5.average().getAsDouble());
		
		/*
		 * 요소의 수집

collect() 메소드는 인수로 전달되는 Collectors 객체에 구현된 방법대로 스트림의 요소를 수집합니다.
또한, Collectors 클래스에는 미리 정의된 다양한 방법이 클래스 메소드로 정의되어 있습니다.
이 외에도 사용자가 직접 Collector 인터페이스를 구현하여 자신만의 수집 방법을 정의할 수도 있습니다.

스트림 요소의 수집 용도별 사용할 수 있는 Collectors 메소드는 다음과 같습니다.

1. 스트림을 배열이나 컬렉션으로 변환 : toArray(), toCollection(), toList(), toSet(), toMap()
2. 요소의 통계와 연산 메소드와 같은 동작을 수행 : counting(), maxBy(), minBy(), summingInt(), averagingInt() 등
3. 요소의 소모와 같은 동작을 수행 : reducing(), joining()
4. 요소의 그룹화와 분할 : groupingBy(), partitioningBy()

다음 예제는 collect() 메소드를 이용하여 해당 스트림을 리스트로 변환하는 예제입니다.
		 */

	
		
	}
}
