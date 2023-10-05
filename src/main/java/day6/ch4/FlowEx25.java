package day6.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num, sum = 0;
        System.out.print("숫자를 입력하세요.(예:12345) >>");
        num = Integer.parseInt(new Scanner(System.in).nextLine());

        while(num != 0){
            sum += num % 10;
            num /= 10;
        }



        /* ---------------------- */








    }
}
