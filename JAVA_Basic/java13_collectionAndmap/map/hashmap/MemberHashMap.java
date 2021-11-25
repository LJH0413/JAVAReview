package java13_collectionAndmap.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import java13_collectionAndmap.Member;

public class MemberHashMap {

	HashMap<Integer, Member> hashmap;  
	
	public MemberHashMap() {
		hashmap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashmap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		if(hashmap.containsKey(memberID)) {
			hashmap.remove(memberID);
			System.out.println(memberID + "has deleted");
			return true;
		}
		System.out.println("Check the MemberID");
		return false;
	} 
	
	public void showAllMember() {
		Iterator<Integer> ir = hashmap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashmap.get(key);
			System.out.println(member);
		}
	}
}
