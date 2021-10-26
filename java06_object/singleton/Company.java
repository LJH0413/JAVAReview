package java06_object.singleton;

public class Company {
// 싱글톤: 클래스에서 단 하나의 객체만 생성하도록 구현한 디자인패턴
// 
	
	private static Company instance = new Company();
	//객체 생성을 힙 영역이 아닌 스택영역에 저장 
	//싱글톤 객체는 private static으로 선언 
	
	private Company() {}	//기본생성자를 private로 선언, 외부에서 선언 못하도록 
	
	public static Company getInstance() { //외부에서 객체를 생성할때 메소드를 호출해서 
		if(instance == null) {				//객체가 생성되도록 설
			instance = new Company();
		}
		return instance;
	}
	
}
