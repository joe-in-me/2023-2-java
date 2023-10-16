package day13.ch6;

public class CardTest3 {
    public static void main(String[] args) {
        Card card = new Card();
        card.pattern = "Spade";
        card.denomination = "A";

        card.printYourSelf();

        Card card2 = new Card();
        card2.pattern = "Heart";
        card2.denomination = "J";

        card2.printYourSelf();

        Card[] cards = mkCards();
        System.out.println("cards.length = " + cards.length);

        System.out.println();

        for (Card card1 : cards) {
            card1.printYourSelf();
        }

    }

    public static Card[] mkCards() {
        Card[] cards = new Card[52];
        int count = 0;
        String[] shape = {"Spade", "Heart", "Diamond", "Clover"};

        for (int i = 0; i < shape.length; i++) {
            for (int j = 1; j <= 13; j++) {
                cards[count] = new Card();
                cards[count].pattern = shape[i];
                cards[count++].denomination = CardTest2.getNumberFromInt(j);
            }
        }
        return cards;
    }
}

//
class Card {
    String pattern; // Spade, Heart, ... 저장 예정
    String denomination; // A, 2~10, J, Q, K 저장 예정

    void printYourSelf() {
        System.out.printf("%s-%s\n", this.pattern, this.denomination);
    }
}
