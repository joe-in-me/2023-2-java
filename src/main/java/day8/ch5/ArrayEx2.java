package day8.ch5;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
        5개의 방을 가진 정수형 배열을 만들고
        각 방의 1~10 의 랜덤한 값을 넣어주세요
        */

        int[] randNums = new int[5];
        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = (int) (Math.random() * 10) + 1;
        }

        for (int i = 0; i < randNums.length; i++) {
            System.out.println("randNums[" + i + "] = " + randNums[i]);
        }


        System.out.println("\n------\n");


        int[] randNums2 = new int[5];
        forC:
        for (int i = 0; i < randNums2.length; i++) {
            int rand = (int) (Math.random() * 10) + 1;
            for (int j = i; j >= 0; j--) {
                if (rand == randNums2[j]) {
                    --i;
                    continue forC;
                }
            }
            randNums2[i] = rand;
        }

        for (int i = 0; i < randNums2.length; i++) {
            System.out.println("randNums[" + i + "] = " + randNums2[i]);
        }


        System.out.println("\n------\n");

        int[] randNums3 = new int[5];
        for (int i = 0; i < randNums3.length; i++) {
            int rand = (int) (Math.random() * 10) + 1;
            for (int j = i; j >= 0; j--) {
                if (rand == randNums3[j]) {
                    --i;
                    break;
                } else {
                    randNums3[i] = rand;
                }
            }
        }

        for (int i = 0; i < randNums3.length; i++) {
            System.out.println("randNums[" + i + "] = " + randNums3[i]);
        }

        /* ---------------------------------------------------------- */
        // 차이
        // 덮어씀
        // 오름차순
        // 현재것 검증 문제시 --i;, break;

        int[] randNums4 = new int[5];
        for (int i = 0; i < randNums4.length; i++) {
            randNums4[i] = (int) (Math.random() * 10) + 1;
            for (int j = 0; j < i; j++) {
                if (randNums4[i] == randNums4[j]) {
                    --i;
                    break;
                }
            }
        }

        for (int i = 0; i < randNums3.length; i++) {
            System.out.println("randNums[" + i + "] = " + randNums3[i]);
        }


    }
}
