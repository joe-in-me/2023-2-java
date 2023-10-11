package day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {

        Tv tv1 = new Tv();

        System.out.println("tv1.channel = " + tv1.channel); // default == 0
        tv1.channelUp(); // ++
        System.out.println("tv1.channel = " + tv1.channel);

        tv1.channelUp(); // ++
        System.out.println("tv1.channel = " + tv1.channel);

        System.out.println();
        Tv tv2 = tv1; // shallow copy
        System.out.println("tv2.channel = " + tv2.channel); // tv2 에 tv1 동기화.

    }
}
