package day19.ch7;

// 추상 메소드가 하나라도 있으면 클래스도 추상클래스어야 한다!
// 추상 메소드가 없어도 abstract class 는 만들 수 있다.
// ㄴ> 구현하여 사용하라고!
// 추상클래스 역시 인터페이스처럼 익명객체 사용 가능하다.
// 람다는 안된다.
// ㄴ> functional interface 가 아니라서 그런듯 하다.


class PlayerTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(10);
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play(20);

        Player player = audioPlayer;
        player.play(30);
        player = videoPlayer;
        player.play(40);

    }
}

public abstract class Player {
    // 추상메소드는 강제성이 있다.
    public abstract void play(int position);


}

class AudioPlayer extends Player {
    @Override
    public void play(int position) {
        System.out.println("Audio Play 위치 : " + position);
    }
}

class VideoPlayer extends Player {

    @Override
    public void play(int position) {
        System.out.println("Video Play 위치 : " + position);
    }
}

// 나 자신도 abstract 가 되면, 구현의 의무를 잃는다.
// interface 의 interface 를 extends 한것같은 개념.
abstract class DvdPlayer extends Player {
}




