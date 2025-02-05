public class App {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();
        // System.out.println(deck.drawCard());
        // System.out.println(deck.drawCard());
        // deck.printContents();

        // System.out.println("dfsfksdfljk");

        Hand hand = new Hand(5, deck);
        hand.printHand();
        System.out.println("playing card");
        System.out.println(hand.playCard(2, 1));
        System.out.println("sorting");
        hand.sortHand();
        hand.addCard(new Card());
        hand.printHand();
    }
}
