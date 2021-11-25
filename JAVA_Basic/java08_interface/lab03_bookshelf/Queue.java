package java08_interface.lab03_bookshelf;

public interface Queue { //queue를 책장으로 가정

	void enQueue(String title); //책장에 책이 저장됨.	
	String deQueue(); 			//책장에 책을 가져감.	
	int getSize();				//책장의 책의 개수.
	
}
