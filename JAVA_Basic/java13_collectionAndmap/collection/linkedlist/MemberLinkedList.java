package java13_collectionAndmap.collection.linkedlist;

import java.util.LinkedList;
import java13_collectionAndmap.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> linkedlist;
	public MemberLinkedList() {
		linkedlist = new LinkedList<Member>();
	}
	
	public void addMember(Member member) {
		linkedlist.add(member);
	}
	
	public void addMember2(int a, Member member) {
		linkedlist.add(a, member);
	}
	
	public boolean removeMember(int memberID) {
		for(int i=0; i<linkedlist.size(); i++) {
			Member member = linkedlist.get(i);
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				linkedlist.remove(i);
				System.out.println("deleted member: " + memberID );
				return true;
			}
		}
		System.out.println("Check the MemberID");
		return false;
	}
	
	public void showAllMember( ) {
		for(int i=0; i<linkedlist.size(); i++) {
			Member member = linkedlist.get(i);
			System.out.println(member + "(index " + i + ")");
		}
		System.out.println();
	}

}
