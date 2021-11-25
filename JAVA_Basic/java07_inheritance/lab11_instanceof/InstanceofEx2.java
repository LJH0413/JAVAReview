package java07_inheritance.lab11_instanceof;


class Animal {}	
class Human extends Animal {}
class Tiger extends Animal {}
class Lion extends Animal {}
class Eagle extends Animal {}
class HumanChild extends Animal {}
class HumanChildSon extends HumanChild {}



public class InstanceofEx2 {
	
	static void print(Animal a) {
		if(a instanceof Animal) {System.out.println("Animal");}
		if(a instanceof Human) {System.out.println("Human");}
		if(a instanceof Tiger) {System.out.println("Tiger");}
		if(a instanceof Lion) {System.out.println("Lion");}
		if(a instanceof Eagle) {System.out.println("Eagle");}
		if(a instanceof HumanChild) {System.out.println("HumanChild");}
		if(a instanceof HumanChildSon) {System.out.println("HumanChildSon");}
	}

	public static void main(String[] args) {
		
		System.out.println("new Human > \t"); print(new Human());
		System.out.println();
	
		System.out.println("new Tiger > \t"); print(new Tiger());
		System.out.println();
		
		System.out.println("new Lion > \t"); print(new Lion());
		System.out.println();
		
		System.out.println("new Eagle > \t"); print(new Eagle());
		System.out.println();
		
		System.out.println("new HumanChild > \t"); print(new HumanChild());
		System.out.println();
		
		System.out.println("new HumanChildSon > \t"); print(new HumanChildSon());
		System.out.println();
		

	}

}
