package day18.ch7;

import day12.ch6.Card;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(10.3f);
        list.add(10.4D);
        list.add(10L);
        list.add("10");
        list.add(new Card());

        Object obj = 10;
        obj = 10.3f;
        obj = "10";
        obj = 10L;
        obj = 10d;
        obj = new Card();

        Object objNum = list.get(0);
        int num = (int) list.get(0);
        Object objFloat = list.get(1);
        float fNum = (float) list.get(1);


    }
}

class ArrayListTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(45);
        list.add(50);
        list.add(60);
        list.add(70);

        // [0]: 10
        // [1]: 20
        // [2]: 30
        // ...
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] " + list.get(i));
        }

        for (Integer num : list) {
            System.out.println("num = " + num);
        }


    }
}

class ArrayListTest3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.add(1, 100);
        // 값 삽입 (.add)
        System.out.println(list);

        list.add(3, 200);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

    }
}