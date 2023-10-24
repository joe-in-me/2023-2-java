package day18.ch7;


import java.util.HashMap;
import java.util.Iterator;
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

class PolyArgumentTestVer4 {
    public static void main(String[] args) {
        Buyer3 buyer3 = new Buyer3();
        buyer3.buy(new Tv2());
        buyer3.buy(new Computer2());
        buyer3.buy(new Computer2());
        buyer3.summary();
    }
}

class Buyer3 {
    // 정수 money
    private int money;
    // 정수 bonusPoint
    private int bonusPoint;
    // Product2 객체 주소값 10개 저장가능
    private Product3[] products;
    // up index
    private int count;
    private int totalPrice;
    // 제품 이름 배열
    // index -> 0 : Tv , 1 : Computer 2 : Audio
    private Map<String, Integer> buyItems;


    public Buyer3() {
        this.money = 100000;
        this.buyItems = new HashMap<>();

    }

    public void buy(Product3 product) {
        if (this.money < product.getPrice()) {
            System.out.println("금액이 부족합니다.");
            return;
        }
        this.money -= product.getPrice();
        this.bonusPoint += product.getBonusPoint();

        String productName = product.getName();

        if (buyItems.containsKey(productName)) {
            this.buyItems.replace(productName,
                    this.buyItems.get(productName) + 1);

        } else {
            this.buyItems.put(productName, 1);
        }

        System.out.printf("%s 을(를) 구매하였습니다.\n",
                productName);
    }

    public void summary() {
        // 제품 이름 배열
        // index -> 0 : Tv , 1 : Computer 2 : Audio

        Iterator<String> iter = this.buyItems.keySet().iterator();
        String sb = "구매한 물건 : ";
        int commaIdx = 0;
        while (iter.hasNext()) {
            if (commaIdx != 0) sb += ", ";
            String key = iter.next();
            sb += String.format("%s: %s대",
                    key, this.buyItems.get(key));

            commaIdx++;
        }

        System.out.println(sb);
    }


    @Override
    public String toString() {
        return String.format("money: %d, bonusPoint: %d",
                this.money, this.bonusPoint);
    }


}

class Product3 {
    private String name;
    private int price;
    private int bonusPoint;

    public Product3(String name, int price) {
        this.name = name;
        this.price = price;
        this.bonusPoint = (int) (price * 0.1);
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getBonusPoint() {
        return this.bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("name: %s, price: %d, bonusPoint: %d",
                this.name, this.price, this.bonusPoint);
    }
}

/**
 * Tv2
 */
class Tv2 extends Product3 {
    public Tv2() {
        super("Tv", 100);
    }
}

/**
 * Computer2
 */
class Computer2 extends Product3 {
    public Computer2() {
        super("Computer", 200);
    }
}

/**
 * Audio2
 */
class Audio2 extends Product3 {
    public Audio2() {
        super("Audio", 500);
    }
}