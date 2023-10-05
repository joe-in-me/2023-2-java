package day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int ans = (int) (Math.random() * 100) + 1;

        /*
        while 사용
        1~100 사이의 정수를 입력하세요 >>           // ans 와 일치할때까지 반복
        input 보다 ans 가 크다 : "Up"
        input 보다 ans 가 작다 : "Down"

        마지막에는 "끝" 이 뜸.
        */

        while (true) {
            System.out.print("1~100 사이의 정수를 입력하세요 >> ");
            input = Integer.parseInt(new Scanner(System.in).nextLine());

            if (input == ans) {
                break;
            } else if (ans > input) {
                System.out.println("Up");
            } else {
                System.out.println("Down");
            }
        }
        System.out.println("끝");
    }
}