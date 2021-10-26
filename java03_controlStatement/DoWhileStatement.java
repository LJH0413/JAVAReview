package java03_controlStatement;

public class DoWhileStatement {

	public static void main(String[] args) {
		
		/*
		 * do - while
		 * 초기식;
		 *	do {
		 *  수행문n;
		 * 	[증감식]
		 * } while(조건식);
		 * 
		 * 조건식은 비교식 내지 논리식
		 * 무조건 1번 수행
		 * 초기신은 반드시 초기
		 * 
		 */
		//1부터 10까지 누적합
		
		int i = 0;
		int sum = 0;
		do {
			sum+=i;
			i++;
		} while(i<=10);
		
		System.out.println(sum);
		
		/*
		 * 문제 
		 * 1000 1.1
		 * 0100 2.2
		 * 0010 3.3
		 * 0001 4.4
		 */
		
		System.out.println("==============");
		
		i = 1;
		int h = 0;
		do {
		    int j = 1;
			do {
				if(i==j) {System.out.printf("1");
				h=j;
				}else System.out.print("0");
				j++;
			}while(j<=4);
		System.out.printf("(%d,%d)%n", i, h);
		i++;
		} while(i<=4);
		
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 *
		 */
		
		i=1;
		do {
			int k = 1;	
			do {
				if(i>=k) {System.out.printf(" *");
				}else System.out.printf("  ");
				k++;
			}while(k<=5);
			i++;
			System.out.println();
		}while(i<=5);
		
		/* 
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****   
		 */
		
		i =1;
		do {
			int k = 1;
			do {
				if((i+k)>=6) System.out.printf(" *");
				else System.out.printf("  ");
				k++;
			}while(k<=5);
			i++;
			System.out.println();
		}while(i<=5);
		
		
		
		System.out.println(" ===== 구구단 출력 =====");
		i=1;
		do {
			int j = 2;
			do {
				System.out.printf("%d * %d = %d\t",j ,i, i*j);
				j++;
			}while(j<=9);
			i++;
			System.out.println();
		}while(i<=9);
		
		
		
	}// main

}//class
