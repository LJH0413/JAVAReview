package java07_inheritance.abstract_Template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다. - ManualCar");
		System.out.println("사람이 방향전환을 합니다 - ManualCar");
		
	}

	@Override
	public void stop() {
		System.out.println("차가 멈춥니다 - ManualCar");
	}

}
