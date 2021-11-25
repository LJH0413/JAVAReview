package java07_inheritance.test;

import java.util.ArrayList;

class Fruit1 { //부모클래스
	String name; String color; int size; //변수 초기값 할당 1. 생성자, 2.setter, 3.객체에서 변수값 할당
	
	public Fruit1 () {} 
	
	public Fruit1 (String name, String color, int size ) {
		this.name = name; this.color = color; this.size = size;
	}
	public String showInfo() {
		return "과일의 내용을 출력합니다.";
	}
}//Fruit1-class

class Melon extends Fruit1{
	public Melon(String name, String color, int size) {
		super(name, color, size);
	}

	@Override
	public String showInfo() {
		super.showInfo();
		return "fruit name: " + name + " | fruit color: " + color + " | fruit size: " + size;
	}
	public void downcastingMelon() {
		System.out.println("downcasting-Melon");
	}
}//Melon-class

class Mango extends Fruit1{
	public Mango(String name, String color, int size) {
		super(name, color, size);
	}
	@Override
	public String showInfo() {
		super.showInfo();
		return "fruit name: " + name + " | fruit color: " + color + " | fruit size: " + size;
	}
	
	public void downcastingMango() {
		System.out.println("downcasting-Mango");
	}
}//Mango-class

class Grape extends Fruit1{
	public Grape(String name, String color, int size) {
		super(name, color, size);
	}
	@Override
	public String showInfo() {
		super.showInfo();
		return "fruit name: " + name + " | fruit color: " + color + " | fruit size: " + size;
	}
	public void downcastingGrape() {
		System.out.println("downcasting-Grape");
	}
}//Grape-class


public class FruitTest {

	public static void main(String[] args) {

		ArrayList<Fruit1> fruit1 = new ArrayList<Fruit1>();
		
		//업캐스팅
		System.out.println("=====업캐스팅=====");
		Fruit1 melon = new Melon("Melon", "Green", 30);
		Fruit1 mango = new Mango("Mango", "Yellow", 9);
		Fruit1 grape = new Grape("Grape", "Blue", 13);
		
		fruit1.add(melon);
		fruit1.add(mango);
		fruit1.add(grape);
		
		for(Fruit1 fruit : fruit1) {
			System.out.println(fruit.showInfo());
		}
		
		System.out.println();
		
		//다운캐스팅
		System.out.println("=====다운캐스팅=====");
		Melon melon1 = (Melon)melon;
		Mango mango1 = (Mango)mango;
		Grape grape1 = (Grape)grape;
		
		melon1.downcastingMelon();
		mango1.downcastingMango();
		grape1.downcastingGrape();
		
		System.out.println();
		
		System.out.println("======ArrayList 저장된 객체 다운캐스팅======");
		
		for(int i = 0; i<fruit1.size(); i++) {
			Fruit1 f = fruit1.get(i);
			if(f instanceof Melon) {
				Melon m = (Melon)f;
				m.downcastingMelon();
			}
			else if(f instanceof Mango) {
				Mango o = (Mango)f;
				o.downcastingMango();
			}
			else if(f instanceof Grape) {
				Grape g = (Grape)f;
				g.downcastingGrape();
			}
		}
	}

}
