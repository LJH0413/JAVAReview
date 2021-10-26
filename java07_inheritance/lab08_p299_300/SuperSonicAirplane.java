package java07_inheritance.lab08_p299_300;

public class SuperSonicAirplane extends Airplane {
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("MODE: SUPERSONIC");
		} else {
			super.fly(); //오버라이딩으로 인하여 상위클래스의 매소드 호출
			System.out.println("MODE: NORMAL"); 
		}
	}
}
