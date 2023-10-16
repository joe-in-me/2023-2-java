package day13.ch6;

public class MyMath2 {
    int num;
    static int staticNum;

    static void print(){
        System.out.println("staticNum = " + staticNum);
        // num = 10; // static 에서 non-static 은 사용할 수 없다.

    }

    void print2() {
        System.out.println("staticNum = " + staticNum);
        System.out.println("num = " + num);

    }

}
