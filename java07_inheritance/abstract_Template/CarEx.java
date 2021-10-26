package java07_inheritance.abstract_Template;

public class CarEx {

	public static void main(String[] args) {
		System.out.println("==== 자율 주행 자동차 ====");
		Car aiCar = new AiCar();
		aiCar.RUN();
		
		System.out.println();
		
		System.out.println("==== 매뉴얼 자동차 ====");
		Car manualCar = new ManualCar();
		manualCar.RUN();

	}

}
