package day9.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43},
        };

        /*
         * score[0][0] = 101
         * score[0][1] = 102
         * score[0][2] = 103
         * ...
         * score[3][2] = 43
         *
         * sum = ??
         *
         * literal 은 0만 사용 가능
         * */

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
                sum += score[i][j];
            }
        }
        System.out.println("sum = " + sum);


        for (int i = 0; i < score.length; i++) {
            int[] arr = score[i];
            for (int j = 0; j < arr.length; j++) {
                System.out.println("arr[" + j + "] = " + arr[j]);
            }

        }

        System.out.println("-------------------------------------");


        for (int[] ints : score) {
            for (int anInt : ints) {
                System.out.println("anInt = " + anInt);
            }
        }

        // forEach 를 통해 sum 구하기
        sum = 0;
        for (int[] ints : score) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println("sum = " + sum);
    }
}
