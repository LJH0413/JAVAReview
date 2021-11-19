package Lamda;

import java.util.function.BiFunction;
import java.util.function.Function;

class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() start");
	}
	
	public Member(String id) {
		System.out.println("Member(String id) start");
		this.id = id;
	}
	
	public Member(String name, String id) {
		System.out.println("Member(String name, String id)");
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
}

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		
		//public Member(String id) 생성자 참조
		
		//String 매개변수를 받아서 Member로 형으로 결과 출력
		//즉 String 1개를 받는 Member 생성자는 한개
		Function<String, Member> function1 = Member :: new;
		Member member1 = function1.apply("angel");
		
		
		//String 매개변수를 받아서 Member로 형으로 결과 출력
		//즉 String 2개를 받는 Member 생성자는 한개
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("신천사", "angel");
	}

}
