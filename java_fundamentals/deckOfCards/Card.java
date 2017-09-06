
public class Card {
    protected String suite;
    protected Integer value;
    // These are the attributes of each card

    public Card(String suite, Integer value){
        if(value <=13 && value >= 1){
            this.value = value;
        }
        // Since there are 13 cards per suite, we want our
        // inputted value to be between 1 and 13

        if(suite == "hearts" || suite == "diamonds" || suite == "clubs" || suite == "spades"){
            this.suite = suite;
        }
        // Since there are four types of suites we only
        // want to accept those correct ones
    }
    // Constructor for the card (11 = jack, 12 = queen, 13 = king, and 1 = ace)

    public void displayCard(){
        System.out.println("CARD INFO| Suite: " + this.suite + " Value: " + this.value);
    }
    // This just shows the card's information
}
