package java12_generic.ex02;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx { // 단어 검색장 (영문, 한글)을 hashmap에 저장
						 // 영어를 넣었을 때 한글을 출	력

	public static void main(String[] args) {
	
		
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		//arrayList = add / hashmap = put
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");

		// 영어 단어를 넣으면 한글 단어 출력
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("찾고싶은 단어 입력(영문): ");
			String eng = sc.next();
			
			if(eng.equals("그만") || eng.equals("exit")) {
				System.out.println("시스템 종료");
				break;
			}

			//hashmap에 영문 값에 할당하는 한글 검색
			String kor = dic.get(eng); // dic에서 영문을 검색하면 한글값으로 저장
			if(kor == null) {
				System.out.println("검색 결과가 없습니다.");
			} else {
				System.out.println(kor);
			}
		}
		sc.close();

	}//main
}//class

