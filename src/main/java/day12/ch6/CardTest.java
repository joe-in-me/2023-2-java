package day12.ch6;

public class CardTest {
    public static void main(String[] args) {

        Card card1 = new Card();
        card1.kind = "Spade";
        card1.number = "A";

        Card card2 = new Card();
        card2.kind = "Heart";
        card2.number = "10";

        System.out.println(card1 == card2);

        System.out.println("card1.kind = " + card1.kind);
        System.out.println("card2.kind = " + card2.kind);


        System.out.println(card1.getScore()); // 1
        System.out.println(card2.getScore()); // 10
    }

}
