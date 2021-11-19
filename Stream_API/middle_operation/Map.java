package Stream_API.middle_operation;

import java.util.Arrays;
import java.util.stream.Stream;

public class Map {

	public static void main(String[] args) {
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
