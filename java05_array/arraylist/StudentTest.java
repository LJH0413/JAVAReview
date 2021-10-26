package java05_array.arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "LEE");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("국어", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("========================");
		studentKim.showStudentInfo();
		System.out.println("========================");
		
		Student studentSon = new Student(1003, "Son");
		studentSon.addSubject("국어", 90);
		studentSon.addSubject("영어", 80);
		studentSon.addSubject("수학", 70);
		studentSon.addSubject("물리", 60);
		studentSon.addSubject("철학", 100);
		
		studentSon.showStudentInfo();
	}

}