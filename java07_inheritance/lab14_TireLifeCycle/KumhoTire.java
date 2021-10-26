package java07_inheritance.lab14_TireLifeCycle;

public class KumhoTire extends Tire {
	
	//필드
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire Life Cycle: " + (maxRotation - accumulatedRotation) + "Times");
			return true;
		}else {
			System.out.println("*** " + location + " KumhoTire flat Tire ***");
			return false;
		}
	}
	
}
