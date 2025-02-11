public class Deck {
    private Card[] deck = new Card[52];
    private int length = 52;

    public Deck() {
        int index = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Card card = new Card(j, i);
                deck[index] = card;
                index++;
            }
        }
        shuffle();
    }

    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            int randomIndex = (int) (Math.random() * 52);
            Card tempCard = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = tempCard;
        }
    }

    public Card drawCard() {
        Card card = deck[0];
        for (int i = 0; i < length - 1; i++) {
            deck[i] = deck[i + 1];
        }
        deck[length - 1] = null;
        length--;
        return card;
    }

    public void printContents() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    @Override
    public String toString() {
        return "Deck of " + length + " cards";
    }
}
