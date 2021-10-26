package java07_inheritance.abstract_gameLevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("매우 빠르게 달립니다.");
	} 

	@Override
	public void jump() {
		System.out.println("2단 점프.");
	}

	@Override
	public void turn() {
		System.out.println("좌/우/대각선으로 방향전환.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("====고급자====");
	}

}
