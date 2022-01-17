package implement.abstarct;

public class SecondClass extends ParentClass{

    public SecondClass(){}

    @Override
    public void parentMethod() {
        super.parentMethod();
        System.out.println("add secondClass");
    }
}
