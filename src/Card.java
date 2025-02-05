public class Card {
    // Implement your card class here
    private int value;
    private int suit;
    private String name;

    private static int numCards = 0;

    public Card() {
        value = 0;
        suit = 0;
        name = "Joker";
        numCards++;
    }

    public Card(int _value, int _suit) {
        value = _value;
        suit = _suit;
        if (value == 1) {
            name = "Ace";
        } else if (value >= 2 && value <= 10) {
            name = Integer.toString(value);
        } else if (value == 11) {
            name = "Jack";
        } else if (value == 12) {
            name = "Queen";
        } else if (value == 13) {
            name = "King";
        }
        name += " of ";
        if (suit == 1) {
            name += "Clubs";
        } else if (suit == 2) {
            name += "Diamonds";
        } else if (suit == 3) {
            name += "Hearts";
        } else if (suit == 4) {
            name += "Spades";
        }
        numCards++;
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
        // ask
    }

    public static int getNumCards() {
        return numCards;
    }

    public void setVal(int newValue) {
        value = newValue;
        // ask
    }

    @Override
    public String toString() {
        return name;
    }
}
