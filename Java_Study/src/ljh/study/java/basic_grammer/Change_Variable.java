package ljh.study.java.basic_grammer;

public class Change_Variable {
    public static void main(String[] args) {

        //자동 형 변환
        //작은 공간 -> 큰 공간
        byte by = 10;
        int in = by;
        System.out.println("in = " + in);

        //명시적 형 변환
        //큰 공간 -> 작은공간
        int ivar = 100;
        byte bvar = (byte)ivar;
        System.out.println("bvar = " + bvar);

        //명시적 형 변환은 데이터가 유실 될 수 있다
        ivar = 123456;
        bvar = (byte) ivar;
        System.out.println("bvar = " + bvar);

    }
}
