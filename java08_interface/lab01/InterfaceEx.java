package java08_interface.lab01;

public class InterfaceEx {

	public static void main(String[] args) {
		
		Samsung samsung = new Samsung();
		
		samsung.printLogo();
		
		samsung.sendCall();
		
		samsung.receiveCall();
		
		samsung.flash();
		
		System.out.println();
		
		Phoneinterface ph = new Samsung(); //인터페이스 객체 생성은 안되지만 업캐스팅 가능
		//업캐스팅
		ph.printLogo();
		ph.sendCall();
		ph.receiveCall();
//		ph.flash(); 업캐스팅했으므로 불가 
		
		Samsung ss = (Samsung) ph;
		//다운캐스팅
		
	}

}
