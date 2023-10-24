package day19.ch7;

// 디폴트 속성들이 어떻게 되는지 알아보기 쉽다.
public interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();

    String getCardKind();

}

interface PlayingChess extends PlayingCard {
    void moveHorse(int x, int y);
}

class Chess implements PlayingChess {

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

    @Override
    public void moveHorse(int x, int y) {

    }
}


class Card implements PlayingCard {

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}


class PlayingCardTest {
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}