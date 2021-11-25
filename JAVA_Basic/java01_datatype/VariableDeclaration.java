package java01_datatype;

public class VariableDeclaration {
	
	public static void main(String[] args) {
		System.out.println("[변수 선언 방법 첫번째]");
		//dataType
		int num; // int형을 가진 num 방을 만드는 것 
		num = 10; //변수 초기화, num방에 선언  
		
		int bnum = 0B1010; //2진수 
		int Onum = 012; //8진수 
		int hnum = 0xA;
		System.out.println("num: " + num);
		System.out.println("bnum: " + bnum);
		System.out.println("Onum: " + Onum);
		System.out.println("hnum: " + hnum);
		
		System.out.println(" ");
		
		System.out.println("[변수 선언 방법 두번째]");
		int initnum = 200; //8~9행 합친것  선언과 동시에 초기화 
		System.out.println("initnum: " + initnum);
		
		System.out.println(" ");
		
		System.out.println("[변수 선언 방법 세번째 - 동시에 같은 타입 여러개 선언]");
		int fnum, snum = 300, tnum;
		//System.out.println(fnum); 초기화 오류 
		fnum = snum;
		System.out.println("fnum: " + fnum);
		tnum = 500;
		System.out.println("snum+tnum = " + (snum + tnum));
		
		int fNum; //자바는 대소문자 구분 
		
		/*변수 선언 규칙 
		  1. 대소문자, 숫자로 구분 
		  2. 숫자로 시작할 수 없다
		  3. 특수문자가 올 수 없다
		  4. 예약어를 사용 할 수 없다. */
		
	}
}
