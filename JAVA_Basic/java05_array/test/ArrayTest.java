package java05_array.test;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 방의 수를 입력 받아 배열의 크기를 생성하고
		// 각 방에 정수를 넣어 각방의 내용을 출력하세요(향상된for문)
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		double avg;
		
		//배열의 개수 지정 
		System.out.print("배열의 개수를 입력하세요 >> ");
		int i = sc.nextInt();
		int intArr[] = new int[i];
		System.out.println("배열의 길이: " + intArr.length);
		
		//배열의 정수 입력
		System.out.println("배열에 들어갈 정수를 입력하세요 >> "+i + "개");
		
		for (int j=0; j<intArr.length; j++) {
			intArr[j] = sc.nextInt();
		}
		sc.close();
		
		//배열의 총합
		for (int t : intArr) {
			total += t;
		}
		System.out.println("입력한 배열의 총합: " + total);
			
		//입력한 배열의 평균
		avg = (double) total/intArr.length;
		System.out.println("입력한 배열의 평균: " + avg);
		
	}//main
}//class
