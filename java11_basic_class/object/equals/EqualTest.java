package java11_basic_class.object.equals;

class Student{
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return studentID + ", " + studentName;
	}
}

public class EqualTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(100, "lee");
		Student s2 = s1;
		Student s3 = new Student(100, "lee");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		if(s1 == s2) {
			System.out.println("주소 같습니다");
		} else System.out.println("주소 다릅니다");
		
		if(s1.equals(s2)) {
			System.out.println("문자열이 같습니다");
		} else System.out.println("문자열이 다릅니다");
		
		System.out.println();
		
		if(s1 == s3) {
			System.out.println("주소 같습니다");
		} else System.out.println("주소 다릅니다");
		
		if(s1.equals(s3)) {
			System.out.println("문자열이 같습니다");
		} else System.out.println("문자열이 다릅니다");
		
		Object o = s1;
		
		//object클래스의 equals 매소드
		//값을 비교하기 위해서 사용
		
		System.out.println(s1);
		
		
		
		
		
	}
}
