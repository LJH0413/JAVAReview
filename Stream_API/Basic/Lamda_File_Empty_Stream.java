package Stream_API.Basic;

import java.nio.file.Files;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lamda_File_Empty_Stream {
	public static void main(String[] args) {
		
		//람다 스트림
		Stream<Integer> stream1 = Stream.iterate(2, n -> n+2);
		
		//파일 스트림
		//path 파일경로
//		String<String> stream2 = Files.lines(Path path);
		
		//빈 스트림
		Stream<Object> stream3 = Stream.empty();
		System.out.println(stream3.count());
		
	}

}
