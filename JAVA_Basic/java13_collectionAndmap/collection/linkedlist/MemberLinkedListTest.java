package java13_collectionAndmap.collection.linkedlist;

import java13_collectionAndmap.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		
		MemberLinkedList mem = new MemberLinkedList();
		
		Member memberLee = new Member(1001, "LEE");
		Member memberSon = new Member(1002, "SON");
		Member memberKim = new Member(1003, "KIM");
		
		mem.addMember(memberLee);
		mem.addMember(memberSon);
		mem.addMember(memberKim);
		
//		mem.addMember(new Member(1001, "LJH"));
//		mem.addMember(new Member(1002, "SON"));
//		mem.addMember(new Member(1003, "JUN"));
//		
		mem.showAllMember();
		System.out.println();
		
//		mem.removeMember(1003);
//		mem.showAllMember();
		
		memberLee.equals(memberKim);
	}

}
