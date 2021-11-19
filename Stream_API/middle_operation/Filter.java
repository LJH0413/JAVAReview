package Stream_API.middle_operation;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Filter {
	public static void main(String[] args) {
		
		IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 6, 4);
		IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 6, 4);
		
		//스트림에서 중복요소 제거
		System.out.println("스트림 중복요소 제거");
		
		//distinct : 해당 스트림에서 중복된 요소 제거
		//매소드 내부에서 obj클래스와 equals매소드 사용하여 중복 비
		stream1.distinct().forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		//스트림에서 홀수만 골라냄
		stream2.filter(n -> n %2 != 0).forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		//스트림 변환
		Stream<String> stream3 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
		//map(s -> s.lenght() : 문자열의 길이로 이루어진 스트림 변환
		stream3.map(s -> s.length()).forEach(System.out :: println);
		System.out.println();
		
		String[] arr = {"I study hard", "You study JAVA", "I am one and only"};
		
		Stream<String> stream4 = Arrays.stream(arr);
		//flatMap(s -> Stream.of(s.split(" +") : 문자열에 단어로 변환
		stream4.flatMap(s -> Stream.of(s.split(" +"))).forEach(System.out :: println);
		
	}

}
