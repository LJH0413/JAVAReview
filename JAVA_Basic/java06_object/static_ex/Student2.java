package java06_object.static_ex;

public class Student2 {
	
	public static int serialNum = 1000;

	//static 메모리의 stack 영역에 생성
	//new 없이도 접근 가능: 객체 생성 없이도 접근
	//각각의 객체가 공우하는 메모리 영역
	// 인스턴스 생성 보다 먼저 생성

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}


	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

}
