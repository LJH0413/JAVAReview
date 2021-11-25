package java07_inheritance.lab08_p299_300;

public class SuperSonicAirplaneEx {

	public static void main(String[] args) {
		
		SuperSonicAirplane SSA = new SuperSonicAirplane();
		
		SSA.takeOff();
		SSA.fly();
		SSA.flyMode = SuperSonicAirplane.SUPERSONIC;
		SSA.fly();
		SSA.flyMode = SuperSonicAirplane.NORMAL;
		SSA.fly();
		SSA.land();

	}

}
