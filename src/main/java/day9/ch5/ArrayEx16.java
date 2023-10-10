package day9.ch5;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        /*
         * 3개의 String 값을 담을 수 있는 배열 생성.
         * 3번 문자열로 입력을 받음. (Scanner 이용)
         * 입력받은 문자열들을 순차적으로 배열에 값을 넣는다.
         * 값넣는게 종료가 되면 forEcah 를 통해 저장되어있는 값 콘솔에 출력
         * */

        Scanner scan = new Scanner(System.in);
        String[] txts = new String[3];
        for (int i = 0; i < txts.length; i++) {
            System.out.print("문자를 입력해 주세요 >> ");
            txts[i] = scan.nextLine();
        }

        for (String txt : txts) {
            System.out.println("txt = " + txt);
        }
    }
}
