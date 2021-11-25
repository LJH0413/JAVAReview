package java11_basic_class.object.hashcode;

import java.util.Objects;

public class HashCodeEx1 {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "L");
		Student s2 = new Student(1, "L");
		
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		System.out.println();
		
		System.out.println(s1.equals(s2));
		
		

	}
	
	static class Student {
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			Student std = (Student)obj;
			if(sno == std.sno && name == std.name) {
				return true;
			} else return false;
		}


		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
		
	}

}
