import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    protected ArrayList<Card> cards = new ArrayList<Card>();
    // Each deck has an array list of cards based on the card
    // class we created in the other Card.java

    public Deck(){
        for(int i = 0; i <= 3; i++){
            String[] suites = {"spades", "hearts", "clubs", "diamonds"};
            for(int x = 1; x <= 13; x++){
                Card card = new Card(suites[i], x);
                this.cards.add(card);
            }
        }
    }
    // Constructor creates all the cards by creating 1-13 for
    // each suite in the array of suites

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
    }
    // Just shuffles the deck

    public void showDeck(){
        for(int i = 0; i < 52; i++){
            Card c = this.cards.get(i);
            c.displayCard();
        }
    }
    // This shows the deck and displays each card using the method
    // in Card.java
}
