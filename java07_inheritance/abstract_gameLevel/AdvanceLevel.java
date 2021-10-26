package java07_inheritance.abstract_gameLevel;

public class AdvanceLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("1단 점프.");
	}

	@Override
	public void turn() {
		System.out.println("좌/우 전환이 가능합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("====중급자====");
	}

}
