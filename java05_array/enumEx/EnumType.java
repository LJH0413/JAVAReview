package java05_array.enumEx;

import java.util.Calendar;

public class EnumType {

	public static void main(String[] args) {

		
		Week today;
		today = Week.MONDAY;
		System.out.println(today);
		
		//name()메서드
		String name = today.name();
		System.out.println("name: " + name);
		
		//compareTo 메서드
		Week day1 = Week.MONDAY;
		Week day2 = Week.TUESDAY;
		
		int result = day1.compareTo(day2);
		System.out.println("result:" + result);
		
		int result1 = day2.compareTo(day1);
		System.out.println("result:" + result1);
		
		// same= 0; different (a>b)= -1 different(a<b) = 1
		
		//valueOf
		Week weekDay=Week.valueOf("SATURDAY");
		System.out.println("weekDay:"+ weekDay);
		
		System.out.println();
		
		Calendar cal =Calendar.getInstance();
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		Week tday = Week.MONDAY;
		switch(wk) {
		case 1: today=Week.SUNDAY; break;
		case 2: today=Week.MONDAY; break;
		case 3: today=Week.TUESDAY; break;
		case 4: today=Week.WENDESDAY; break;
		case 5: today=Week.TUESDAY; break;
		case 6: today=Week.FRIDAY; break;
		case 7: today=Week.SATURDAY; break;
		}
		
		System.out.println("today is " + tday);
 	}

}
