package java08_interface.lab02_scheduler;

public class RoundRobin implements Scheduler{
	//할당제 
	//상담원 한명씩 돌아가며 동일하게 업무 배분

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음순서 상담원에게 배분합니다.");
	} 

}
