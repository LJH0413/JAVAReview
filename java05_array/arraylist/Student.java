package java05_array.arraylist;

import java.util.ArrayList;

public class Student {
	
	int studentID; //학번
	String studentName; //이름
	ArrayList<Subject> subjectList; //ArrayList 선언  
	//다른 패키지의 클래스를 사용할때 import가 필요
	
	public Student (int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); //subject 배열 변수 생성
	//ArrayList<Subject> subjectList = new ArrayList<Subject>();
		//선언과 동시에 ArrayList 객체 배열 생성
	}//Student
	
	public void addSubject(String name, int score) { //
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);//리스트에과목 넣기"
	}//addSubject	
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
		System.out.println(studentName + "학생의 " + s.getName()
						+ "과목 성적은 " + s.getScorePoint() + "점 입니다.");
		}
		System.out.println(studentName + "학생의 총점은 " + total
							+ "점 입니다. ");
	}//showStudentInfo
}
