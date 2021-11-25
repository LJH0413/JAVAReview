package java06_object.static_ex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.setStudentName("LEE");
		System.out.println("studentLee serialNum: " + studentLee.serialNum);
		//객체를 생성후 static 멤버 출력
		studentLee.serialNum++;
		
		
		Student studentKim = new Student();
		studentKim.setStudentName("Kim");
		System.out.println("studentKim serialNum: " + studentKim.serialNum);
		studentKim.serialNum++;
		System.out.println();
		
		System.out.println();
		
		System.out.println(Student.serialNum);
		//객체 생성 없이 static 멤버 호출 
		//클래스 이름.  바로 호출 가능 
		Student.serialNum++;
		
		System.out.println();
		
		System.out.println(Student.getSerialNum());
	}

}
