package ljh.study.java.basic_grammer;

public class Special_String {
    public static void main(String[] args) {
        /*
        * \t : 탭
        * \n : 줄바꿈
        * \' : 작은따옴표 출력
        * \" : 큰 따옴표 출력
        * \\ : 역슬래쉬 출력
        * */

        System.out.println("Good\tMorning");
        System.out.println("Good\nMorning");
        System.out.println("Good\'Morning\'");
        System.out.println("\"GoodMorning\"");
        System.out.println("Good\\Morning");


        /*
        * %d : 10진수
        * %o : 8진수
        * %x : 16진수
        * %c : 문자
        * %s : 문자열
        * %f : 실수
        * */

        System.out.printf("나의 나이는 %d살입니다.", 27);

        System.out.println();

        System.out.printf("%d\n", 123);
        System.out.printf("%d\n", 1234);
        System.out.printf("%d\n", 12345);

        System.out.printf("%5d\n", 123);
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);

        System.out.printf("%f\n", 1.23);
        System.out.printf("%.0f\n", 1.23);
        System.out.printf("%.1f\n", 1.23);
        System.out.printf("%.2f\n", 1.23);
        System.out.printf("%.3f\n", 1.23);

    }
}
