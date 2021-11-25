package java06_object.final_ex;

public class Person {

		final String nation = "korea";
		//final : 변수 앞에 = 상수, 값을 변경할 수 없다
		//final : 클래스 = 자식객체를 허용하지 않는다 
		//final : 메소드 = 메소드 오버라이딩이 불가하다 
		// 메소드 오버라이딩: 상속관계에서 부모 클래스에서 선언된 메소드를 자식 클래스에서 재정의해서 사용 
		// 메소드 오버로딩 : 동일한 매소드 이름으로 매게 변수를 달리해서 메소드를 실행 
		final String ssn; // 주민번호, 객체를 생성할 때 초기값을 할당, 수정하지 못하도록 설
		String name;
		
		public Person(String ssn, String name) {
			this.ssn = ssn;
			this.name = name;
			
			
		}
}
