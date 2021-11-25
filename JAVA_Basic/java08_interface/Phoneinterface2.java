package java08_interface;

public interface Phoneinterface2 {
		//인터페이스: 클라이언트가 회사내부의 서버 서비스를 사용 할 수 있는 접점.
		//상수와 추상메소드만 존재한다.	 변수와 객체 생성 불가.
	
	public static final int TIMEOUT = 10000;
	//int TIMEOUT = 10000; //public static final 생략가능
	
	public abstract void sandCall();
	//void sandCall(); //public abstract 생략가능
	
	public abstract void recieveCall();
	//void recieveCall();
	
	public default void printLogo() {
		System.out.println("Print the Logo");
	}
	//public 생략가능 
//	default void printLogo() {
//		System.out.println("Print the Logo");
//	}
	
	

}
