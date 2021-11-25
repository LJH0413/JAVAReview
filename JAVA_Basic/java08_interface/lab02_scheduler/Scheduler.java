package java08_interface.lab02_scheduler;

public interface Scheduler {
	
	
	//추상메소드 public abstract 생략
	void getNextCall();  //다음 콜을 받아오는 매소드
	void sendCallToAgent(); //콜을 에이전트에게 보내는 매소드
}
