package day10.ch5;

import java.util.Scanner;


public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {

                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}

        };
        /*
         * Q1. chair 의 뜻은? >> dmlwk
         * 틀렸습니다. 정답은 의자입니다.
         *
         * Q2. computer 의 뜻은? >> 컴퓨터
         * 정답입니다.
         *
         * Q3. interger 의 뜻은? >> 정주
         * 틀렸습니다. 정답은 정수입니다.
         *
         * */
        String answer = "";
        Scanner scan = new Scanner(System.in);

        for (String[] word : words) {
            for (int i = 0; i < word.length; i++) {
                if (i == 0) {
                    System.out.print("Q" + (i + 1) + ". " + word[i] + "의 뜻은? >> ");
                    answer = scan.nextLine();
                } else {
                    if (answer.equals(word[i])) {
                        System.out.println("정답입니다.");
                    } else {
                        System.out.println("틀렸습니다. 정답은 " + word[i] + "입니다.");
                    }
                }
            }
        }

        System.out.println("----------------------------------------------");

        for (int i = 0; i < words.length; i++) {
            System.out.print("Q" + (i + 1) + ". " + words[i][0] + "의 뜻은? >> ");
            answer = scan.nextLine();

            if (answer.equals(words[i][1])) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("틀렸습니다. 정답은 " + words[i][1] + "입니다.");
            }
        }

        System.out.println("----------------------------------------------");


        String[] qs = new String[words.length];
        String[] as = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            qs[i] = words[i][0];
            as[i] = words[i][1];
        }

        for (int i = 0; i < qs.length; i++) {
            System.out.print("Q" + (i + 1) + ". " + qs[i] + "의 뜻은? >> ");
            answer = scan.nextLine();
            if (answer.equals(as[i])) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("틀렸습니다. 정답은 " + as[i] + "입니다.");
            }
        }

        /* ----------------------------------------------------------- */
        System.out.println("----------------------------------------------");

        for (int i = 0; i < words.length; i++) {
            System.out.print("Q" + (i + 1) + ". " + words[i][0] + "의 뜻은? >> ");
            answer = scan.nextLine();

            if (!answer.equals(words[i][1])) {
                System.out.println("틀렸습니다. 정답은 " + words[i][1] + "입니다.");
                continue;
            }
            System.out.println("정답입니다.");
        }
        /* ----------------------------------------------------------- */
        System.out.println("----------------------------------------------");

        for (int i = 0; i < words.length; i++) {
            System.out.print("Q" + (i + 1) + ". " + words[i][0] + "의 뜻은? >> ");
            answer = scan.nextLine();

            if (answer.equals(words[i][1])) {
                System.out.println("정답입니다.");
                continue;
            }
            System.out.println("틀렸습니다. 정답은 " + words[i][1] + "입니다.");


        }
        /* ----------------------------------------------------------- */
        System.out.println("----------------------------------------------");


        int i = 1;
        for (String[] word : words) {
            System.out.print("Q" + i++ + ". " + word[0] + "의 뜻은? >> ");
            answer = scan.nextLine();

            if (answer.equals(word[1])) {
                System.out.println("정답입니다.");
                continue;
            }
            System.out.println("틀렸습니다. 정답은 " + word[1] + "입니다.");
        }
    }
}
