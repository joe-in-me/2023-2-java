package day12.ch6;

import java.util.Arrays;

public class MethodExam4 {

    public static void main(String[] args) {
        MethodExam4 methodExam4 = new MethodExam4();

        int[] arr = {10, 20, 30};
        int[] rArr1 = methodExam4.plusMap(arr, 2);
        System.out.println("Arrays.toString(rArr1) = " + Arrays.toString(rArr1));
        /*
         * 새로운 배열 리턴 (원본 변경 x)
         * arr 의 각 index 의 값에 두번째 인자만큼 + 해서 리턴 (새로운 배열)
         *
         *
         * */

        System.out.println();
        System.out.println();


        methodExam4.plusOrigin(arr, 4);
        /*
         * '원본' 에 4씩 더하기
         *
         * */
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println();


        int[] rArr2 = methodExam4.randomValFromTo(10, 5, 20);
        // 인자 : 배열사이즈, min, max

        System.out.println(Arrays.toString(rArr2));


    }
    /* randomValFromTo */
    int[] randomValFromTo(int arrLength, int min, int max) {
        int[] nums = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            nums[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return nums;
    }

    /* plusOrigin */
    void plusOrigin(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += num;
        }
    }
    /* plusMap */
    int[] plusMap(int[] arr, int num) {
        int[] newArr = new int[arr.length]; // 비파괴 메소드로 만들기 위해 리턴할 배열을 새로 생성
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] + num;
        }
        return newArr;
    }
}
