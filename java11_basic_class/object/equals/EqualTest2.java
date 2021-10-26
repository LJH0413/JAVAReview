package java11_basic_class.object.equals;

class Student2	{
	int studentID;
	String studentName;
	
	public Student2(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return studentID + ", " + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student2) {
			Student2 std = (Student2)obj;
			if(studentID == std.studentID) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() { //equals 매소드를 오버라이딩해서 객체 값을 비교할
		return studentID;	// 비교하는 변수의 hashCode()매소드를 오버라이딩 
	}
	
	
}


public class EqualTest2 {

	public static void main(String[] args) {
		
		Student2 s1 = new Student2(1000, "이순신");
		Student2 s2 = new Student2(1000, "이순신");
		
		System.out.println(s1);
		System.out.println("주소비교(==): " + (s1 == s2));
		System.out.println("주소비교(equals): " +s1.equals(s2));
		//object class equals	매소드는 주소를 비교
		//객체의 studentID가 같은 경우 같다라고 재정의 equals매소드 오버라이딩
		
		
		System.out.println("s1 해쉬코드: " + s1.hashCode());
		System.out.println("s2 해쉬코드: " + s2.hashCode());
		
		System.out.println("s1 실제 주소: " + System.identityHashCode(s1));
		System.out.println("s2 실제 주소: " + System.identityHashCode(s2));
	}

}
