package java13_collectionAndmap.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import java13_collectionAndmap.Member;

public class TreeSetTest {
	
	/*
	 * tree: 정렬해서 저장 (오름차순)
	 * 		 중복된 값은 저장하지 않음
	 * 		 index가 없다
	 * 		 이터레이터 사용	
	 */
	
	public static void main(String[] args) {
		
		TreeSet<String> treeset = new TreeSet<String>();
		
		treeset.add("LJH");
		treeset.add("SON");
		treeset.add("JUN");
		
		System.out.println(treeset);
		System.out.println();
		
		treeset.add("Delta");
		treeset.add("Echo");
		treeset.add("Alpha");
		treeset.add("Bravo");

		System.out.println(treeset);
		System.out.println();

		for(String s : treeset) {
			System.out.print(s + ", ");
		} System.out.println();
		
		System.out.println();
		System.out.println("==== Use Iterator ====");
		Iterator<String> ir = treeset.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next() + " ");
		}
		}
		
		
	}

