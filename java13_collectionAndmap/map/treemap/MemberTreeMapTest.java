package java13_collectionAndmap.map.treemap;

import java13_collectionAndmap.Member2;

public class MemberTreeMapTest {
	
	public static void main(String[] args) {
		
		MemberTreeMap mtm = new MemberTreeMap();
		
		Member2 park = new Member2(1001, "PAKR");
		Member2 lee = new Member2(1002, "LEE");
		Member2 son = new Member2(1003, "SON");
		
		mtm.addMember(park);
		mtm.addMember(lee);
		mtm.addMember(son);
		
		mtm.showAllMember();
		
		
	}

}
