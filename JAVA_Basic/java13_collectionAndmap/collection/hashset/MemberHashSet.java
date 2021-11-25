package java13_collectionAndmap.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import java13_collectionAndmap.Member;

public class MemberHashSet {
	
	private HashSet<Member> hashset;
	
	public MemberHashSet() {
		hashset = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashset.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = hashset.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				hashset.remove(member);
				System.out.println(memberID + " has deleted");
				return true;
			}
		}
		System.out.println("Check the MemberID");
		return false;
	}
	
	public void showAllMember() {
		for(Member m : hashset) {
			System.out.println(m);
		}System.out.println();
	}
}
