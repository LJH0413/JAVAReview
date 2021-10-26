package java08_interface.lab02_scheduler;

import java.io.IOException;

public class SchedulerEx {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R: 한명씩 차례로 할당");
		System.out.println("L: 쉬거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P: 우선순위가 가장 높은 고객에게 할당");
		
		System.out.print("선택 > ");
		int ch = System.in.read();
		
		Scheduler scheduler = null; //스캐쥴러 객체 선언
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		} else if(ch == 'L' || ch == 'l') {
			scheduler = new LestJob();
		} else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("다시 선택해주세요");
			return ;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		

	}

}
