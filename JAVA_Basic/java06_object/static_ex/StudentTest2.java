package java06_object.static_ex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.studentName = "LEE";
		System.out.println("studentLee SerialNum: " + studentLee.serialNum);
		System.out.println();
		
		Student2 studentKim = new Student2();
		studentLee.studentName = "Kim";
		System.out.println("studentKim SerialNum: " + studentKim.serialNum);
		System.out.println();

		Student2 studentHong = new Student2();
		studentLee.studentName ="Hong";
		System.out.println("studentHong SerialNum: " + studentHong.serialNum);
		System.out.println();

	}
}
