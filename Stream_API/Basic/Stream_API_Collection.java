package Stream_API.Basic;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream_API_Collection {
	public static void main(String[] args) {
		//컬랙션 인터페이스에 stream()메소드 정의 되어있음
		//collection 인터페이스 구현한 모든 list, set 컬랙션 클래스에도
		//stream( ) 메소드로 스트림 생성 가능
		
		//arraylist 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(4); list.add(2); list.add(3); list.add(1);
		
		//컬랙션에서 스트림 생성
		Stream<Integer> stream = list.stream();
		
		//forEach 메소드를 이용한 스츠림 순차 접근
		stream.forEach(System.out::println);
	}

}
