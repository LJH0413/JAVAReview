package java11_basic_class.object.equals;

import java.util.Objects;

class MyDate{
	
	int day;
	int month;
	int year;
		//1. toString 매소드 재정의 : 2021년. 09월, 27일
		//2. equals 매소드 재정의 : 두개의 객체를 만들어서 년, 월, 일이 같을 때 true
		//3. hashCode 매소드 재정의 : 일 + 월 + 년도
	
	public MyDate() {}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		this.year = year;
		this.month = month;
		this.day = day;
		
		// year = 2021; month = 9; day = 27;
		return year + "년 " + month + "월 " + day + "일";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate ymd = (MyDate)obj; //obj 클래스를 다운 캐스팅
			if(this.year == ymd.year && this.month == ymd.month && this.day == ymd.day) {
				return true;
			} 
			else {
				return false;
			}
		}
		return false;	}
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
}
public class EqualsTest4 {

	public static void main(String[] args) {
		
		MyDate ymd1 = new MyDate(2021, 10, 1);
		
		MyDate ymd2 = new MyDate();
			   ymd2.day = 1;
			   ymd2.month = 10;
			   ymd2.year = 2021;

		MyDate ymd3 = new MyDate();
		ymd3.setDay(1);
		ymd3.setMonth(10);
		ymd3.setYear(2021);
		
		System.out.println("compare (==)");
		System.out.println(ymd1 == ymd2);
		System.out.println(ymd1 == ymd3);
		System.out.println(ymd2 == ymd3);
		System.out.println();
		
		System.out.println("equals Method");
		System.out.println(ymd1.equals(ymd2));
		System.out.println(ymd1.equals(ymd3));
		System.out.println(ymd2.equals(ymd3));
		System.out.println();
		
		System.out.println("toString Method");
		System.out.println(ymd1.toString());
		System.out.println(ymd2.toString());
		System.out.println(ymd3.toString());
		System.out.println();
		
		System.out.println("hashCode Method");
		System.out.println(ymd1.hashCode());
		System.out.println(ymd2.hashCode());
		System.out.println(ymd3.hashCode());
		
	}

}
