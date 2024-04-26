package zane41.omaha.classes;

import java.io.File;
import java.util.Collections;
import java.util.List;



import static zane41.omaha.classes.Suit.*;

public class Deck {

    public List<Card> deck = null;

    public Deck() {
        deck.add(new Card(2,"2",Spades, new Img(new File("/resources/Images/Atlas_deck_2_of_spades.svg"))));
        deck.add(new Card(3,"3",Spades,new Img(new File("/resources/Images/Atlas_deck_3_of_spades.svg"))));
        deck.add(new Card(4,"4",Spades,new Img(new File("/resources/Images/Atlas_deck_4_of_spades.svg"))));
        deck.add(new Card(5,"5",Spades,new Img(new File("/resources/Images/Atlas_deck_5_of_spades.svg"))));
        deck.add(new Card(6,"6",Spades,new Img(new File("/resources/Images/Atlas_deck_6_of_spades.svg"))));
        deck.add(new Card(7,"7",Spades,new Img(new File("/resources/Images/Atlas_deck_7_of_spades.svg"))));
        deck.add(new Card(8,"8",Spades,new Img(new File("/resources/Images/Atlas_deck_8_of_spades.svg"))));
        deck.add(new Card(9,"9",Spades,new Img(new File("/resources/Images/Atlas_deck_9_of_spades.svg"))));
        deck.add(new Card(10,"10",Spades,new Img(new File("/resources/Images/Atlas_deck_10_of_spades.svg"))));
        deck.add(new Card(11,"Jack",Spades,new Img(new File("/resources/Images/Atlas_deck_jack_of_spades.svg"))));
        deck.add(new Card(12,"Queen",Spades,new Img(new File("/resources/Images/Atlas_deck_queen_of_spades.svg"))));
        deck.add(new Card(13,"King",Spades,new Img(new File("/resources/Images/Atlas_deck_king_of_spades.svg"))));
        deck.add(new Card(14,"Ace",Spades,new Img(new File("/resources/Images/Atlas_deck_ace_of_spades.svg"))));
        deck.add(new Card(2,"2",Hearts,new Img(new File("/resources/Images/Atlas_deck_2_of_hearts.svg"))));
        deck.add(new Card(3,"3",Hearts,new Img(new File("/resources/Images/Atlas_deck_3_of_hearts.svg"))));
        deck.add(new Card(4,"4",Hearts,new Img(new File("/resources/Images/Atlas_deck_4_of_hearts.svg"))));
        deck.add(new Card(5,"5",Hearts,new Img(new File("/resources/Images/Atlas_deck_5_of_hearts.svg"))));
        deck.add(new Card(6,"6",Hearts,new Img(new File("/resources/Images/Atlas_deck_6_of_hearts.svg"))));
        deck.add(new Card(7,"7",Hearts,new Img(new File("/resources/Images/Atlas_deck_7_of_hearts.svg"))));
        deck.add(new Card(8,"8",Hearts,new Img(new File("/resources/Images/Atlas_deck_8_of_hearts.svg"))));
        deck.add(new Card(9,"9",Hearts,new Img(new File("/resources/Images/Atlas_deck_9_of_hearts.svg"))));
        deck.add(new Card(10,"10",Hearts,new Img(new File("/resources/Images/Atlas_deck_10_of_hearts.svg"))));
        deck.add(new Card(11,"Jack",Hearts,new Img(new File("/resources/Images/Atlas_deck_jack_of_hearts.svg"))));
        deck.add(new Card(12,"Queen",Hearts,new Img(new File("/resources/Images/Atlas_deck_queen_of_hearts.svg"))));
        deck.add(new Card(13,"King",Hearts,new Img(new File("/resources/Images/Atlas_deck_king_of_hearts.svg"))));
        deck.add(new Card(14,"Ace",Hearts,new Img(new File("/resources/Images/Atlas_deck_ace_of_hearts.svg"))));
        deck.add(new Card(2,"2",Clubs,new Img(new File("/resources/Images/Atlas_deck_2_of_clubs.svg"))));
        deck.add(new Card(3,"3",Clubs,new Img(new File("/resources/Images/Atlas_deck_3_of_clubs.svg"))));
        deck.add(new Card(4,"4",Clubs,new Img(new File("/resources/Images/Atlas_deck_4_of_clubs.svg"))));
        deck.add(new Card(5,"5",Clubs,new Img(new File("/resources/Images/Atlas_deck_5_of_clubs.svg"))));
        deck.add(new Card(6,"6",Clubs,new Img(new File("/resources/Images/Atlas_deck_6_of_clubs.svg"))));
        deck.add(new Card(7,"7",Clubs,new Img(new File("/resources/Images/Atlas_deck_7_of_clubs.svg"))));
        deck.add(new Card(8,"8",Clubs,new Img(new File("/resources/Images/Atlas_deck_8_of_clubs.svg"))));
        deck.add(new Card(9,"9",Clubs,new Img(new File("/resources/Images/Atlas_deck_9_of_clubs.svg"))));
        deck.add(new Card(10,"10",Clubs,new Img(new File("/resources/Images/Atlas_deck_10_of_clubs.svg"))));
        deck.add(new Card(11,"Jack",Clubs,new Img(new File("/resources/Images/Atlas_deck_jack_of_clubs.svg"))));
        deck.add(new Card(12,"Queen",Clubs,new Img(new File("/resources/Images/Atlas_deck_queen_of_clubs.svg"))));
        deck.add(new Card(13,"King",Clubs,new Img(new File("/resources/Images/Atlas_deck_king_of_clubs.svg"))));
        deck.add(new Card(14,"Ace",Clubs,new Img(new File("/resources/Images/Atlas_deck_ace_of_clubs.svg"))));
        deck.add(new Card(2,"2",Diamonds,new Img(new File("/resources/Images/Atlas_deck_2_of_diamonds.svg"))));
        deck.add(new Card(3,"3",Diamonds,new Img(new File("/resources/Images/Atlas_deck_3_of_diamonds.svg"))));
        deck.add(new Card(4,"4",Diamonds,new Img(new File("/resources/Images/Atlas_deck_4_of_diamonds.svg"))));
        deck.add(new Card(5,"5",Diamonds,new Img(new File("/resources/Images/Atlas_deck_5_of_diamonds.svg"))));
        deck.add(new Card(6,"6",Diamonds,new Img(new File("/resources/Images/Atlas_deck_6_of_diamonds.svg"))));
        deck.add(new Card(7,"7",Diamonds,new Img(new File("/resources/Images/Atlas_deck_7_of_diamonds.svg"))));
        deck.add(new Card(8,"8",Diamonds,new Img(new File("/resources/Images/Atlas_deck_8_of_diamonds.svg"))));
        deck.add(new Card(9,"9",Diamonds,new Img(new File("/resources/Images/Atlas_deck_9_of_diamonds.svg"))));
        deck.add(new Card(10,"10",Diamonds,new Img(new File("/resources/Images/Atlas_deck_10_of_diamonds.svg"))));
        deck.add(new Card(11,"Jack",Diamonds,new Img(new File("/resources/Images/Atlas_deck_jack_of_diamonds.svg"))));
        deck.add(new Card(12,"Queen",Diamonds,new Img(new File("/resources/Images/Atlas_deck_queen_of_diamonds.svg"))));
        deck.add(new Card(13,"King",Diamonds,new Img(new File("/resources/Images/Atlas_deck_king_of_diamonds.svg"))));
        deck.add(new Card(14,"Ace",Diamonds,new Img(new File("/resources/Images/Atlas_deck_ace_of_diamonds.svg"))));
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
