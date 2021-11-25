package java13_collectionAndmap.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import java13_collectionAndmap.Member2;

public class MemberTreeSet {

	private TreeSet<Member2> treeset;
	
	public MemberTreeSet() {
		treeset = new TreeSet<Member2>();
	}
	
	public void addMember(Member2 member) {
		treeset.add(member);
	}
	
	public boolean removeMember(int memberID) { 
		
		Iterator<Member2> ir = treeset.iterator();
		while(ir.hasNext()) {
			Member2 member = ir.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				treeset.remove(member);
				System.out.println(memberID +" has deleted");
				return true;
			}
		}
		System.out.println("Check the MemberID");
		return false;
	}
	
	public void showAllINFOR() {
		System.out.println("=== Use Inhanced for ===");
		for(Member2 m : treeset) {
			System.out.println(m);
		}
	}
	
	public void showAllITER() {
		Iterator<Member2> ir	 = treeset.iterator();
		System.out.println("=== Use Iterator ===");
		while(ir.hasNext()) {
			System.out.println(ir.next() + " ");
		}
	}
	
}
