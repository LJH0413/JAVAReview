package java07_inheritance.lab15.Drive;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();//드라이버 객체생성
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		driver.drive(bus);
		driver.drive(taxi);
		//Vehicle vehicle = bus;
		//Vehicle vehicle = taxi;
	}

}
