package BankApp;

import java.util.Scanner;

public class BankApp_Run {
	
	BankApp_Method bm = new BankApp_Method();
	Scanner sc = new Scanner(System.in);
	
	boolean run = true;
	
	public void bankApp_Run() {
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 >");

			int selectNo = sc.nextInt();

			if(selectNo == 1) {
				bm.createAccount();
			} else if (selectNo == 2) {
				bm.accountList();
			} else if (selectNo == 3) {
				bm.deposit();
			} else if (selectNo == 4) {
				bm.withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
