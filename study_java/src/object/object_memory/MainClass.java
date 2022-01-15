package object.object_memory;

public class MainClass {

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass();
        ObjectClass obj2 = new ObjectClass();
        ObjectClass obj3 = new ObjectClass();

        //각 클래스의 레퍼런스 주소
        System.out.println("obj1 : " + obj1);
        System.out.println("obj2 : " + obj2);
        System.out.println("obj3 : " + obj3);

        System.out.println();

        //자료형이 같아도 다른공간에 존재하면 다른 객체
        if(obj1 == obj2) {
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }
        System.out.println();

        if(obj2 == obj3) {
            System.out.println("obj2 == obj3");
        } else {
            System.out.println("obj2 != obj3");
        }
        System.out.println();

        if(obj1 == obj3) {
            System.out.println("obj1 == obj3");
        } else {
            System.out.println("obj1 != obj3");
        }

        obj1 = null; //초기화 가능
        System.out.println(obj1);
    }
}
