package java07_inheritance.lab12_method_overriding;

class Weapon {
	protected int fire() {
		return 1; //무기의 레벨, 무기는 1명만 살상 가능
	}
}

class Cannon extends Weapon { //야포 기대효과: 10명 
	@Override
	protected int fire() {
		return 10;
	}
	
	protected void Info() {
		System.out.println("Good");
	}
}


public class Overriding {

	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("기본 살상 능력: " + weapon.fire());
		
		weapon = new Cannon(); //다운캐스팅
		System.out.println("기대효과: " + weapon.fire());
		
		Cannon c = (Cannon) weapon;
		c.Info();
	}

}
