package java06_object.static_ex;

public class Television {
	
	static String company = "SamSung";
	static String model = "LCD"; // static 변수에 초기값이 할당 됨 
	static String info; //static 변수에 초기값이 할당 되지 않은 상태 
	
	static { //static 키가 적용된 필드에 초기값을 할당 할 때 사
		info = company + "-" + model;
	}

}
