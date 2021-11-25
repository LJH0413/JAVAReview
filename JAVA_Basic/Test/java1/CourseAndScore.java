package Test.java1;

import java.util.Scanner;

public class CourseAndScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		 int score[] = {95, 88, 76, 62, 55};
		 String name = "";
		 int i = 0;
		 
		 while (true) {
			 System.out.print("과목 이름[Java, C++, HTML5, 컴퓨터구조, 안드로이드] >> ");
			 name = sc.next();
			 if(name.equals("그만")) break;
			 for(i=0; i<course.length; i++) {
				 if(course[i].equals(name)) {
					 System.out.println(course[i] + "의 점수는 " + score[i]);
					 break;
					 }
			 }if(i==course.length) { // course.length = 4 
				 System.out.println("없는 과목입니다");
			 }// i++가 되면서 i = 5 > 길이는 4까지니까 equal로 맞는 변수를 찾을 수 없음
		 }
		 sc.close();
	}

}
