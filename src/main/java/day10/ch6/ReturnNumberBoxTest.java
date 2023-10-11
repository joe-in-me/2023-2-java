package day10.ch6;

public class ReturnNumberBoxTest {

    public static void main(String[] args) {
        ReturnNumberBox returnNumberBox = new ReturnNumberBox();

        int result = returnNumberBox.sum(10, 20);
        System.out.println("result = " + result);
        int result2 = returnNumberBox.sum(20, 30);
        System.out.println("result2 = " + result2);


        int r3 = returnNumberBox.abs(-10); // 10 return;
        System.out.println("r3 = " + r3);

        System.out.println("returnNumberBox.abs(10) = " + returnNumberBox.abs(10));
        System.out.println("returnNumberBox.abs(-99) = " + returnNumberBox.abs(-99));
        System.out.println("returnNumberBox.abs(-578738572) = " + returnNumberBox.abs(-578738572));


    }

}
