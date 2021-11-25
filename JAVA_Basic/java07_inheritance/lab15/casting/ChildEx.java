package java07_inheritance.lab15.casting;

public class ChildEx {

	public static void main(String[] args) {
		
		Parent parent = new Child(); //업캐스팅(자동형변환)
		parent.field1 = "data1";
		
		parent.method1();
		parent.method2();
		
//		parent.filed2 = " " 불가
//		parent.method3(); 서브클래스의 슈퍼클래스 취급
		
		Child child = (Child)parent; //다운캐스팅(강제형변환)	
		child.field2 = "data2";
		child.method3();
	}

}
