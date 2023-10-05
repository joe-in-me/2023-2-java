package day7.ch5;

public class Array3Mission {
    public static void main(String[] args) {
        // arr2 는 길이가 4
        // arr1 과 같은 방에는 같은 값을 가지고 있고,
        // 마지막 방에는 값을 20으로.

        int[] arr1 = {5, 10, 15};
        int[] arr2 = new int[arr1.length + 1]; // 4
        for (int i = 0; i < arr1.length; i++) { // 0 1 2 3
            arr2[i] = arr1[i];
            if (i == arr1.length - 1) {
                arr2[i + 1] = 20;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }


        /* ---------------------------- */


        arr2 = new int[arr1.length + 1]; // 4
        for (int i = 0; i < arr1.length; i++) { // 0 1 2 3
            arr2[i] = arr1[i];
        }

        arr2[arr1.length] = 20;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
    }
}


