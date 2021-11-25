package java13_collectionAndmap.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import java13_collectionAndmap.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList; 
	
	//생성자
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) { // 멤버 추가
		arrayList.add(member);
	}
	
	public void addMember2(int a, Member member) { // 멤버 추가
		arrayList.add(a, member);
	}
	
	
	public boolean removeMember(int memberID) { //memberID 삭제
		//for문 사용 
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i); //모든방을 검색
			int tempID = member.getMemberID(); //객체의 저장된 memberID를 가져와서 tempID에 저장
			if(tempID == memberID) {
				arrayList.remove(i);
				System.out.println(memberID + "가 삭제되었습니다");
				return true;
			} 
		}
		System.out.println("ID를 확인해주세요.");
		return false;
	}
	
	public boolean removeMember2(int memberID) { //memberID 삭제
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) { //다음방의 값이 존재하면(true), 없으면 (false) 
			Member member = ir.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(member); //객체 이름을 받아서 객체를 삭제
				return true;
			}
		} return false;
	} 
	
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member + " (index: " + i + ")");
		}
		System.out.println();
	}
	
}
