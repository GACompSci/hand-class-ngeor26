import java.util.ArrayList;

public class Hand {
    ArrayList<Card> hand = new ArrayList<Card>();

    public Hand(int drawnCards, Deck deck) {
        for (int i = 0; i < drawnCards; i++) {
            hand.add(deck.drawCard());
        }
    }

    public boolean cardPresent(int value, int suit) {
        for (Card card : hand) {
            if (card.getValue() == value && card.getSuit() == suit) {
                return true;
            }
        }
        return false;
    }

    public Card playCard(int value, int suit) {
        if (cardPresent(value, suit)) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getValue() == value && hand.get(i).getSuit() == suit) {
                    Card card = hand.get(i);
                    hand.remove(i);
                    return card;
                }
            }
        }
        return null;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void printHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void sortHand() {
        int n = hand.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (hand.get(j).getValue() > hand.get(j + 1).getValue()) {
                    Card temp = hand.get(j);
                    hand.set(j, hand.get(j + 1));
                    hand.set(j + 1, temp);
                    swapped = true;
                }
            }

            // If no two elements were swapped, then break
            if (!swapped)
                break;
        }
    }
}
