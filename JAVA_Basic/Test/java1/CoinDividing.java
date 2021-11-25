package Test.java1;

import java.util.Scanner;

public class CoinDividing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		//변수
		int [] won = new int[8];
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

		//금액 입력 받기
		System.out.print("금액을 입력하세요 >>");
		Scanner scanner1 = new Scanner(System.in);
		int money = scanner1.nextInt();

		//금액 나누기
		for(int i=0; i<=8; i++) {
		won[i] = money / unit[i];
		money = money % unit[i];
		System.out.println(unit[i] + "원 권 " + won[i]);
		}
	}

}
