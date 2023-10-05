package day7.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        /*
        반복문 사용
         i 값 계속 증가가 되며 sum 에 중첩으로 더하기
        sum 값이 100 초과가 되는 시점에 i 값을 알아내기
         */

        int sum = 0;
        int i = 0;

        while (true) {
            sum += ++i;
            if (sum > 100) { // 가능하면 변수화 하여 사용.
                break;
            }
        }
        System.out.println("i = " + i);

        System.out.println("-----------------------------------");

        sum = 0;
        i = 0;
        final int TARGET = 100;
        while (sum < TARGET) {
            sum += ++i;
            if (sum > TARGET) { // 가능하면 변수화 하여 사용.
                break;
            }
        }
        System.out.println("i = " + i);
    }
}
