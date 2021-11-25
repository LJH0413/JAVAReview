package java13_collectionAndmap.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("Alpha");
		myList.add("Bravo");
		myList.add("Charlie");
		
		System.out.println(myList);
		System.out.println();
		
		System.out.println("Use Add Method");
		myList.add(1, "PAPA 730");
		System.out.println(myList);
		System.out.println();
		
		System.out.println("Use Add First Method");
		myList.addFirst("Captain of HeadQuters Company");
		System.out.println(myList);
		System.out.println();
		
		System.out.println("Use Add Last Method");
		myList.addLast("Lieutenant");
		System.out.println(myList);
		System.out.println();
		
		System.out.println("Use Remove Method");
		myList.remove(1);
		System.out.println(myList);
		System.out.println();
		
		System.out.println("Use Remove Last Method");
		myList.removeLast();
		System.out.println(myList);
		System.out.println();
		
		System.out.println("Use Remove First Method");
		myList.removeFirst();
		System.out.println(myList);
		System.out.println();
		
		

	}
}
