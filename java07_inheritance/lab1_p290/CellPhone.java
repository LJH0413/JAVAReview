package java07_inheritance.lab1_p290;

public class CellPhone { //모든 핸드폰에서 적용되는 코드 / 상위클래스에서 정의

	String model;
	String color;
	
	//생성자
	
	//메소드
	void powerOn() {
		System.out.println("Power ON " + "(" + model + ")");
	}
	void powerOff() {
		System.out.println("Power Off " + "(" + model + ")");
	}
	void bell() {
		System.out.println("RING RING RINg" + "(" + model + ")");
	}
	void sendVoice(String message) {
		System.out.println("본인: " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	void hangUP() {
		System.out.println("전화를 끊습니다." + "(" + model + ")");
	}


	
}
