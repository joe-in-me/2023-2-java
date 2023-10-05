package day6.ch4;

public class While {
    public static void main(String[] args) {
        // while 반복문

        for (int i = 0; i < 10; i++) {
            System.out.println("for - " + i);
        }

        System.out.println("-----------------------------");
        // 동일

        int i = 0;
        while (i < 10) {
            System.out.println("while - " + i++);

        }

    }
}
