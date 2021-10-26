package java08_interface.lab06;

public class RemoteControlEx {

	public static void main(String[] args) {
		
		System.out.println("A" + "+" + "B");
		
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(false);
		RemoteControl.changeBattery();
		rc.turnOff();
		System.out.println();
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(9);
		rc.setMute(true);
		RemoteControl.changeBattery();
		rc.turnOff();
		
	}

}
