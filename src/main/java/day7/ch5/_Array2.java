package day7.ch5;

public class _Array2 {
    public static void main(String[] args) {
        int[] arr1 = {100, 200};
        int[] arr2 = {5, 10, 15};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        arr1 = arr2; // 얕은 복사 ( shallow copy )
        System.out.println("------");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        System.out.println("(arr1 == arr2) = " + (arr1 == arr2));


        // 다른 변수에 새로운 객체를 생성, 값들을 그대로 복사하는것을 깊은 복사라고 함.

    }
}
