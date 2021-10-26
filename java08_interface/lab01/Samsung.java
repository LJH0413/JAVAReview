package java08_interface.lab01;

public class Samsung implements Phoneinterface{

	@Override
	public void sendCall() {
		System.out.println("Ring~ Ring~ Ring~");
		//구현하는 클래스에서 public을 생략하면 오류, 인터페이스에서는 생략가능
	}

	@Override
	public void receiveCall() {
		System.out.println("Receive Call");
	}
	
	public void flash() { //매소드 추가 작성
		System.out.println("Turn On Flash Light");
	}

	
}
