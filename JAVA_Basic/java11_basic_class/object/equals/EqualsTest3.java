package java11_basic_class.object.equals;

class Student3 { //toString 재정의 :(ID, name)를 출력 
	int ID;
	String name;
	int grade;
	
	public Student3(int ID, String name, int grade) {
		this.ID = ID;
		this.name = name;
		this.grade = grade;
	}
	//문제 
	//1. toString 재정의 :이름과 학년 출력
	//2. equals 재정의: name 같을 때 true return.
	//3. hashCode 재정의: 객체 이름이 같을 때

	@Override
	public String toString() {
		return "이름: " + name + ", " + "학년: " + grade; 
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student3) {
			Student3 std = (Student3)obj; //obj 클래스를 다운 캐스팅
			if(name == std.name) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	
}

public class EqualsTest3 {

	public static void main(String[] args) {
		
		Student3 s1 = new Student3(10, "이준희", 4);
		Student3 s2 = new Student3(10, "이준희", 4);
		
		Student3 s3 = s1;
		Student3 s4 = new Student3(10, "이준", 5);
		
		System.out.println("toString method");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4 .toString());
		System.out.println();
		
		System.out.println("compare use [==]");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println();
		
		System.out.println("compare equals methods");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println();

		System.out.println("compare hashCode");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println();
		
		System.out.println("compare identityhashCode");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		

		
		

	}

}
