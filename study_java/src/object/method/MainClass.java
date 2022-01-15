package object.method;

public class MainClass {
    public static void main(String[] args) {

        ChildClass cc = new ChildClass();
        cc.getInfo();

        //생성자 오버로딩을 통한 필드값 설정
        ChildClass cc1 = new ChildClass("LJH", "MAN", 27);
        cc1.getInfo();

        //setinfo에서 getinfo로 저장
        ChildClass cc2 = new ChildClass();
        cc2.setInfo("LCH", "WOMAN", 21);
        cc2.getInfo();
    }
}
