package day12.ch6;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.print(4); // 4단 구구단 콘솔에 출력
        /*
         * 4 x 1 = 4
         * 4 x 2 = 8
         * ...
         * 4 x 9 = 36
         *
         * */

        System.out.println();

        gugudan.print(5); // 5단 구구단 콘솔에 출력
        /*
         * 5 x 1 = 5
         * 5 x 2 = 10
         * ...
         * 5 x 9 = 45
         *
         * */

        System.out.println();
        System.out.println("-------------------------");
        gugudan.printFromTo(4, 7); // 4단부터 7단까지 출력
        System.out.println();
        gugudan.printFromTo(3, 4); // 3단부터 4단까지 출력


        System.out.println();
        System.out.println();
        System.out.println();

        gugudan.printFromTo(3, 6, "------------------------");
        // 3번째 인자는 단 이 바뀌면 출력. (마지막에는 출력 x)


    }
}
