package java03_controlStatement;

import java.io.IOException;

public class lfStatement03 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * if문 기본 형식
		 *	if(condition1) {
		 *		condition1
		 *}else if(condition2) {
		 *	condition2
		 *}else if(condition3) {
		 * 	conditon3
		 * } else {
		 *  condition 1~3 거짓일때 수
		 * }
		 */
		
		int kor=99, eng=80, math=89;
		double avg=(kor+eng+math)/3.0;
	
		if(avg>=90) {
			System.out.println("A학점");
		}else if(avg>=80) {
			System.out.println("B학점");
		}else if(avg>=70) {
			System.out.println("C학점");
		}else if(avg>=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		System.out.println("==================");
		
		System.out.println("[한문자를 입력하세요]");
		int word = System.in.read();
		if(word>='0' && word<='9' && word % 2 ==0) {
			System.out.println("2의 배수입니다.");
		}else if(word>='0' && word<='9'&& word % 2 !=0) {
			System.out.println("2의 배수가 아닙니다.");
		}else if(word>='a' && word<='z') {
			System.out.println("소문자입니다.");
		}else if(word>='A' && word<='Z') {
			System.out.println("대문자입니다.");
		}else System.out.println("기타.");
		
		
		System.out.println("===================");
		System.in.skip(1);
		int word1 = System.in.read();
		if(word1 >='0' && word1<='9') {
			System.out.println("숫자.");
		}else if(word1>='a' && word1 <'z' || word1>='A' && word1<='Z') {
			System.out.println("알파벳.");
		}else System.out.println("기타.");
		
		System.out.println(" ");
		
		
		// 세숫자중에 최대값을 구하는 로직 작성
		int num1 = 44, num2 =20, num3=10;
		if (num1 > num2 && num1 > num3) {
			System.out.println("최대값: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("최대값: " + num2);
		} else System.out.println("최대값: " + num3);
		
	}//main

}//class
