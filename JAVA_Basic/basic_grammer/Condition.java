package ljh.study.java.basic_grammer;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        //if
        if(n1 < n2) {
            System.out.println("n1 < n2");
        }

        //if else
        if(n1 > n2) {
            System.out.println("n1 > n2");
        }else {
            System.out.println("n1 < n2");
        }

        System.out.println();

        if(n1 < n2) {
            System.out.println("n1 < n2");
        } else if(n1 == n2) {
            System.out.println("n1 = n2");
        }
        System.out.println("n1 > n2");

        System.out.println();

        //switch
        System.out.println("점수 입력 :" );
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        switch (score) {
            case 100:
            case 90 :
                System.out.println("수");
            break;

            case 80:
                System.out.println("우");
                break;

            case 70 :
                System.out.println("미");
                break;
            default:
                System.out.println("try again");
                break;
        }

    }
}
