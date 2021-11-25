package java07_inheritance.lab14_TireLifeCycle;

public class Tire {
	
	//필드
	public int maxRotation; //최대 회전수
	public int accumulatedRotation; //누적회전수
	public String location; //타이어 위치

	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//매소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire Life Cycle: " + (maxRotation - accumulatedRotation) + "Times");
			return true;
		}else {
			System.out.println("*** " + location + " flat Tire ***");
			return false;
		}
	}
	
	
}
