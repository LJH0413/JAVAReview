package java07_inheritance.lab10_polymorphism;

import java.util.ArrayList;

public class AnimalTest4 {

	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public void addAnnimal() { //arraylist 저장하는 메소드
		aniList.add(new Human()); //객체가 arraylist에 저장될때 업캐스팅
		aniList.add(new Tiger()); //<Animal> 타입으로 
		aniList.add(new Eagle()); // Human -> Animal
		//Human human = new Human();
		//Animal animal = new Human 업캐스팅
		
		for(Animal ani : aniList ) { //배열 요소 출력 
			ani.move(); //오버라이딩 된 매소드출
		}
	}
	public void testCasting() { //다운캐스팅
		for(int i = 0; i < aniList.size(); i++) { //.size = arrayList 길이
			Animal ani = aniList.get(i); 
			//aniList.get(i) = 각 방의 값을 가져올떄 출력하는 것
			if(ani instanceof Human) {
				Human h = (Human) ani; //다운캐스팅
				h.read();
			} 
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger) ani; //다운캐스팅
				t.hunt();
			} 
			else if(ani instanceof Eagle)	{
				Eagle e = (Eagle) ani;
				e.flying();
			}else {
				System.out.println("Not exist");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		AnimalTest4 aTest = new AnimalTest4();
 
		aTest.addAnnimal();
		
		aTest.testCasting();
	}

}
