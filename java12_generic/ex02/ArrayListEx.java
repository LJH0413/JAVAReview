package java12_generic.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		//이름 4개를 입력받아 arrayListd에 저장하고 제일 긴 이름을 출력
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<String>();
		
		for(int i=0; i < 4; i++) {
			System.out.println("이름을 입력하세요 > ");
			a.add(sc.next());
		}
		
		System.out.print("모든 이름 출력: ");
		for(String s : a ) {
			System.out.print(s + " ");
			System.out.println();
		}
		
		int longnameindex = 0;
		for(int i=0; i<a.size(); i++) {
			if(a.get(longnameindex).length() < a.get(i).length()) { //이름의 길이 비교
				longnameindex = i; // 제일 긴 배열방의 인덱스 넘버가 저장
			}
		}
		System.out.println("Longest Name: " + a.get(longnameindex));
		
		System.out.println("=== 각 방의 글자의 길이 ===");
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i) + " " + i +"번방의 글자 길이: " + a.get(i).length());
			
		}
	}

}
