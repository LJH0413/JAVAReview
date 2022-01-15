package object.method;

public class ChildClass {

    public String name;
    public String gender;
    public int age;

    public ChildClass() {
        System.out.println("-- ChildClass Constructor");
    }

    public ChildClass(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("-- ChildClass Constructor");
    }

    public void setInfo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("-- setInfo() start --");
    }

    public void getInfo() { // 매소드는 접근자 반환형 매소드 이름
        System.out.println("-- getInfo() Start --");
        System.out.println("name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("age : " + age);
    }

    private void mySecret() {
        System.out.println("-- mySecret() Start --");
    }


}
