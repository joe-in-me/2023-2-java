package day10.ch6;

public class MethodExam {

    void checkZero(int i) {
//        if(i == 0){
//            System.out.println("0 입니다.");
//            return;
//        }
//        System.out.println("0 이 아닙니다.");


        //
//        System.out.println(i == 0 ? "0 입니다" : "0이 아닙니다.");
        //


        System.out.println(i != 0 ? "0 이 아닙니다" : "0 입니다.");
    }


    public int randomValFromTo(int i, int i1) {


        return (int) (Math.random() * (i1 - i + 1)) + i;
    }

    void scoreResultPrint(int i) {
//        String score = "";
//        if (i <= 100 && i >= 90) {
//            score = "A";
//        } else if (i <= 89 && i >= 80) {
//            score = "B";
//        } else if (i <= 79 && i >= 70) {
//            score = "C";
//        } else if (i > 0 && i <= 69) {
//            score = "D";
//        } else {
//            System.out.println("잘못된 점수입니다.");
//            return;
//        }
//        System.out.println(score + " 학점");

        if (i > 100 || i < 0) {
            System.out.println("잘못된 점수입니다.");
            return;
        }

        String score = "D";

        int check = i / 10;
        if (check == 10 || check == 9) {
            score = "A";
        } else if (check == 8) {
            score = "B";
        } else if (check == 7) {
            score = "C";
        }
        System.out.println(score + " 학점");


        //


        String score2 = "D";
        if (i > 100 || i < 0) {
            System.out.println("잘못된 점수입니다.");
            return;
        }

        if (i >= 90) {
            score2 = "A";
        } else if (i >= 80) {
            score2 = "B";
        } else if (i >= 70) {
            score2 = "C";
        }
        System.out.println(score2 + " 학점");


    }


}
