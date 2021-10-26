package Test.thankGivigWork;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		
		ArrayList<Student> scores = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo ) {
			case 1:
				System.out.print("학생수 >");
				studentNum = sc.nextInt();
				for(int i=0; i<studentNum; i++) {
					scores.add(new Student());
					scores.get(i).number=i;
				}
				break;
				
			case 2 :
				for(Student s : scores) {
					System.out.print("scores [" + s.number + "]: " );
					s.setScore(sc.nextInt());
					}
				break;
				
			case 3 :
				for(Student s : scores) {
					System.out.println("scores [" + s.number + "]: " + 
					s.getScore());
					}
				break;
				
			case 4 : 
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(Student s : scores) {
					if(max<s.getScore()) 
						max = s.getScore();
						sum += s.getScore();
				}
				avg = (double) sum / scores.size();
				System.out.println("최고점수: " + max +" \n 평균점수: " + avg);
				
			case 5 :
				run = false;
				
				
			}//switch
			}//while
			
			System.out.println("프로그램 종료");
			sc.close();
			}//main
			
			
			
		
	}//class

	


