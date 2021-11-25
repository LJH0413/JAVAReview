package java07_inheritance.lab14_TireLifeCycle;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car(); //car 객체 생성
		
		for(int i =0; i<6; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("F-L: Change Tire to HankookTire");
				car.frontLeftTire = new HankookTire("F-L", 15);
				break;
			case 2:
				System.out.println("F-R: Change Tire to KumhoTire");
				car.frontRightTire = new HankookTire("F-R", 13);
				break;
			case 3:
				System.out.println("B-L: Change Tire to HankookTire");
				car.backLeftTire = new HankookTire("B-L", 14);
				break;
			case 4:
				System.out.println("F-L: Change Tire to KumhoTire");
				car.backRightTire = new HankookTire("B-R", 17);
				break;
			}
			System.out.println("--------- " + i + " Cycle" + "---------");
		}
	}

}
