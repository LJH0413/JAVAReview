package java07_inheritance.abstract_gameLevel;

public class PlayerTest {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvanceLevel advLevel = new AdvanceLevel();
		player.upgreadeLevel(advLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgreadeLevel(sLevel); //show 인포 출력
		player.play(3); //go 매소드 출력 
	}

}
