package Test.java1;

import java.util.Scanner;

public class RoctSissorPaper {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String [] str = {"가위", "바위", "보"};
		int n = (int)(Math.random()*3);
		
		System.out.print("가위 바위 보! >> ");
		String user =scanner.nextLine();
		
		for(int i=0; ; i++) {
			
			//user 문자열과 str배열에 배열의 문자열만 비교 
			while(user.equals("가위")) {
				if (n == 0) {//가위
					System.out.println("비겼습니다.");
					break;
				}if (n == 1) {//바위
					System.out.println("사용자가 졌습니다.");
					break;
				}if (n == 2) {//보
					System.out.println("사용자가 이겼습니다.");
					break;
				}
				System.out.println("사용자 : " + user + " 컴퓨터 : " + str[n]);
			}
			while(user.equals("바위")) {

				if (n == 0) {//가위
					System.out.println("사용자가 이겼습니다.");
					break;
				}if (n == 1) {//바위
					System.out.println("비겼습니다.");
					break;
				}if (n == 2) {//보
					System.out.println("사용자가 졌습니다.");
					break;
				}
				System.out.println("사용자 : " + user + " 컴퓨터 : " + str[n]);
			}
			while(user.equals("보")) {
				if (n == 0) {//가위
					System.out.println("사용자가 졌습니다.");
					break;
				}if (n == 1) {//바위
					System.out.println("사용자가 이겼습니다.");
					break;
				}if (n == 2) {//보
					System.out.println("비겼습니다.");
					break;
				}
				System.out.println("사용자 : " + user + " 컴퓨터 : " + str[n]);

			}
			if(user.equals("그만")) {
				System.out.println("게임 종료");
				break;
			}
			scanner.close();
		}//for	
			
		}//main		


	}//class	


