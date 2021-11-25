package java07_inheritance.abstract_ex;

import java.util.ArrayList;

public class ComputerTest {

	public static void main(String[] args) {

		ArrayList<Computer> computerList = new ArrayList<Computer>();
//		Computer c = new Computer();
		Computer c1 = new Desktop();
//		Computer c2 = new Notebook();
		Computer c3 = new MyNotebook();
		
		
		System.out.println("====== Desktop 객체 정보 =====");
		c1.display();
		c1.turnOn();
		c1.turnOff();
		System.out.println();
		
		System.out.println("===== MyNotebook 객체 정보 =====");
		c3.display();
		c3.turnOn();
		c3.turnOff();
		System.out.println();
		
		System.out.println("===== 각각의 클래스의 메소드 호출 =====");
		Desktop d = (Desktop) c1;
		d.desktopOnly();
		
		MyNotebook m = (MyNotebook) c3;
		m.myNotebookOnly();
		
		System.out.println("=====각 클래스를 ArrayList에 저장 후 출력 ====");
		
		computerList.add(c1);
		computerList.add(c3);
		
		for(Computer c : computerList) {
			c.turnOn();
			c.display();
			c.turnOff();
		}
		
		
	}

}
