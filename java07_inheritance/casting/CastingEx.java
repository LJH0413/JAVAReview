package java07_inheritance.casting;

class SuperClass {
	public void SuperPrn() {
		System.out.println("SuperClass - SuperPrn Methods");
	}
}

class SubClass extends SuperClass {
	public void SubPrn() {
		System.out.println("SubClass - SubPrn Methods");
	}

	@Override
	public void SuperPrn() {
		super.SuperPrn(); //오버라이딩 전 부모 매소드 호출
		System.out.println("Ovrriding - SuperClass - SuperPrn Metghod");
	}
	
	
}

public class CastingEx {

	public static void main(String[] args) {
		
		SuperClass superclass = new SuperClass();
		SubClass subclass = new SubClass();
		
		superclass.SuperPrn(); //슈퍼클래스 자신의 매소드
		subclass.SubPrn(); //서브클래스 자신의 매소드
		subclass.SuperPrn(); //슈퍼클래스에서 상속받은 매소드
		
		System.out.println("================================");
		
		SubClass subclass2 = new SubClass(); //객체생성
		SuperClass superclass2; //객체 선언

		superclass2 = subclass2; //업캐스팅 sub -> super
		
		superclass2.SuperPrn(); //업캐스팅 이후 상속받은 공통매소드만 사용 가능
//		superclass2.SubPrn(); 사용 불 
		
		System.out.println("================================");
		
		subclass2 = (SubClass)superclass2; // 다운캐스팅
		
		subclass2.SubPrn();
		
		subclass2.SuperPrn();
		
		
		
		
		
	}

}
