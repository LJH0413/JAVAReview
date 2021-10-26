package Test.object06ex;

public class MemberService {
	
	//필드
	String ID;
	String password;
	
	//생성자
	MemberService(String ID, String password) {
		this.ID = ID;
		this.password = password;
	}
	//매소드
	public boolean login(String ID, String password) {
		if(ID == "hong" && password == "12345") {
			return true;
		} else return false;
	}

	public void logout(String ID) {
		if(ID == "hong") {
			System.out.println("로그아웃 되었습니다."	);
		}
	}


}
