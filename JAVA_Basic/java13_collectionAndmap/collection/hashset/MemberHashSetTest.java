package java13_collectionAndmap.collection.hashset;

import java13_collectionAndmap.Member;

public class MemberHashSetTest {
	
	public static void main(String[] args) {
		
		MemberHashSet mhs = new MemberHashSet();
		
		Member lee = new Member(1001, "LJH");
		Member kim = new Member(1002, "MRK");
		Member son = new Member(1003, "SON");
		Member jun = new Member(1004, "JUN");
		
		mhs.addMember(lee);
		mhs.addMember(kim);
		mhs.addMember(son);
		mhs.addMember(jun);
		
		mhs.showAllMember();
		
		mhs.removeMember(1004);
		mhs.showAllMember();
		System.out.println();
		
		mhs.addMember(new Member(1002, "MRK"));
		mhs.showAllMember();
		
	}

}
