package java06_object.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		
		// Company myCompany1 = new Company(); //싱글톤이라서 새로운 객체 생성 제
		// Company myCompany2 = new Company();
		
		
		Company myCompany1 = Company.getInstance();
		Company myCompany = Company.getInstance();	
		
		
	}
}
