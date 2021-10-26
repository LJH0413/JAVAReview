package java06_object.basic;

public class Member {

	//필드 (인스턴스)
	int age;
	String name;
	String ID;
	String password;
	
	// 생성자 
	public Member(String name, String ID) {
		this.name = name; //매게변수로 필드초기화 
		this.ID = ID; //매개변수로 필드초기화 
	}
	// 객체 생성 
	Member user1 = new Member("홍길동", "hong");
	Member user2 = new Member("김자바", "java");
}
