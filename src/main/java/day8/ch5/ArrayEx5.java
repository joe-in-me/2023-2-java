package day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 누군가의 과목점수
        // 총점과 평균점수를 구하자.
        int[] score = {100, 88, 100, 100, 90};
        int sum = 0;
//        double avg;

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
//        avg = (double) sum / score.length;
        System.out.println("sum = " + sum + "\tavg = " + ((double) sum / score.length));



    }
}