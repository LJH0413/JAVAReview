package java07_inheritance.lab1_p290;

public class DmbCellPhone extends CellPhone {

	String app;
	
	
	//생성자
	DmbCellPhone(String model, String color, String app) {
		this.model = model;
		this.color = color;
		this.app = app;
	}
	
	//메소드
	void turnOnApp(String app) {
		System.out.println(app + "을 실행합니다.");
	}
	
	void changeApp(String app) {
		this.app = app;
		System.out.println(app + "로 실행중인 앱을 변경합니다.");
	}
	void turnOffApp() {
		System.out.println(app + "를 종료합니다.");
	}
}
