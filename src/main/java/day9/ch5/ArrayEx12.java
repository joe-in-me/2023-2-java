package day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] = " + names[i]);

        }
        System.out.println();

        names[1] = "Woo";
        System.out.println(Arrays.toString(names));

        System.out.println();
        for (String str : names) {
            System.out.println("str = " + str);
        }
        System.out.println();

    }

}
