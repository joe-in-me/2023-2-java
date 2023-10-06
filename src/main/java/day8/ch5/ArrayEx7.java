package day8.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 1. 정수 10개를 저장할 수 있는 배열을 만든다.
        //    0~9 값을 순차적으로 대입한다.

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        //2. 셔플하기

        int index;
        int tmp;

        for (int i = 0; i < arr.length; i++) {
            index = (int) (Math.random() * arr.length);
            tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }

        System.out.println(Arrays.toString(arr));


        System.out.println("----------------------------------");
        /* ----------------------------------------------------- */


        for (int i = 0; i < arr.length; i++) {
            index = (int) (Math.random() * arr.length);
            if (i != index) {
                tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
