package day7.ch4;

public class BreakContinue3 {
    public static void main(String[] args) {

        F:
        for (int i = 0; i < 5; i++) {
            for (int j = 10; j < 15; j++) {
                if (j == 13) {
                    break F;
                }
                System.out.printf("i:%d - z:%d\n", i, j);
            }
        }
        S:
        for (int i = 0; i < 5; i++) {
            for (int j = 10; j < 15; j++) {
                if (j == 13) {
                    continue S;
                }
                System.out.printf("i:%d - z:%d\n", i, j);
            }
        }

    }
}
