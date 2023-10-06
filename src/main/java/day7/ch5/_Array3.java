package day7.ch5;

public class _Array3 {
    public static void main(String[] args) {
        // 깊은 복사 ( deep copy )

        int[] arr1 = {5, 10, 15};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }

        System.out.println();
        System.out.println("(arr1 == arr2) = " + (arr1 == arr2));

        // deep copy


        //            동등성  |  동일성
        // 비교대상      값       주소
        // 사용연산   .equals     ==
        // 얕은        true     true
        // 깊은        true     false


    }
}
