package ljh.study.java.basic_grammer;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] arr = new int [5]; //배열 선언
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        for(int i = 0; i<arr.length; i++) {
            System.out.println("arr[" +i +"] : " + arr[i]);
        }

        int [] arr1 = {1, 2, 3, 4, 5};
        for(int j = 0; j<arr1.length; j++) {
            System.out.println("arr1[" +j +"] : " + arr1[j]);
        }

        System.out.println();

        int[] arrAtt1 = {10, 20, 30, 40, 50};
        int[] arrAtt2 = null;
        int[] arrAtt3 = null;

        //배열의 길이
        System.out.println("arrAtt1 lenght :" + arrAtt1.length);

        //배열의 요소 출력
        System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));

        //배열 요소 복사 (깊은 복사)
        arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
        //arrAtt3에 arrAtt1의 배열 요소를 arrAtt1 길이만큼 복사
        System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));

        //배열 레퍼런스
        arrAtt2 = arrAtt1; //얕은 복사
        System.out.println("arrAtt1 : " + arrAtt1);
        System.out.println("arrAtt2 : " + arrAtt2);
        System.out.println("arrAtt3 : " + arrAtt3);


    }
}
