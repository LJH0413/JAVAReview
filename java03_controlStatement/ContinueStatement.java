package java03_controlStatement;

public class ContinueStatement {

	public static void main(String[] args) {

		/*
		 * continue 
		 * 반복문과 함께쓰임
		 * 반복문에서 continu문을 만나면 이후 문장 수행하지 않고 처음으로 돌아
		 */
		
		//1부터 100까지 홀수 합 구하기
		int num = 0;
		int sum = 0;
		for(num=0; num<=100; num++) {
			if(num%2!=0)
			sum+=num;
		}
		System.out.println("[for]1~100 홀수 합: " +sum );
		
		
		num = 0;
		sum = 0;
		for(num=0; num<=100; num++) {
			if(num%2==0) 
				continue;
			sum+=num;
		}
		System.out.println("[for-break]1~100 홀수 합: " +sum );
		
		
		//1부터 100까지 짝수 합 (while)
		while(num<100) {
			if(num%2 != 0) continue;
			sum +=num;
		}
		System.out.println("[while]1~100 홀수 합: " +sum);
		
	}//main

}//class
