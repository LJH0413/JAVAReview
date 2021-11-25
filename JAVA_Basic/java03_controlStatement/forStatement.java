package java03_controlStatement;

public class forStatement {

	public static void main(String[] args) {

		/*
		 * for 명령문 여러번 수행
		 * 
		 * for (초기화식; 반복조건식; 증감식) {
		 * 실행문
		 * }
		 * 
		 * 1] 초기화식 생략: 
		 * int i = 0;
		 * for(조건식; 증감식){
		 * 실행
		 * }
		 * 
		 * 2] 조건식 생략 
		 *for(초기화;; 증감식){
		 * 실행문; break; 브레이크 문이 없으면 무한반
		 *}
		 *
		 * 3] 증감식 생략
		 * for(초기화; 조건식;) {
		 * 실행문; i++;
		 * }
		 */
		
		//1부터 10까지의 합 
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			sum += i;
		}
		System.out.println("total from 1~10: " + sum);
		
		//1부터 10까지중 2의 배수의 
		
		sum = 0; // 위 식에서 나온값이 아닌 초기화 실
		for(int i=0; i<=10; i+=2) {
			sum += i;
		}
		System.out.println("1~10의 2의 배수 합: " +sum);
			
		// 문] 1부터 100까지 숫자중 3의 배수  5의 배수 
	
		int total1 = 0;
		
		for(int j=0; j<=100; j++) {
			if(j%3 == 0|| j%5 ==0) 
			total1 +=j;
		}
		System.out.println("total:" + total1);
		
		int total2 = 0;
		
		for(int k=0; k<=100; k++) {
			if((k%15 != 0) && (k%3==0 || k%5==0))
				if(k%3==0 || k%5==0)
			total2 +=k;
		}
		System.out.println("total2: " + total2);
		
		
		/*int total2 = 0;
		
			for(int k=0; k<=100; k++) {
				if(K%3==0 ^ k%5==0) 
				sum +=k;
			}
		System.out.println("total2: " + total2);
		 * 
		 */
		
		/* 2중for문
		 * 밖은 행, 안은 
		 */
		
		/*
		 * 0001 (1,4)
		 * 0010 (2,3)
		 * 0100 (3,2)
		 * 1000 (4,1)
		 */
		int x = 0;
		for(int h=1; h<5; h++) {
			for(int y=1; y<5; y++) {
				if(h+y == 5) {
				System.out.printf("1");
				x=y;
				} else System.out.printf("0");
			}
		System.out.printf("(%d,%d)%n",h,x);
		
		System.out.println("================");
		}
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for(int w=1; w<6; w++) {
			for(int e=1; e<6; e++)
				if(w>=e) {
					System.out.printf(" *");
				} else System.out.printf(" ");
			System.out.println(); // *출력후 개행 
		}
		System.out.println("==============");
		/*
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 */
		for(int w=5; w>0; w--) {
			for(int e=1; e<6; e++)
				if(e>=w) {
					System.out.printf(" *");
				} else System.out.printf("  ");
			System.out.println(); // *출력후 개행 
		}
		System.out.println("==============");
		
		//구구단 출력
		
		for(int n=1; n<10; n++) {
			for(int m=2; m<10; m++) {
				System.out.printf("%d * %d = %-3d", m,n,(n*m));
			}
			System.out.println();
		}
		
		/*for(int n=2; n<10; n++) {
		for(int m=1; m<10; m++) {
			System.out.println(n + "*" + m + "=" +(n*m);
		}
		System.out.println();
	} */
	
		//infinite loop
		
		
	} // main

} // class
