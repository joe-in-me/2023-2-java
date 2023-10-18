package day15.ch7;

public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 captionTv2 = new CaptionTv2();
        captionTv2.channel = 10;
        captionTv2.channelUp();

        System.out.println("captionTv2.channel = " + captionTv2.channel);
//        captionTv2.printParentChannel();

    }
}

class CaptionTv2 extends Tv {
    boolean caption;
    int channel;

    void displayCaption(String text) {
        if (caption && super.power) {
            System.out.println(text);
        }


    }

    // 1. Tv2 의 채널, 2. CaptionTv 의 채널, 3. 해당 메소드의 지역변수 채널
    void printParentChannel(int channel) {
        System.out.println("super.channel = " + super.channel);
    }
}
/*
 *
 * 현재 클래스에 해당 필드가 없으면, 실제로 super 로 올라가서 해당 필드를 조회.
 * 현재 클래스로 끌어오는것이 아님.
 *
 * */


class Tv2 {
    boolean power;
    int channel;

    void power() {
        this.power = !power;
    }

    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        this.channel--;
    }
}