package day14.ch6;

public class Card {
    String pattern;
    String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }


    void printMySelf() {
        System.out.printf("%s (%s)\n", pattern, denomination);
    }

}
