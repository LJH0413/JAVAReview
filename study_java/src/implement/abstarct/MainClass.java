package implement.abstarct;

public class MainClass {
    public static void main(String[] args) {

        ChildClass cc = new ChildClass();

        FirstClass fc = new FirstClass();
        SecondClass sc = new SecondClass();

        cc.childClass();
        cc.parentClass();



        fc.parentMethod();
        sc.parentMethod();
    }
}
