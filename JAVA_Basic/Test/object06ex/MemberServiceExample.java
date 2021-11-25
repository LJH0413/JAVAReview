package Test.object06ex;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		MemberService member = new MemberService("hong", "12345");
		
		boolean result = member.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			member.logout("hong");
		}else {
			System.out.println("ID, password가 일치하지 않습니다.");
		}
		
		
	}

}
