package java12_generic.ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	//해쉬맵을 이용해서 학생이름과 자바 점수를 기록하는 프로그램
	

	public static void main(String[] args) {
		
		HashMap<String, Integer> s = new HashMap<String, Integer>();
		
		s.put("son", 97);
		s.put("jun", 95);
		s.put("hee", 88);
		s.put("hong", 78);
		s.put("ljh", 100);
		
		System.out.println("HashMap에 저장된 요소 개수:" + s.size());
		
		//모든 사람의 이름과 점수를 출력
		Set<String> keys = s.keySet();
		
		//key 문자열을 순서대로 접근하는 이터레이터 리턴
 		Iterator<String> it = keys.iterator();
 		
 		while(it.hasNext()) {
 			String name = it.next();
 			int score = s.get(name);
 			System.out.println(name + " " + score);
 		}

		
	}

}
