package java13_collectionAndmap;

public class Member implements Comparable<Member> {
	
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override 
	public String toString() {
		return memberName + "님의 아이디: " + memberID; 
	}

	@Override
	public boolean equals(Object obj) { //upCasting : obj
		if(obj instanceof Member) {
			Member member = (Member) obj; //downCasting	: obj
			if(this.memberID == member.memberID) { //기존의 memberid와 들어온 객체의 memberid가 같으면
				System.out.println("동일한 회원(객체)입니다(Same memberID)");
				return true;
			}
		}
		System.out.println("다른 회원(객체)입니다.");
		return false;
	}

	@Override
	public int hashCode() {
		return memberID;
	}
	
	public int compareTo(Member member) { //this.memberID = member.ID = 0;
		return (this.memberID - member.memberID); //오름차순
		//return (this.memberID - member.memberID) * (-1); //내림차순
	}
	
	
	
	
			
			

}
