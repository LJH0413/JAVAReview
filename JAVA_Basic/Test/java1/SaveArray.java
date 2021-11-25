package Test.java1;

import java.util.Scanner;

public class SaveArray {

	public static void main(String[] args) {

		//배열 생성 
		int [] array = new int[10];
		int size = array.length;
		
		//1 5 99 22 345 125 2346 55  32 85
		System.out.println("[배열 입력]");
		Scanner scanner1 = new Scanner(System.in);

		System.out.print("양의 정수 10개를 입력하세요 >>");
		for(int i=0; i<size; i++) {
			array[i] = scanner1.nextInt();
		}

		//배열 중 3의 배수 찾기 
		System.out.print("3의 배수는: ");
		for(int i=0; i<size; i++) {
			if(array[i] % 3 == 0) {
				System.out.print(array[i] + ", ");
			}
		}

	}

}
