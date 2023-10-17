package day14.ch6;

// static에서는 this 사용 못함.

public class CardDeck {

    Card[] cards;

    public CardDeck() {
        init();

    }

    private void init() {
        cards = new Card[52];

        String[] patterns = {"Spade", "Heart", "Diamond", "Clover"};
        int index = 0;
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];    // 위치 ! -> 퍼포먼스
            for (int j = 1; j <= 13; j++) {
                String denomination = getNumberFromInt(j);
                this.cards[index++] = new Card(pattern, denomination);
            }

        }
    }

    private String getNumberFromInt(int num) {
        String strTmp;
        if (num == 1) strTmp = "A";
        else if (num == 11) strTmp = "J";
        else if (num == 12) strTmp = "Q";
        else if (num == 13) strTmp = "K";
        else strTmp = String.valueOf(num);
        return strTmp;
    }

    public void printAll() {
        for (Card card : this.cards) {
            card.printMySelf();
        }
    }

    public Card getCard() {
        int randNum;
        while (true) {
            randNum = (int) (Math.random() * cards.length);
            if (cards[randNum] != null) break;
        }
        Card tmpCard = cards[randNum];
        cards[randNum] = null;
        return tmpCard;
    }

    /*
     * 52장의 카드객체중
     * 하나의 주소값을 리턴
     * (랜덤 - 호출할때마다 다르게)
     * 넘겨줬으면, 해당 인덱스 객체 지우기. -> 해당 방 null로
     *
     * 이때, 또 해당 메소드 호출시 null인부분이 되면, 다시 랜덤한값을 도출. -> null 이아닐때까지 로직수행.
     *
     *
     *
     * */

    public Card getCard(boolean v2) {
        int randNum;
        while (true) {
            randNum = (int) (Math.random() * cards.length);
            if (cards[randNum] != null) {
                Card tmpCard = cards[randNum];
                cards[randNum] = null;
                return tmpCard;
            }
        }

    }
}
