package day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {

        NumberBox numberBox = new NumberBox();

                      // 인자 , argument
        numberBox.sum(10, 20);
        numberBox.sum(30, 40);


        numberBox.minus(40, 20); // 40 - 20 = 20 출력
        numberBox.minus(800, 170); // 800 - 170 = 630 출력

        System.out.println();
        numberBox.abs(-10); // 10
        numberBox.abs(10); // 10
        numberBox.abs(-33); // 33
        numberBox.abs(39); // 39
        numberBox.abs(0); // 0


    }
}
