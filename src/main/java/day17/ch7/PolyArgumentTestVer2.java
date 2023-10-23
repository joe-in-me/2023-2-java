package day17.ch7;

/**
 * PolyArgumentTestVer2
 */
public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 product2 = new Product2("제품명", 1000);
        System.out.println(product2);

    }
}

/**
 * PolyArgumentTestVer2of2
 */
class PolyArgumentTestVer2of2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        System.out.println(tv);
        // name: Tv, price: 100, bonusPoint: 10
        System.out.println("------------------");
        Computer2 computer = new Computer2();
        System.out.println(computer);
        // name:Computer, price:200, bonusPoint: 20
        System.out.println("------------------");
        Audio2 audio = new Audio2();
        System.out.println(audio);
        // name: Audio, price: 500, bonusPoint: 50


    }
}

/**
 * PolyArgumentTestVer3of2
 */
class PolyArgumentTestVer3of2 {
    public static void main(String[] args) {
        Buyer2 buyer = new Buyer2();

        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Audio2());
        buyer.buy(new Tv2());
        buyer.buy(new Tv2());
        buyer.buy(new Tv2());
        buyer.buy(new Tv2());
        buyer.buy(new Tv2());


        System.out.println();
        buyer.summary(); // 총 구매 금액

        //


    }
}

/**
 * Buyer2
 */
class Buyer2 {
    // 정수 money
    private int money;
    // 정수 bonusPoint
    private int bonusPoint;
    // Product2 객체 주소값 10개 저장가능
    private Product2[] products;
    // up index
    private int count;
    private int totalPrice;
    // 제품 이름 배열
    // index -> 0 : Tv , 1 : Computer 2 : Audio
    private int[] productCnt;


    public Product2[] getProducts() {
        return products;
    }

    public Buyer2() {
        this.money = 100000;
        this.products = new Product2[10];
        this.productCnt = new int[3];
    }

    public void buy(Product2 product) {
        if (this.count >= products.length) {
            System.out.println("담을 공간이 없습니다.");
            return;
        }
        // 머니 차감, 보너스 증가
        // 머니가 부족하면 구매 불가.
        // 메시지도 출력
        if (this.money < product.getPrice()) {
            System.out.println("금액이 부족합니다.");
            return;
        }
        this.money -= product.getPrice();
        this.bonusPoint += product.getBonusPoint();
        this.products[this.count++] = product;
        System.out.printf("%s 을(를) 구매하였습니다.\n",
                product.getName());
    }

    public void summary() {
        // 제품 이름 배열
        // index -> 0 : Tv , 1 : Computer 2 : Audio
        String[] productsName = {"Tv", "Computer", "Audio"};
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] == null) break;
            this.totalPrice += this.products[i].getPrice();

            for (int j = 0; j < productsName.length; j++) {
                if (this.products[i].getName().equalsIgnoreCase(productsName[j])) {
                    ++this.productCnt[j];
                    break;
                }
            }
        }
        // 출력
        String sb = "구매한 물건 : " + productsName[0] + " " + productCnt[0] + "개";
        for (int i = 1; i < productsName.length; i++) {
            sb += ", " + productsName[i] + " " + productCnt[i] + "개";
        }
        System.out.println(sb);
    }



    @Override
    public String toString() {
        return String.format("money: %d, bonusPoint: %d",
                this.money, this.bonusPoint);
    }


}

/**
 * Product2
 */
class Product2 {
    private String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price) {
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
class Tv2 extends Product2 {
    public Tv2() {
        super("Tv", 100);
    }
}

/**
 * Computer2
 */
class Computer2 extends Product2 {
    public Computer2() {
        super("Computer", 200);
    }
}

/**
 * Audio2
 */
class Audio2 extends Product2 {
    public Audio2() {
        super("Audio", 500);
    }
}
