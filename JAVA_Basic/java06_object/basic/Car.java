package java06_object.basic;

public class Car { //매서드[생성자] 오버로딩: 같은 이름의 생성자에서 인풋값에 따라 다르게 출력 될 때 사용!
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car() {} // 기본 생성자는 생략가능하지만 다른 생성자가 있고 다른 클래스에서 호출하기 때문에 필
	
	Car(String model) { //인풋(괄호 안)매게변수 이름 할당하는 변수 이름, 메모리 변수  
		this.model = model; //this: 6번 라인에 있는 변수에 초기값을 넣음, 즉 클라스 안에 있는 자신의 변수 다시 호
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}//class
