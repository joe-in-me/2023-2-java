package day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        // score 안에서 min 값과 max 값을 찾아서 출력하기

        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < score.length; i++) {
            max = max < score[i] ? score[i] : max;
            min = min > score[i] ? score[i] : min;
        }
        System.out.println("max = " + max + "\tmin = " + min);



        /* ----------------------------------------------*/
        // 리터럴 직접 대입시 max 보다 작은값이나, min 보다 큰 값이 들어가면 문제가 생김.
        // MAX_VALUE, MIN_VALUE 는 문제 없을듯함.


        max = score[0];
        min = score[0];
        for (int i = 1; i < score.length; i++) {
            max = max < score[i] ? score[i] : max;
            min = min > score[i] ? score[i] : min;
        }
        System.out.println("max = " + max + "\tmin = " + min);





    }
}
