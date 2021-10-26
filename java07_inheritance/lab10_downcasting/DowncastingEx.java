package java07_inheritance.lab10_downcasting;

public class DowncastingEx {

	public static void main(String[] args) {

			Person p = new Student("홍길동"); //업캐스팅: 부모 클래스의 필드, 메소드 접
											// 단, 오버라이딩 메소드 호출시 동적바인딩
			p.id = 1000;
			System.out.println(p.id + ", " + p.name);
			
			p.fly();
			
			Student s = (Student) p; //다운캐스팅 부모, 자식 클래스 모두 가
			
			s.department = "HR";
			s.grade = "4";
			s.id = 1001;
			s.name = "Kim";
			
			s.fly();
			
			System.out.println(s.department + " " + s.grade + " " + s.id + " " + s.name);
			
			
	}

}
