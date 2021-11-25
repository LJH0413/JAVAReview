package java03_controlStatement;

import java.io.IOException;

public class whileStatement {

	public static void main(String[] args) throws IOException {

		int i = 1;
		int sum = 0;
		while (i<=10) {
			sum += i;
			i++;
		}
		System.out.println("누적합:" +sum);
		System.out.println("while문 i:" + i);
		
		
		
		int sum1=0;
		int j=1;
		while(j<=1000) {
			if((j%3==0 || j%5==0) && j%15!=0) {
				sum1 += j;
			} j++;
		}
		System.out.println("1000까지 3, 5의 배수이면서 15 배수 제외: "+sum1);
		
		
		/*System.out.println("문자열을 입력하세요.");
		char word;
		
		//사용자가 몇 자를 입력할지 모를 때 사용. 
		while((word=(char)System.in.read()) != 13) {
			System.out.println(word);
		} ///while 
		System.out.println();
		*/
		/*
		 * 1000 (1,1)
		 * 0100 (2,2)
		 * 0010 (3,3)
		 * 0001 (4,4)
		 */
		
		int a = 1;
		
		while (a<=4) {
			int b=1;
			while (b<=4) {
			if(a==b) System.out.printf("1");
			else System.out.printf("0");
			b++; 
			}
			a++;
			System.out.println();
		}
		System.out.println(" ");
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		int k = 1;
		while (k<6) {
			int p = 1; 
			while (p<=k) {
				System.out.printf(" *");
				p++;
			}
			k++;
			System.out.println();
		
		}
		
		System.out.println(" ");
		
		int c = 1;
		while (c<=5) {
			int d = 1; 
			while (d<=5) {
				if (d>=c) System.out.printf(" *");
				else System.out.printf("  ");
				d++;
			}
			System.out.println();
			c++;
		}
	
		//구구단 출력 
		
		i = 1;
		
		while(i<=9) {
			j = 1;
			while(j<=9) {
				System.out.printf(i + "*" + j + "=" + (i*j)+ " ");
				j++;
			}
			i++;
			System.out.println();
			
		}
		
		
		
		
		
		

	}//main
}//class
