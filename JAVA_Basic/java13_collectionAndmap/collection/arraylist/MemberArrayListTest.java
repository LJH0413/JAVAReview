package java13_collectionAndmap.collection.arraylist;

import java13_collectionAndmap.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList mem = new MemberArrayList();
		
		Member memberLee = new Member(1001, "LEE");
		Member memberSon = new Member(1002, "SON");
		Member memberKim = new Member(1003, "KIM");
		Member memberJun = new Member(1004, "JUN");
		Member memberSon2 = new Member(1002, "SON");
		Member memberKim2 = new Member(1003, "KIM");
		
		mem.addMember(memberLee);
		mem.addMember(memberSon);
		mem.addMember(memberKim);
		mem.addMember(memberJun);
		mem.addMember(memberSon2);
		mem.addMember(memberKim2);
		
		mem.showAllMember();
		
		mem.addMember2(2, new Member(2000, "LJH"));
		System.out.println();
		
		mem.showAllMember();
		
		
//		System.out.println(memberLee.hashCode());
//		System.out.println(memberSon.hashCode());
//		System.out.println(memberKim.hashCode());
//		System.out.println(memberJun.hashCode());
//		System.out.println(memberSon2.hashCode());
		
		//member 비교
		memberSon.equals(memberLee);
		memberSon.equals(memberSon2);
		System.out.println();
		//remove
		mem.removeMember(1003);
		System.out.println();
		
		mem.showAllMember();
		
	}

}
