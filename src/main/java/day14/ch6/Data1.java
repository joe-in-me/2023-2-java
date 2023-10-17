package day14.ch6;

public class Data1 {
    int value
//            = 100
            ;
    int value2
//            = 200
            ;
    int value3
//            = 300
            ;


    public Data1() { // 기본 생성자 (default constructor)
//        this.value = 100;
//        this.value2 = 200;
//        this.value3 = 300;
        this(100, 100, 100);

        /*
         * this() -> this 의 생성자 접근 !!!
         *
         * */

    }

    public Data1(int a) { // 파라미터가 있는 생성자 || 오버로딩 생성자.
        value = a;

    }

    public Data1(int a, int a2, int a3) {
        value = a;
        value2 = a2;
        value3 = a3;
    }

    public void printMyself() {
        System.out.printf("vale: %d, value2: %d, value3: %d\n", value, value2, value3);
    }


}


class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        Data1 data2 = new Data1(10, 20, 30);
        data1.printMyself();
        data2.printMyself();






    }
}
