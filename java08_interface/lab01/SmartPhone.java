package java08_interface.lab01;

public class SmartPhone extends PDA implements MobilePhoneinterface, MP3interface{

	//phoneinterface => mobilephoneinterface 상속했기때문에 사용 가능
	@Override
	public void sendCall() {
		System.out.println("Ring~");
	}
	@Override
	public void receiveCall() {
		System.out.println("Receive or Deny");
	}

	//mp3interface
	@Override
	public void play() {
		System.out.println("Play the List");
	}
	@Override
	public void stop() {
		System.out.println("Stop the Music");
	}

	//mobilePhoneinterface
	@Override
	public void sendSMS() {
		System.out.println("Send Message");
	}
	@Override
	public void recieveSMS() {
		System.out.println("Receive Message");
	}
	
	public void schedule() {
		System.out.println("Mange the Schedule");
	}
	
}
