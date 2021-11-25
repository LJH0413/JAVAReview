package java03_controlStatement;

public class BreakStatement {

	public static void main(String[] args) {

		/*
		 * break : switch case 만나면 다른조건을 비교하지 않고 빠져나옴 
		 * 반복문에서도 더이상 반복문을 실행하지 않고 빠져나
		 */
		
		//for 문에서 break문
		//1부처 100까지의 합
		
		int num = 0;
		int sum = 0;
		for (num=0; num<=100; num++ ) {
			sum += num;
		}
		System.out.println("sum: " + sum);
		
		//1부터 100까지 반복 합계중 합이 100이상이면 반복문으로 빠져나옴
		sum=0;
		for(num=0;num<=100; num++) {
			sum+=num;
			if(sum>=100) break;
		}
		System.out.println("sum: "+sum);
		System.out.println("num: "+num);
		
		//중첩 for문에서 break
		//break사용된 for문만 빠져나옴
		sum=0;
		for(num=0; num<2;num++) {
			System.out.println("outter");
			for(int num2=0; num2<5; num2++) {
				if(num2<=2) {
					System.out.println("inner");
					break;
				}
			}
		}
		
		sum=0;
		outter: for(num=0; num<2;num++) {
			System.out.println("outter1");
			for(int num2=0; num2<5; num2++) {
				if(num2<=2) {
					System.out.println("inner1");
					break outter;
				}
			}
		}
		
		System.out.println(" ");
		
		//while break
		sum=0;
		num=1;
		while(num<=10) {
			if(num==5) break;
			sum+=num;
			num++;
		}
		System.out.println("sum: " +sum);
		System.out.println("num: " +num);
		
		
		//do while break
		sum=0;
		num=1;
		do {
			if(num==5) break;
			sum +=num;
			num++;
		}while(num<=10);
		System.out.println("do=while sum: " + sum);
		
		
	}//main

}//class
