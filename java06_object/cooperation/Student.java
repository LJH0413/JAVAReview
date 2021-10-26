package java06_object.cooperation;

public class Student {
	public String studentName;	//학생이름
	public int grade;			// 학년
	public int money;			// 학생이 가진돈
	
	public Student(String studentName, int money) {	// 학생이름과 가진돈을 초기화
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus (Bus bus) {			// 버스를 탔을때
		bus.take(1000);			// 버스의 수입을 증가, 버스에 돈을 지불 
		this.money -= 1000;	//this.money = this.money - 1000 
	}
	public void takeSubway (Subway subway) {	// 지하철을 탔을때
		subway.take(1500);		// 지하철 요금을 지불
		this.money -= 1500;		// 자신의 돈에서 1500원 지출
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다. ");
	}

}
