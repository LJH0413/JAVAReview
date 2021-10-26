package java07_inheritance.abstract_gameLevel;

public class Player {
	
	private PlayerLevel level;
	
	public Player() {
		level = new BeginerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgreadeLevel(PlayerLevel level)	{
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
