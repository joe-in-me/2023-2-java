package day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        /*
        (1) square
        (2) tri
        (3) log
        원하는 메뉴 (1 ~ 3) 을 선택하세요. (종료: 0) >>

        내용이 0을 입력하기 전까지 반복
        1 입력하면 선택하신 메뉴는 1번 입니다. 출력
        2 입력하면 선택하신 메뉴는 2번 입니다. 출력
        3 입력하면 선택하신 메뉴는 3번 입니다. 출력
        4 입력하면 메뉴를 잘못 선택하셨습니다.

        0 입력하면 프로그램을 종료합니다. (프로그램 종료)
        */

        int input;

        while (true) {
            System.out.println("""
                    (1) square
                    (2) tri
                    (3) log
                    """);
//            System.out.println("(1) square");
//            System.out.println("(2) tri");
//            System.out.println("(3) log");
            System.out.print("원하는 메뉴 (1 ~ 3) 을 선택하세요. (종료: 0) >> ");
            input = Integer.parseInt(new Scanner(System.in).nextLine());

            if (input == 0) {
                break;
            } else {
                System.out.println("----------------------------");

                if (input > 3 || input < 0) {
                    System.out.println("메뉴를 잘못 선택하셨습니다.");
                    continue;
                }
                System.out.println("선택하신 메뉴는 " + input + "번 입니다.");
            }
        }
        System.out.println("종료");
    }
}

