package day10.ch6;

public class TvTest2 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        System.out.println("tv1.channel = " + tv1.channel); // default == 0
        tv1.channelUp(); // ++
        System.out.println("tv1.channel = " + tv1.channel);

        tv1.channelUp(); // ++
        System.out.println("tv1.channel = " + tv1.channel);

        System.out.println();
        Tv tv2 = new Tv();
        System.out.println("tv2.channel = " + tv2.channel);
    }
}
