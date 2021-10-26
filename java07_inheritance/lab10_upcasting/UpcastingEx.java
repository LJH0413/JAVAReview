package java07_inheritance.lab10_upcasting;

public class UpcastingEx {

	public static void main(String[] args) {

			Person p = new Person("hong");
			Student s = new Student("Jang");
			
			System.out.println(p.name);
			System.out.println(s.name);
			
			s.department = "Com";
			  
			p = s; //업캐스팅
			//Person p = new Student();
			//p는 Person의 필드와 메소드만 접근
			//단, 메소드 오버라이딩 된 메소드에 접근시
			// 동적바인딩에 의헤 자식의 메소드 를 호출 
			
			System.out.println(p.name);
			
			p.fly(); //하위클래스에 있는 메소
			
//			p.grade = "A";
//			p.department = "Com";
//			
			
	}

}
