package java08_interface.lab02_scheduler;

import java.util.Scanner;

public class SchedulerEx2 {

	public static void main(String[] args) {
		
		Scanner ch = new Scanner(System.in);
		Scheduler scheduler = null; //스캐쥴러 객체 선언
		
		boolean run = true;
		
		while (run) {
			System.out.println("전화 상담 할당 방식을 선택하세요.");
			System.out.println("R: 한명씩 차례로 할당");
			System.out.println("L: 쉬거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P: 우선순위가 가장 높은 고객에게 할당");
			System.out.println("그만: 종료");
			
			System.out.print("선택 > ");
			String sch = ch.next();
			
			if(sch.equals("R") || sch.equals("r"))  {
				scheduler = new RoundRobin();
			} else if(sch.equals("L") || sch.equals("l")) {
				scheduler = new LestJob();
			} else if(sch.equals("P") || sch.equals("p")) {
				scheduler = new PriorityAllocation();
			} else if(sch.equals("그만")) {
				System.out.println("종료합니다");
				run = false;
				ch.close();
				
			} 
			
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			System.out.println();
			System.out.println("===========================");
		}
	}
}
