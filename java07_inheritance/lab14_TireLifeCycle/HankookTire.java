package java07_inheritance.lab14_TireLifeCycle;

public class HankookTire extends Tire {
	//필드
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire Life Cycle: " + (maxRotation - accumulatedRotation) + "Times");
			return true;
		}else {
			System.out.println("*** " + location + " HankookTire flat Tire ***");
			return false;
		}
	}
	
	

}
