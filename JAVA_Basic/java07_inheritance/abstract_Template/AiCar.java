package java07_inheritance.abstract_Template;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행을 합니다 - AiCar");
		System.out.println("스스로 방향전환을 합니다 - AiCar");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다 - AiCar");
	}
	
	
	
}
