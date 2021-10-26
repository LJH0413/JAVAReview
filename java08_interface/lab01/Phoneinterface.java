package java08_interface.lab01;

public interface Phoneinterface {
	
	int TIMEOUT = 10000;
	//public static 생략
	
	void sendCall();
	//public abstract 생략
	
	void receiveCall();
	//public abstract 생략
	
	default void printLogo() {
		System.out.println("Print the Logo");
	} //public 생략
	

}
