package java06_object.static_ex;

public class StudentTest3 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.studentName = "LEE";
		System.out.println("studentLee SerialNum: " + studentLee.getSerialNum());
		System.out.println();
		
		Student3 studentKim = new Student3();
		studentLee.studentName = "Kim";
		System.out.println("studentKim SerialNum: " + studentKim.getSerialNum());
		System.out.println();

		Student3 studentHong = new Student3();
		studentLee.studentName ="Hong";
		System.out.println("studentHong SerialNum: " + studentHong.getSerialNum());
		System.out.println();
	}

}
