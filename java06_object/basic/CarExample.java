package java06_object.basic;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("car1: " + car1.company);
		System.out.println();
		
		Car car2 = new Car("Sonata");
		System.out.println("car2: " + car2.company);
		System.out.println("car2: " + car2.model);
		System.out.println();
		
		Car car3 = new Car("Tusan", "amazon green");
		System.out.println("car3: " + car3.company);
		System.out.println("car3: " + car3.model);
		System.out.println("car3: " + car3.color);
		System.out.println();
		
		Car car4 = new Car("Avante", "white", 200);
		System.out.println("car4: " + car4.company);
		System.out.println("car4: " + car4.model);
		System.out.println("car4: " + car4.color);
		System.out.println("car4: " + car4.maxSpeed);
		System.out.println();
	}

}
