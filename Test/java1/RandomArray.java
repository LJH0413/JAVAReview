package Test.java1;

import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int [] array = new int[10]; // 0~9까지 배열 
		int sum = 0; //총합 
		double avg = 0; //평균 
		
		
		//랜덤 정수 배열 생성/출력. 
		System.out.print("랜덤한 정수 배열: ");
		for(int i = 0; i<array.length; i++) {
			array[i] = (int)(Math.random()*10+1);
			System.out.print(array[i] + ", ");
		}
		
		//랜덤 생성된 배열 평균 계산 
		System.out.println();
		System.out.print("랜덤한 정수 배열의 평균: ");
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
			
			avg = sum / 10.0;
		}
		System.out.println(avg);


	}

}
