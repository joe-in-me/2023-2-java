package day18.ch7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", 10);
        map.put("b", 20);
        map.put("b", 30); // 20에 덮어써짐.

        Object o = map.get("a");
        int val = (int) o;
        System.out.println("val = " + val);


    }
}

class HashMapTest2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tv", 0);
        map.put("Computer", 0);
        map.put("Audio", 0);

        map.put("Tv", (map.get("Tv")) + 1);
        map.put("Tv", (map.get("Tv")) + 1);
        map.put("Tv", (map.get("Tv")) + 1);


        System.out.println("Tv-Count: " + map.get("Tv"));
        System.out.println(map.size());

    }
}
