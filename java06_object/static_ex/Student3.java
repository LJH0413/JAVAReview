package java06_object.static_ex;

public class Student3 {
	
	private static int serialNum = 1000;

	//외부 클래스에서 직접 접근을 차단
	//getter, setter 통해서 가능
	//무결성 체크해서 적용 가
	

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
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
