package java07_inheritance.q.copy;

public class A {
	
	private int pri; // 같은 클래스 내에서만 호출/사용

	int def; // 같은 패키지 내에서 호출/사

	protected int pro; // 상속된 다른패키지 호출/사

	public int pub; //어디서든 접근가능

	public void setA() {
		pri = 5;
	}

}
