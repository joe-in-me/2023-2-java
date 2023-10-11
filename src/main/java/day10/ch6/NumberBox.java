package day10.ch6;

public class NumberBox {

    void sum(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
    }

    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
    }

    void abs(int num) {
        System.out.println(num < 0 ? -num : num);
        // 컴파일러가 return; 자동 생성.
    }



}
