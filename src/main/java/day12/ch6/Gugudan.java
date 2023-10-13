package day12.ch6;

public class Gugudan {

    void print(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }


    }

    void printFromTo(int from, int to) {
        for (int j = from; j <= to; j++) {
            print(j);
        }
    }

    void printFromTo(int from, int to, String breakLine) {
        for (int j = from; j <= to; j++) {
            print(j);
            if (j == to) {
                return;
            }
            System.out.println(breakLine);
        }
    }
}
