package java07_inheritance.abstract_gameLevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	
	public abstract void jump();
	
	public abstract void turn();
	
	public abstract void showLevelMessage();
	
	final public void go(int count) { //템플릿 메소드, 로직을 구현, 오버라이딩 불가
		run();
		for(int i = 0; i<count; i++) {
			jump();
		}
		turn();
	}

}
