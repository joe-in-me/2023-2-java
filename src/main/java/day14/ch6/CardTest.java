package day14.ch6;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
//        cardDeck.printAll();
//        /*
//        * Spade (A)
//        * Spade (2)
//        * Spade (3)
//        * Spade (4)
//        * ...
//        * Clover (K)
//        * */



        for (int i = 0; i < 52; i++) {
            cardDeck.getCard();
        }
        for (int i = 0; i < 52; i++) {
            System.out.println(cardDeck.cards[i] == null);
        }






    }

}
