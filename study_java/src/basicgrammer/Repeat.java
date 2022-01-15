package basicgrammer;

public class Repeat {
    public static void main(String[] args) {

        //구구단 출력
        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }

        System.out.println();

        //while
        int x = 9;
        int i = 1;
        while(i < 10) {
            System.out.println(x + " * " + i + " = " + i*x);
            i++;
        }
        System.out.println();
        //do - while
        int k = 10;

        do {
            System.out.println("지금까지" + k +"번은 실행");
            k++;
        } while (k > 13);
    }
}
