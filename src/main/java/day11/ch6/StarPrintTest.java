package day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {

        StarPrint starPrint = new StarPrint();
        starPrint.line(5); // ***** + 개행
        starPrint.line(7); // ******* + 개행
        starPrint.line(10000);


        System.out.println();
        starPrint.square(4);
        // ****
        // ****
        // ****
        // ****
        System.out.println();
        starPrint.square(5);
        // *****
        // *****
        // *****
        // *****
        // *****

        starPrint.triangle(5);
        // *
        // **
        // ***
        // ****
        // *****

        System.out.println();
        System.out.println();
        System.out.println();
        String gender = starPrint.chkGenderById("011231-5117111");
        System.out.println("gender = " + gender);

        /*
         * 8번째 자리의 숫자가
         * 2, 4 이면 > 여성
         * 1, 3 이면 > 남성
         * 이 외의 값이면 > 유효하지 않은 주민번호
         * */

        System.out.println();
        System.out.println();
        System.out.println();

        int sum = starPrint.sumFromTo(4, 10); // 4~10 숫자 다 더한값
        System.out.println("sum = " + sum);
        int sum2 = starPrint.sumFromTo(10, 15); // 10~15 숫자 다 더한값
        System.out.println("sum2 = " + sum2);

    }
}
