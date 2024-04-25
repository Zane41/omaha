package zane41.omaha.classes;

import java.util.Collections;
import java.util.List;



import static zane41.omaha.classes.Suit.*;

public class Deck {

    public List<Card> deck;

    public Deck(List<Card> deck) {
        deck.add(new Card(1,"2",Spades,));
        deck.add(new Card(2,"3",Spades,));
        deck.add(new Card(3,"4",Spades,));
        deck.add(new Card(4,"5",Spades,));
        deck.add(new Card(5,"6",Spades,));
        deck.add(new Card(6,"7",Spades,));
        deck.add(new Card(7,"8",Spades,));
        deck.add(new Card(8,"9",Spades,));
        deck.add(new Card(9,"10",Spades,));
        deck.add(new Card(10,"Jack",Spades,));
        deck.add(new Card(11,"Queen",Spades,));
        deck.add(new Card(12,"King",Spades,));
        deck.add(new Card(13,"Ace",Spades,));
        deck.add(new Card(14,"2",Hearts,));
        deck.add(new Card(15,"3",Hearts,));
        deck.add(new Card(16,"4",Hearts,));
        deck.add(new Card(17,"5",Hearts,));
        deck.add(new Card(18,"6",Hearts,));
        deck.add(new Card(19,"7",Hearts,));
        deck.add(new Card(20,"8",Hearts,));
        deck.add(new Card(21,"9",Hearts,));
        deck.add(new Card(22,"10",Hearts,));
        deck.add(new Card(23,"Jack",Hearts,));
        deck.add(new Card(24,"Queen",Hearts,));
        deck.add(new Card(25,"King",Hearts,));
        deck.add(new Card(26,"Ace",Hearts,));
        deck.add(new Card(27,"2",Clubs,));
        deck.add(new Card(28,"3",Clubs,));
        deck.add(new Card(29,"4",Clubs,));
        deck.add(new Card(30,"5",Clubs,));
        deck.add(new Card(31,"6",Clubs,));
        deck.add(new Card(32,"7",Clubs,));
        deck.add(new Card(33,"8",Clubs,));
        deck.add(new Card(34,"9",Clubs,));
        deck.add(new Card(35,"10",Clubs,));
        deck.add(new Card(36,"Jack",Clubs,));
        deck.add(new Card(37,"Queen",Clubs,));
        deck.add(new Card(38,"King",Clubs,));
        deck.add(new Card(39,"Ace",Clubs,));
        deck.add(new Card(40,"2",Diamonds,));
        deck.add(new Card(41,"3",Diamonds,));
        deck.add(new Card(42,"4",Diamonds,));
        deck.add(new Card(43,"5",Diamonds,));
        deck.add(new Card(44,"6",Diamonds,));
        deck.add(new Card(45,"7",Diamonds,));
        deck.add(new Card(46,"8",Diamonds,));
        deck.add(new Card(47,"9",Diamonds,));
        deck.add(new Card(48,"10",Diamonds,));
        deck.add(new Card(49,"Jack",Diamonds,));
        deck.add(new Card(50,"Queen",Diamonds,));
        deck.add(new Card(51,"King",Diamonds,));
        deck.add(new Card(52,"Ace",Diamonds,));
    }

    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }

    public void fillPlayersHand (Hand playersHand, Hand opponentsHand){
        playersHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();
        opponentsHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();

        playersHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();
        opponentsHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();

        playersHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();
        opponentsHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();

        playersHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();
        opponentsHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();

        playersHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();
        opponentsHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();
    }
    public void takeOneCardWhileChangeForPlayer (Hand playersHand){
        playersHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();
    }
    public void takeOneCardWhileChangeForOpponent (Hand opponentHand){
        opponentHand.setOfCards.add(this.deck.getFirst());
        this.deck.removeFirst();
    }
}
