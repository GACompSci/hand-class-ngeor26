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
        for(int i = 0; i < hand.size(); i++){
            int min = hand.get(i).getValue();
            int minIndex = i;
            for(int j = i + 1; j < hand.size(); j++){
                if(hand.get(j).getValue() < min){
                    min = hand.get(j).getValue();
                    minIndex = j;
                }
            }

            if(minIndex != i){
                Card temp = hand.get(i);
                hand.set(i, hand.get(minIndex));
                hand.set(minIndex, temp);
            }
        }
    }
}
