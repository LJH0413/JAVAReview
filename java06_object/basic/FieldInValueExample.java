package java06_object.basic;

public class FieldInValueExample {
	
	public static void main(String[] args) {
		
		FieldInValue f1 = new FieldInValue();
		
		System.out.println("byte: " + f1.bf);
		System.out.println("short: " + f1.shf);
		System.out.println("int: " + f1.i);
		System.out.println("long: " + f1.l);
		System.out.println("boolean: " + f1.b);
		System.out.println("char: " + f1.cf);
		System.out.println("float: " + f1.f);
		System.out.println("double: " + f1.d);
		System.out.println("int[]: " + f1.arr);
		System.out.println("String: " + f1.s);
	}

}
