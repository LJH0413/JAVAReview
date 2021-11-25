package java13_collectionAndmap.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("Empty Queue");
			return null;
		} 
		System.out.println("deleted data: " + arrayQueue.remove(0));
		return "";
	}
	
	public void showAll() {
		for(int i=0; i<arrayQueue.size(); i++) {
			String a = arrayQueue.get(i);
			System.out.println(a + " (index " + i +")");
		}
	}
}

public class QueueTest { //FIFO 

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enQueue("Alpha");
		queue.enQueue("Bravo");
		queue.enQueue("Charlie");
		queue.enQueue("Delta");
		queue.enQueue("Echo");
		
		queue.showAll();
		System.out.println();
		
		System.out.println();

		queue.deQueue();
		queue.showAll();
		System.out.println();

		queue.deQueue();
		queue.showAll();
		System.out.println();
		
		queue.deQueue();
		queue.showAll();
		System.out.println();
		
		queue.deQueue();
		queue.showAll();
		System.out.println();
		
		
		

	}

}
