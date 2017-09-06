import java.util.Arrays;

public class DeckTest{
    public static void main(String[] args){
        Deck d = new Deck();
        d.showDeck();
        d.shuffleDeck();
        d.showDeck();
    }
    // This tests out our methods in Deck and Card
    // We show the unshuffled deck first and then
    // shuffle the deck and then show it again
    // to verify that it has shuffled
}
