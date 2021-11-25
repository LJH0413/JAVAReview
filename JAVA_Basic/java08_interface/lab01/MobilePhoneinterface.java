package java08_interface.lab01;

public interface MobilePhoneinterface extends Phoneinterface{
	//인터페이스가 인터페이스를 상속
	
	void sendSMS(); //public abstract 생략
	void recieveSMS(); //추상매소드
	
	

}
