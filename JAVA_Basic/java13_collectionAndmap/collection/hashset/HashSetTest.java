package java13_collectionAndmap.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	/*
	 * Set: 1. 순서대로 저장 되지 않는다 (index 번호 없음)
	 *      2. 중복된 값을 저장할 수 없다.(아이디, 주민번호, 쇼핑몰 주문번호 등)	
	 *      3. 출력할 때, 삭제 할 때, 이터레이터 사용
	 *      
	 *      set에서 객체를 중복 없이 저장하기 위해서
	 *      객체 특정 변수에 대해 equals 매소드 재정
	 */
	
	public static void main(String[] args) {
		
		HashSet<String> hashset = new HashSet<String>();
		
		hashset.add("LJH");
		hashset.add("LSS");
		hashset.add("GGK");
		hashset.add("LJH");
		hashset.add("LJH");
		
		System.out.println(hashset);
		System.out.println();
		
		Iterator<String> ir = hashset.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		System.out.println("==== Remove Hash Set ====");
		hashset.remove("LJH");
		Iterator<String> ir2 = hashset.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		
	}
}
