package day13.ch6;

import day12.ch6.Card;

public class CardTest2 {
    public static void main(String[] args) {
        Card[] cards = mkCards();
        System.out.println(cards.length);
        System.out.println();
        for (Card card : cards) {
            card.printYourSelf();

//            Card.printYourSelf(); (local)
//            System.out.println("card.kind = " + card.kind); // Card
//            System.out.println("card.number = " + card.number);
        }
    }

    public static Card[] mkCards() {
        /*
         * 52개 카드를 가지고 있는 배열.
         * 빈방이여도 관계 x
         *
         * */

        /*
         * 카드모양이 Spade, Heart, Diamond, Clover
         * A , 2 ~ 10, J, Q, K
         * 각 모양별 13장.
         *
         * */

        Card[] tmp = new Card[52];
        String[] shape = {"Spade", "Heart", "Diamond", "Clover"};

        int count = 0; // each card
        String strTmp;
        for (int i = 0; i < shape.length; i++) { // 카드 모양
            for (int j = 1; j <= 13; j++) { // 카드 숫자.
                tmp[count] = new Card();
                tmp[count].kind = shape[i];
                strTmp = getNumberFromInt(j);
//                if (k == 1) strTmp = "A";           // .getNumberFromInt();
//                else if (k == 11) strTmp = "J";
//                else if (k == 12) strTmp = "Q";
//                else if (k == 13) strTmp = "K";
//                else strTmp = "" + k;
                tmp[count++].number = strTmp;
            }
        }
        return tmp;
    }

    public static String getNumberFromInt(int num) {
        String strTmp;
        if (num == 1) strTmp = "A";
        else if (num == 11) strTmp = "J";
        else if (num == 12) strTmp = "Q";
        else if (num == 13) strTmp = "K";
        else strTmp = String.valueOf(num);
        return strTmp;
    }
}

