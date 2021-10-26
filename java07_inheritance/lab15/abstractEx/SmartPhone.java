package java07_inheritance.lab15.abstractEx;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner); //owner를 phone클래스 필드에 저장
	}
	
	//매소드
	public void internetSearch() {
		System.out.println("Search - Internet");
	}
}
