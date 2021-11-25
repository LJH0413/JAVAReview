package java03_controlStatement;

import java.util.Scanner;

public class swithStatement {

	public static void main(String[] args) {
		/*
		 * switch : if 처럼 조건이 붙는 제어문
		 * 
		 * 형식: 
		 * 정수식(산술식): 연산의 결과값이 byte, short. int. char String 타입
		 * 예] num%4 혹는 num
		 * 
		 * switch(정수식)
		 * case 값 1:
		 * 	명령문1;
		 *  break;
		 * case 값 2:
		 * 	명령문2;
		 *	break;
		 * .....
		 * case 값 n:
		 *	명령문n;
		 *	break;
		 *[default :
		 *	명령문m
		 *	[breakl]
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int inputNumber=sc.nextInt();
		System.out.println("입력한 숫자:" + inputNumber);
		System.out.println("나눌 숫자를 입력하세요.");
		int subNumber=sc.nextInt();
		System.out.println("나눌 숫자: " + subNumber);
		int remain = inputNumber%subNumber;
		System.out.println("[if문으로 나머지 값 판단]");
		if(remain==0) {
			System.out.println("나머지: 0");
		} else if(remain ==1) {
			System.out.println("나머지: 1");
		} else System.out.println("나머지: 2");
		
		System.out.println("");
		
		System.out.println("[switch로 나머지 판단]");
		switch (remain) {
		case 0:	System.out.println("나머지: 0");
				break;
		case 1:	System.out.println("나머지: 1");
				break;
		default:System.out.println("나머지: 2");
		
		
		/* 여러case 동시에 처리
		 * case 값 1:
		 * case 값 2:
		 * case 값 n: 실행문 n; break;
		 * 
		 */
		System.out.println("숫자를 입력하세요.");
		int inputNum = sc.nextInt();
		switch (inputNum) {
		case 1: 
		case 2:
		case 100:
		case 200:
			System.out.println("1이거나 2이거나 100이거나 200");
			break;
		case 300:
			System.out.println(inputNum);
		}
		}
		
		/*
		 * 평균을 구해서 90이상 	"a 학점 출력"
		 * 90 >= a 80>= b 60 >= c 60< d
		 */
		
		System.out.println("국어점수 입력:");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력:");
		int eng = sc.nextInt();
		System.out.println("수학점수 입력:");
		int math = sc.nextInt();
		
		int avg = ((kor + eng + math) / 3);
		System.out.println("평균점수: " + avg);
		
		System.out.println("");
		
		switch (avg) {
		case 90:	System.out.println("A학점.");
				break;
		case 80:	System.out.println("B학점.");
				break;
		case 60:	System.out.println("C학점.");
				break;
		default:System.out.println("F학점.");
		}
		
		/*
		 * 브 실 골 출력
		 */
		
		System.out.println("[메달 색을 입력해주세요](Gold, Sliver, Bronze)");
		String medal = sc.next();
		
		switch (medal) {
		case "Gold":	System.out.println("[금메달]");
				break;
		case "Sliver":	System.out.println("[은메달]");
				break;
		case "Bronze":	System.out.println("[동메달]");
				break;
		default:System.out.println("[메달이 없습니다]");
		}
		
		
	}//main

}//class
