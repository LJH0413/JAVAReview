package java07_inheritance.lab14_TireLifeCycle;

public class Car {

	//필드
	Tire frontLeftTire = new Tire("F-L", 6);
	Tire frontRightTire = new Tire("F-R", 2);
	Tire backLeftTire = new Tire("B-L", 3);
	Tire backRightTire = new Tire("B-R", 4);
	
	//생성자: 디폴트
	
	//매소드
	int run() {
		System.out.println("Car is Running");
		if(frontLeftTire.roll() == false) {
			stop(); return 1;
		}
		if(frontRightTire.roll() == false) {
			stop(); return 2;
		}
		if(backLeftTire.roll() == false) {
			stop(); return 3;
		}
		if(backRightTire.roll() == false) {
			stop(); return 4;
		} return 0;
		
	}
	
	void stop() {
		System.out.println("Stop The Car");
	}
}
