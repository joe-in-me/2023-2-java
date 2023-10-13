package day12.ch6;

public class Card {
    String kind;
    String number;

    public int getScore() {
        if (this.number.equals("A")) {
            return 1;
        } else if (this.number.equals("J")) {
            return 11;
        } else if (this.number.equals("Q")) {
            return 12;
        } else if (this.number.equals("K")) {
            return 13;
        }
        return Integer.parseInt(this.number);

    }

    public int getScore(boolean v2) {
        switch (number) {
            case "A":
                return 1;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
        }
        return Integer.parseInt(number);


    }
}
