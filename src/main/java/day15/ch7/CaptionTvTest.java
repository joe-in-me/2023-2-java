package day15.ch7;

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv captionTv = new CaptionTv();
        System.out.printf("captionTv.power: %b\n", captionTv.power);


        captionTv.channel = 10;
        captionTv.channelUp();
        System.out.println("captionTv.channel = " + captionTv.channel);
        captionTv.displayCaption("반갑다 친구들");


        captionTv.caption = !captionTv.caption;
        captionTv.displayCaption("jjjgiarsji");


    }
}


class Tv {
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

class CaptionTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    @Override
    void channelUp(){
        channel += 2;
    }
}
