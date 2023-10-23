package day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball numberBaseball = new NumberBaseball(3);
        numberBaseball.start();


    }
}


/**
 * RULE
 * <p>
 * S : 자리 + 숫자 같은것.
 * B : 자리는 다르고, 숫자만 같은것.
 * O : 전부 다른것.
 */
class NumberBaseball {

    private final int GAME_COUNT;
    private final int[] gameNumbers;

    public NumberBaseball(int count) {
        this.GAME_COUNT = count;
        this.gameNumbers = new int[count];
    }

    public void start() {
        setRandomNumNotDuplicate(); // gameNumbers 에 길이만큼 랜덤숫자 세팅, 중복 없이.
        getUserInput();

    }

    private void setRandomNumNotDuplicate() {
        loop:
        for (int i = 0; i < GAME_COUNT; i++) {
            int rNum = (int) (Math.random() * 10);
            for (int j = 0; j < GAME_COUNT; j++) {
                if (i == 0) break;
                if (rNum == this.gameNumbers[j]) {
                    i -= 1;
                    continue loop;
                }

            }
            this.gameNumbers[i] = rNum;
        }

    }

    private void getUserInput() {
        Scanner scan = new Scanner(System.in);
        int[] userArr = new int[this.GAME_COUNT];
        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.printf("%d 번째 숫자 >> ", i + 1);
            userArr[i] = Integer.parseInt(scan.nextLine());
        }
        boolean r = isContinueCheckResult(userArr, 3);

        scan.close();
    }

    private boolean isContinueCheckResult(int[] userArr) {

        int strike = 0, ball = 0, out = 0;

        loop:
        for (int i = 0; i < this.gameNumbers.length; i++) {
            for (int j = 0; j < userArr.length; j++) {
                if (i == j && gameNumbers[i] == userArr[j]) {
                    strike++;
                    continue loop;
                }
                if (i != j && gameNumbers[i] == userArr[j]) {
                    ball++;
                    continue loop;
                }
                if (j == userArr.length - 1) {
                    out++;
                }
            }
        }

        System.out.println(Arrays.toString(this.gameNumbers));
        System.out.println("strike = " + strike);
        System.out.println("ball = " + ball);
        System.out.println("out = " + out);


        return true;
    }

    // !!!
    private boolean isContinueCheckResult(int[] userArr, boolean v2) {

        int strike = 0, ball = 0, out;

        for (int i = 0; i < this.gameNumbers.length; i++) {
            for (int j = 0; j < userArr.length; j++) {
                if (gameNumbers[i] == userArr[j]) {
                    // 공통된거 따로 만들어서 묶음.
                    // + out 은 for문 외부에서 세팅.

                    if (i == j) strike++;
                    if (i != j) ball++;
                }
            }
        }
        out = this.GAME_COUNT - (strike + ball);

        System.out.println(Arrays.toString(this.gameNumbers));
        System.out.println("strike = " + strike);
        System.out.println("ball = " + ball);
        System.out.println("out = " + out);


        return true;
    }

    private boolean isContinueCheckResult(int[] userArr, int v3) {

        int strike = 0, ball = 0, out = 0;

        for (int i = 0; i < this.gameNumbers.length; i++) {
            for (int j = 0; j < userArr.length; j++) {
                if (gameNumbers[i] == userArr[j]) {
                    if (i == j) strike++;
                    if (i != j) ball++;
                    break;
                }
                if (j == userArr.length - 1) out++;
            }
        }


        System.out.println(Arrays.toString(this.gameNumbers));
        System.out.println("strike = " + strike);
        System.out.println("ball = " + ball);
        System.out.println("out = " + out);

        return true;
    }
/**
 * RULE
 * <p>
 * S : 자리 + 숫자 같은것.
 * B : 자리는 다르고, 숫자만 같은것.
 * O : 전부 다른것.
 */





/*    public void setRandNumNotDuplicate(boolean v2) {

        for (int i = 0; i < gameNumbers.length; i++) {
            gameNumbers[i] = (int) (Math.random() * 10);
            for (int j = 0; j < gameNumbers.length; j++) {
                if (i == j) {
                    continue;
                }
                if (gameNumbers[i] == gameNumbers[j]) {
                    i--;
                    break;
                }
            }
        }
    }*/
}
