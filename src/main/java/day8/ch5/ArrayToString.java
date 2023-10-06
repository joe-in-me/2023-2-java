package day8.ch5;

public class ArrayToString {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3};

        // System.out.println(Arrays.toString(arr)); 구현
        // for 문안의 고정된 연산은 변수로 따로 빼주는게 좋다.

        int count = arr.length - 1;
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + "";
            if (i != count) {
                str += ", ";
            }
        }
        str += "]";

        System.out.println(str);

        System.out.println("------------------------");


        String str2 = "[";
        for (int i = 0; i < arr.length; i++) {
            str2 += arr[i] + (i != count ? ", " : "");
        }
        str2 += "]";

        System.out.println(str2);


        /* ---------------------------- */
        // 반대로 컴마를 찍고, 숫자를 찍는 개념.

        System.out.println("------------------------");

        String str3 = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                str3 += ", ";
            }
            str3 += arr[i] + "";
        }
        str3 += "]";

        System.out.println(str3);


        /* ------------------------------ */
        // for문 내부에 if 안쓰고 구현 -- good

        System.out.println("------------------------");

        String str4 = "[" + arr[0];
        for (int i = 1; i < arr.length; i++) {
            str4 += ", " + arr[i];
        }
        str4 += "]";

        System.out.println(str4);


    }
}
