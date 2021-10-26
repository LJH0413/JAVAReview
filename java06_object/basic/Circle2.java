package java06_object.basic;

public class Circle2 {
	int radius;
	String name; // 멤버변

	public Circle2() {
		radius = 1;
		name = " ";
	}

	public Circle2(int r, String n) {
		radius = r;
		name = n;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}

	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10, "java Pizza");
		double area = pizza.getArea();
		System.out.println(pizza.name + " Area: " + area);

		Circle2 dount = new Circle2(); // radius =1
		dount.name = "java dount";
		area = dount.getArea();
		System.out.println(dount.name + " Area: " + area);

	}

}
