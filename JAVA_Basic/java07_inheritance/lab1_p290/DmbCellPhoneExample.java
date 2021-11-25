package java07_inheritance.lab1_p290;

import java.util.Scanner;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//객체생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("IPhone12", "Graphite", "home");
		
		//상속 받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//dmbcellphone 필드
		System.out.println(dmbCellPhone.app);
		
		//dmbcellphone은 cellphone의 자식 클래스여서 cellphone의 메소드 필드 사용 가능
		
		//상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		
		System.out.println();
		
		System.out.print("메세지를 입력하세요 > ");
		String sendMessage1 = sc.next();
		dmbCellPhone.sendVoice(sendMessage1);
		dmbCellPhone.receiveVoice("안녕하세요");
		System.out.print("메세지를 입력하세요 > ");
		String sendMessage2 = sc.next();
		dmbCellPhone.sendVoice(sendMessage2);
		dmbCellPhone.hangUP();
		
		System.out.println();
		
		System.out.print("시작할 앱을 선택하세요 >");
		String app1 = sc.next();
		dmbCellPhone.turnOnApp(app1);
		System.out.print("앱을 선택하세요 >");
		String app2 = sc.next();
		dmbCellPhone.changeApp(app2);
		dmbCellPhone.turnOffApp();
		
	}

}
