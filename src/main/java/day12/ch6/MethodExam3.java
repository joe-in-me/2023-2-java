package day12.ch6;

public class MethodExam3 {

    public static void main(String[] args) {
        MethodExam3 me3 = new MethodExam3();
        int sum = me3.sumText("123123");
        System.out.println("sum = " + sum);
    }

    /* sumText */
    // 1000000 회 반복시 - 14ms 소요
    int sumText(String number) {

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum;
    }


    /* sumText */
    int sumText(String number, int v3) {
        char[] numArr = number.toCharArray();  // toCharArry 사용
        int sum = 0;
        for (char c : numArr) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }

    /* sumText */
    // 1000000 회 반복시 - 26ms 소요
    int sumText(String number, boolean v2) {

        int sum = 0;
        int intNum = Integer.parseInt(number);

        while (intNum != 0) {
            sum += intNum % 10;
            intNum /= 10;
        }
        return sum;
    }


}
