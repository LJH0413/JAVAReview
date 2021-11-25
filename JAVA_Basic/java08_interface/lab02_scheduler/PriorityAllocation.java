package java08_interface.lab02_scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 스킬이 높은 상담원에게 우선 배분합니다.");
	}
	//고객등급이 높은 순서대로 대기열에서 가져와 업무 능력이 좋은 상담원에게 배분
}
