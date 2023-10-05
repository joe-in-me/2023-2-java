package day7.ch4;

public class BreakContinue2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 10; j < 15; j++) {
                if (j == 13) {
                    break;
                }
                System.out.printf("i:%d - z:%d\n", i, j);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 10; j < 15; j++) {
                if (j == 13) {
                    continue;
                }
                System.out.printf("i:%d - z:%d\n", i, j);
            }
        }
    }
}
