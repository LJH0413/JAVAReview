package implement.innerAndAnomous;


public class MainClass {
    public static void main(String[] args) {

        OutterClass oc = new OutterClass();
        System.out.println("oc.num : " + oc.num);
        System.out.println("oc.str1 : " + oc.str1);

        System.out.println();

        //멤버 inner 클래스
        OutterClass.InnerClass in = oc.new InnerClass();
        System.out.println("in.num : " + in.num);
        System.out.println("in.str2 : " + in.str2);

        System.out.println();

        //static inner 클래스
        OutterClass.SInnerClass si = new OutterClass.SInnerClass();
        System.out.println("si.num : " + si.num);
        System.out.println("si.str3 : " + si.str3);

        System.out.println();

        //익명 클래스
        new AnonymousClass() {
            @Override
            public void method() {
                System.out.println(" -- AnonymousClass's Override method");
            };
        }.method();
    }
}
