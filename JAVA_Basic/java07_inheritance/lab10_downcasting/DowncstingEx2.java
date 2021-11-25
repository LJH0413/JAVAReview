package java07_inheritance.lab10_downcasting;

public class DowncstingEx2 {

	public static void main(String[] args) {
		Student s; //객체 변수(인스턴수 변수) 선언   타입:클래스 
		Person p;
		
		s = new Student("홍길동");
		
		
		System.out.println("=====업캐스팅=====");
		p = s; //업캐스팅
		p.id = 2000;
		p.name = "김";
		p.fly();
		
		
		System.out.println("=====다운캐스팅=====");
		s = (Student) p;
		s.id = 3000;
		s.name = "홍";
		s.grade = "4";
		s.department = "sales";
		s.fly();
	}

}
