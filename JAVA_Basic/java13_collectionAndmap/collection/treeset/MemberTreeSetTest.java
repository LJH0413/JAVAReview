package java13_collectionAndmap.collection.treeset;

import java13_collectionAndmap.Member2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet mts = new MemberTreeSet();
		
		Member2 park = new Member2(1001, "Park");
		Member2 lee = new Member2(1002, "LEE");
		Member2 son = new Member2(1003, "SON");
		Member2 su = new Member2(900, "SU");
		
		mts.addMember(lee);
		mts.addMember(park);
		mts.addMember(son);
		mts.addMember(su);
		
		
		mts.showAllINFOR();
		System.out.println();
		mts.showAllITER();

	}
}
