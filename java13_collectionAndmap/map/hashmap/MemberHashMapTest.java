package java13_collectionAndmap.map.hashmap;

import java13_collectionAndmap.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap mhm = new MemberHashMap();
		
		Member park = new Member(1001, "Park");
		Member lee = new Member(1002, "LEE");
		Member son = new Member(1003, "SON");
		Member su = new Member(900, "SU");
		
		mhm.addMember(park);
		mhm.addMember(lee);
		mhm.addMember(son);
		mhm.addMember(su);
		
		mhm.showAllMember();
	}
}
