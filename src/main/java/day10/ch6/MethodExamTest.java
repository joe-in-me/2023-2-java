package day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam methodExam = new MethodExam();
        methodExam.checkZero(10); // 0 이 아닙니다.
        methodExam.checkZero(0); // 0 입니다.

        /* ------------------------------------------- */

        int min = 10;
        int max = 100;

        for (int i = 0; i < 10000; i++) {
            int r = methodExam.randomValFromTo(min, max);
            if (r < min || r > max) {
                System.out.println("Wrong r = " + r);
                break;
            }
        }

        System.out.println();
        System.out.println();
        methodExam.scoreResultPrint(101); // 잘못된 점수 입니다.
        methodExam.scoreResultPrint(100); // A
        methodExam.scoreResultPrint(90); // A
        methodExam.scoreResultPrint(89); // B
        methodExam.scoreResultPrint(80); // B
        methodExam.scoreResultPrint(79); // C
        methodExam.scoreResultPrint(70); // C
        methodExam.scoreResultPrint(69); // D (69 이하는 전부 D)
        methodExam.scoreResultPrint(-1); // 잘못된 점수 입니다.


    }
}
