package java08_interface.lab01;

public class InterfaceEx2 {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		sp.printLogo();
		sp.sendCall();
		sp.play();
		System.out.println("3과 5를 더하면 " + sp.calculator(3, 5));
		sp.schedule();

	}

}
