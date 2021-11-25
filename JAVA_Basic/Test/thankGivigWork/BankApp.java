package Test.thankGivigWork;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp{

	
	private static ArrayList<BankAccount> banklist = new ArrayList<BankAccount>();
	private static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		

		boolean run = true;

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 >");

			int selectNo = scanner.nextInt();

			if(selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	//계좌 생성하기
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println(" 계좌 생성 ");
		System.out.println("--------------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();

		System.out.print("계좌주: ");
		String owner = scanner.next();

		System.out.print("금액: ");
		int balance = scanner.nextInt();
		
		banklist.add(new BankAccount(ano, owner, balance));
	
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	
	//계좌 목록 보기 
	private static void accountList() {
		System.out.println("--------------");
		System.out.println(" 계좌 목록 ");
		System.out.println("--------------");

		for(int i=0; i<banklist.size(); i++) {
			BankAccount account = banklist.get(i);
			if(banklist.get(i) != null)	{
				System.out.println(
								account.getAno() + "\t" +
								account.getOwner() + "\t" +
								account.getBalance());
			} else break;
			}
	}	


	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int dep = scanner.nextInt();
		
		BankAccount newAccount = findAccount(ano);
		if (findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			findAccount(ano).setBalance(newAccount.getBalance() + dep);
			System.out.println("결과: 입금이 성공되었습니다.");
		}


	}//출금하기
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int withd = scanner.nextInt();

		BankAccount newAccount = findAccount(ano);
		if (findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			if (withd > newAccount.getBalance()) {
				System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
			} else {
				newAccount.setBalance(newAccount.getBalance() - withd);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
			
		}
	}

	//BanKAccount 배열에서 ano와 동일한 account 객체 찾
	private static BankAccount findAccount(String ano) {
		for(int i=0; i<banklist.size(); i++) {
			if(banklist.get(i) == null)	{
				break;
			}
			if(banklist.get(i).getAno().equals(ano)) {
				return banklist.get(i);
			}
		}
		return null;
		

}//class
	
}
