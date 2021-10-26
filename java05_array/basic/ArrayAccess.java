package java05_array.basic;

import java.util.Scanner;

public class ArrayAccess { //양의 정수 5개를 받아 배열에 저장하고 제일 큰수 출

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int intArr[] = new int[5];
		int max = 0;
		
		System.out.print("양의 정수 5개 입력 > ");
		
		for(int i=0; i<intArr.length; i++)	{
			intArr[i] = sc.nextInt();
			
			if(intArr[i] > max) 
				max=intArr[i];
		}
			System.out.println(max);
		sc.close();
		
		
	}//main
}//class
