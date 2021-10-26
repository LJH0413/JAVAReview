package java10_exception.auto_close;

public class AutoCloseObj implements AutoCloseable{
	//자동으로 객체를 해제 하려면 AutoCloseable interface구현
	// close() 매소드 오버라이딩 해야 한다
	//try with resource 구문을 사용

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 제거 되었습니다.");
	} 

}
