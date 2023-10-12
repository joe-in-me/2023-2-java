package day11.ch6;

public class StarPrint {


    void line(int line) {
        for (int i = 0; i < line; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void square(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void square(int num, int ver2) { // !!!
        for (int i = 0; i < num; i++) {
            line(num);
        }
    }

    void triangle(int num) {
        for (int i = 1; i <= num; i++) {
            line(i);
        }
    }

    String chkGenderById(String s) {
        int num = Character.getNumericValue(s.charAt(7));
        char cNum = s.charAt(7);
        if (num > 4 || num <= 0) {
            return "유효하지 않은 주민번호";
        }
        if (num % 2 == 0) {
            return "여성";
        }
        return "남성";
    }

    String chkGenderById(String s, int ver2) {
        int num = Character.getNumericValue(s.charAt(7));
        if (num > 4 || num <= 0) {
            return "유효하지 않은 주민번호";
        }
        return num % 2 == 0 ? "여성" : "남성";

    }

    int sumFromTo(int min, int max) {
        int sum = 0;
        for (int j = min; j <= max; j++) {
            sum += j;
        }
        return sum;
    }
}
