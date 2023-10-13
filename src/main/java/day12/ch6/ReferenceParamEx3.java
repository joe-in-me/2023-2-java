package day12.ch6;


import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4, 7, 10, 9, 8};

        sortArr(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println();
        printArr(arr);


        System.out.println();
        System.out.println();


        System.out.println("sum = " + sumArr(arr));

        System.out.println();
        System.out.println();



    }

    /* sumArr */
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /* sumArr */
    public static int sumArr(int[] arr, boolean v2) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    /* printArr */
    public static void printArr(int[] arr) {
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.print("]\n");
    }


    /* sortArr */
    // my
    public static void sortArr(int[] arr) {
        // 오름차순 정렬
        // 오른쪽이 제일 큰 값
        // 왼쪽이 제일 작은 값
        int tmp = 0;

        // i > 1 이 되어야 함 // i > 0 이면 쓸데없이 for문 한번 더 함.
        for (int i = arr.length; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (arr[j] > arr[j - 1]) {
                    continue;
                }
                tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
            }

        }
    }

    /* sortArr */
    // 참고
    public static void sortArr(int[] arr, boolean v2) {
        // 오름차순 정렬
        // 오른쪽이 제일 큰 값
        // 왼쪽이 제일 작은 값
        int tmp = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j + 1] < arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }

        }
    }
}
