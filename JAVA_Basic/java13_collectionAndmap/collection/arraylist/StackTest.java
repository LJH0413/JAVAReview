package java13_collectionAndmap.collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	//stack 자료구조에 값을 할당: push
	public void push(String data) {
		arrayStack.add(data);
	}
	//stack 자료구조에 값을 할당: push
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("Empty Stack");
			return null;
		}
		System.out.println();
		return (arrayStack.remove(len-1)); //마지막 방에 값을 제거
	}
	
	public void showAll() {
		for(int i=0; i<arrayStack.size(); i++) {
			String a = arrayStack.get(i);
			System.out.println(a);
			
		}
	}
	
}

public class StackTest { //LIFO :마지막에 들어간 자료가 제일 먼저 빠져나오는 구조

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("Alpha");
		stack.push("Bravo");
		stack.push("Charile");
		stack.push("Delta");
		stack.push("Echo");
		
		stack.showAll();
		System.out.println();
		
		System.out.println("==== delete latest data ====");
		System.out.println("deleted date: "+ stack.pop());
		System.out.println();
		stack.showAll();
		
		System.out.println("==== delete latest data ====");
		System.out.println("deleted date: "+ stack.pop());
		System.out.println();
		stack.showAll();

		System.out.println("==== delete latest data ====");
		System.out.println("deleted date: "+ stack.pop());
		System.out.println();
		stack.showAll();

		System.out.println("==== delete latest data ====");
		System.out.println("deleted date: "+ stack.pop());
		System.out.println();
		stack.showAll();

		
		
	}

}
