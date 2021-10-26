package java07_inheritance.test;

import java.util.ArrayList;

public class FruitEx {

	public static void main(String[] args) { //arraylist, 객체 저장, 향상된 for문 -> 과일이름, 크기 색 출
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		Fruit apple = new Apple("Apple", "Red", 15);
		Fruit orange = new Orange("Orange", "Orange", 18);
		Fruit banana = new Banana("Banana", "Yellow", 20);
		
		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);
		
		System.out.println("======과일=====");
		for(Fruit f : fruitList) {
			System.out.println(f.ShowFruitInfo());
		}
		
		apple.PriceAndTaste();
	}

}
