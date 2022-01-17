package implement.abstarct;

public class FirstClass extends ParentClass{

    public FirstClass(){}

    @Override
    public void parentMethod() {
        super.parentMethod();
        System.out.println("add FirstClass");
    }
}
