package day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        /*
         * numarr 각 방에 0~9 사이의 랜덤값을 대입. (중복 허용)
         * numArr 각방의 값도 출력
         * cntArr의 0번 방은 0의 갯수, 1번방은 1의 개수 count값을 넣는다.
         * 0~9 의 개수를 출력
         * */


        for (int i = 0; i < LEN; i++) {
            numArr[i] = (int) (Math.random() * LEN);
        }
        System.out.println(Arrays.toString(numArr));
//        int count = 0;
        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                if (numArr[j] == i) {
                    cntArr[i]++;
//                    count++;
                }
            }
//            cntArr[i] = count;
//            count = 0;
        }

        for (int i = 0; i < cntArr.length; i++) {
            System.out.println(i + "의 개수: " + cntArr[i]);
        }


        /* ------------------------------------ */
        // !!!
        int[] cnt2 = new int[LEN];
        for (int i = 0; i < cnt2.length; i++) {
            cnt2[numArr[i]]++;
        }

        System.out.println(Arrays.toString(cnt2));

        for (int num : numArr) {
            cnt2[num]++;
        }


    }
}
