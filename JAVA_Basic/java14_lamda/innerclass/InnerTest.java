package java14_lamda.innerclass;

class OutClass { //외부클래스: 
	
	private int num = 10; //외부클래스의 인스턴수 변수
	private static int sNum = 20; //
	
	private InClass inclass; //외부에 클래스를 객체화 할 때 내부클래스도 객체화
	
	//생성자 외부클래스 생성자 호출시 내부 클래스도 객체
	public OutClass() {
		inclass = new InClass();
	}
	
	void outTest1() {
		System.out.println("instance method of instance outclass");
	}
	
	static void outTest2() {
		System.out.println("static method of outclass");
	}
	
	public void usingClass() { //내부클래스 변수를 사용하여 메소드 호출
		inclass.inTest();
	}
	
	class InClass { //내부클래스: 외부클래스와 빈번하게 작업을 처리
		
		int inNum = 100; //내부클래스의 인스턴수 변수
		//static int sInNum = 200; //내부클래스에서는 정적변수 사용불가
		//클래스에 static 이 붙으면 정적변수 사용 가능
		
		void inTest( ) {
			System.out.println("OutClass num = " + num + "(instance of outclass)");
			System.out.println("OutClass sNum = " + sNum + "(static of outclass)");
			System.out.println("innerClass num = " + inNum + "(instance of innerclass)");
		}
		
		public void usingClass() { //내부클래스 변수를 사용하여 메소드 호출
			inclass.inTest();
		}
	}//innerclass
	
	static class InStaticClass { //정적 내부 클래스
		
		int inNum = 101;
		static int sInNum = 201;
		
		void inTest( ) {
			//num += 10; //외브 클래스의 인스턴스 변수를 사용 할 수 없다.
			System.out.println("INStaticClass inNum = " + inNum + "(instance of innerclass");
			System.out.println("INStaticClass sInNum = " + sInNum + "(static of innerclass");
			System.out.println("OutClass sNum = " + sNum + "(static of outclass)");
		}
		
		static void sTest( ) {
			//num += 10; //외브 클래스의 인스턴스 변수를 사용 할 수 없다.
			sInNum += 10;
			
			System.out.println("OutClass sNum = " + sNum + "(static of outclass)");
			System.out.println("INStaticClass sInNum = " + sInNum + "(static of innerclass");
		}
		
		
	}//InStaticClass 
	
}//outclass

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass oc = new OutClass();
		System.out.println("call outclass to use innerclass");
		
		oc.usingClass();
		System.out.println();
		
		OutClass.InClass ic = oc.new InClass();
		System.out.println("외부 클래스 변수를 사용 내부 클래스 객체 생성");
		ic.inTest();
		System.out.println();
		
		OutClass.InStaticClass sic = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 매소드 호출");
		sic.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스 스태틱 매소드 호출");
		OutClass.InStaticClass.sTest(); //객체 생성 없이 클래스 이름으로 호출
		 
		
		
		
		
	}
}
