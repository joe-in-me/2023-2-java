package day20.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
        ExceptionEx12.method1();
        try {
            ExceptionEx12.method2();
        } catch (Exception e) {
            System.out.println("method2 예외 발생");
        }
        System.out.println("-- 끝 --");
    }

    static void method1() {
        int a = 10 / 0;

    }

    static void method2() throws Exception {
        int a = 10 / 0;

    }
}

class ExceptionEx12_2 {
    public static void main(String[] args) {

        try {
            ExceptionEx12_2.method1();
        } catch (Exception e) {

        }
    }

    static void method1() throws Exception {
        ExceptionEx12_2.method2();
    }

    static void method2() throws Exception {
        int a = 10 / 0;

    }
}