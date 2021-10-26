package java07_inheritance.lab10_polymorphism;

public class AnimalTest1 {
	
	public static void main(String[] args) {
		
		AnimalTest1 aTest = new AnimalTest1();
		
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
		// moveAnimal 매개변수로 인스턴스
		//Animal h = new Human(); 자동으로 생성되어 animal.move가 human.move로 호출
		
		Human.read(); //static 매소드여서 객체 생성없이 클래스.매소드로 사용 가능
		
		Tiger T = new Tiger();
		T.hunt();
		
		Eagle E = new Eagle();
		E.flying();
		
	}
	public void moveAnimal(Animal animal) { //업캐스팅
		//static 객체생성 없이 가능
		//moveAnimal 사용시 객체 생성
		animal.move();
	}

}
