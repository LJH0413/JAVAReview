package java11_basic_class.garbege;

class Employee {
	
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee (" + eno + ") 가 메모리에 생성됨.");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee (" + eno + ") 가 메모리에서 제거됨.");
	}
	
}

public class GcExample {

	public static void main(String[] args) {
		
		//다음중 garbege를 골라라.	
		Employee emp;
		
		emp = new Employee(1); //객체생성
		emp = null; //가비지 강제 발생 
		emp = new Employee(2); // 객체생성 
		emp = new Employee(3); // 객체생성 (1, 2번 가비지)

		System.out.println("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc(); //강제로 가비지콜랙터 호출 
	}

}
