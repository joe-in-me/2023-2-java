package day10.ch6;

import java.lang.reflect.Field;

public class TvTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.channel = 10;
        tv1.power = true;
        tv1.color = "red";

        Tv tv2 = new Tv();
        // 호출 call
        tv2.channel = 20;



        System.out.println("(tv1 == tv2) = " + (tv1 == tv2));

        System.out.println();

        System.out.println("tv1.channel = " + tv1.channel);
        System.out.println("tv1.channel = " + tv1.power);
        System.out.println("tv1.channel = " + tv1.color);

        System.out.println();

        System.out.println("tv2.channel = " + tv2.channel);
        System.out.println("tv2.channel = " + tv2.power);   // default = false
        System.out.println("tv2.channel = " + tv2.color);   // default = null



    }
}
