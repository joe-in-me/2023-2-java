package day15.ch7;

public class DeckTest {



    public static void main(String[] args) {
        Deck deck = new Deck();

        Card c1 = deck.pick(51); // 인자는 index 번호. 해당 값 리턴하기. // 뺀 방은 null 로 바꾸지 않기.

        System.out.println("-----");

        Card pick = deck.pick();
        System.out.println("pick = " + pick);


        System.out.println("-----");
        System.out.println("-----");

        deck.shuffle(); // 섞기

    }
}

class Card {
    static final int KIND_MAX = 4; //카드 무늬의 수.
    static final int NUM_MAX = 13; // 무늬별 카드 수.

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    public Card() {
        this(Card.KIND_MAX, 1);

    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("kind: %d, number: %d", this.kind, this.number);
    }
}

class Deck {
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    public Deck() {
        int index = 0;
        for (int i = 1; i <= Card.KIND_MAX; i++) {
            for (int j = 1; j <= Card.NUM_MAX; j++) {
                cardArr[index++] = new Card(i, j);
            }
        }
//        this.check();
    }

    public Card pick(int i) {
        return this.cardArr[i];
    }

    public Card pick() {
//        return this.pick((int) (Math.random() * this.cardArr.length));
        return this.pick(getRandomNum(this.CARD_NUM));
    }

    public void shuffle() {
        Card tmp;
        for (int i = 0; i < this.cardArr.length; i++) {
            int rNum = getRandomNum(this.cardArr.length);
            if (rNum == i) continue;

            tmp = cardArr[i];
            cardArr[i] = cardArr[rNum];
            cardArr[rNum] = tmp;
        }
        this.check();
    }


    // UTIL
    private int getRandomNum(int max) {
        return (int) (Math.random() * max);
    }

    private int getRandomNum(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public void check() {
        for (Card card : this.cardArr) {
            System.out.println(card);
        }
    }


}