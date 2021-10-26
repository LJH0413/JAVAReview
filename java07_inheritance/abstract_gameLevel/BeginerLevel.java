package java07_inheritance.abstract_gameLevel;

public class BeginerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("걷습니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프 할 수 없습니다.");
	}

	@Override
	public void turn() {
		System.out.println("방향전환 할 수 없습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("====초보자====");
	}

}
