package java13_collectionAndmap.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import java13_collectionAndmap.Member2;

public class MemberTreeMap {

	TreeMap<Integer, Member2> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member2>();
	}
	
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			treeMap.remove(memberID);
			System.out.println(memberID + "has deleted");
			return true;
		}
		System.out.println("Check the MemberID");
		return false;
	} 
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member2 member = treeMap.get(key);
			System.out.println(member);
		}
	}
	
	
}

