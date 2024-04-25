package zane41.omaha.classes;

import java.io.File;
import java.util.Collections;
import java.util.List;



import static zane41.omaha.classes.Suit.*;

public class Deck {

    public List<Card> deck;

    public Deck(List<Card> deck) {
        deck.add(new Card(1,"2",Spades, new Img(new File("/resources/Images/Atlas_deck_2_of_spades.svg"))));
        deck.add(new Card(2,"3",Spades,new Img(new File("/resources/Images/Atlas_deck_3_of_spades.svg"))));
        deck.add(new Card(3,"4",Spades,new Img(new File("/resources/Images/Atlas_deck_4_of_spades.svg"))));
        deck.add(new Card(4,"5",Spades,new Img(new File("/resources/Images/Atlas_deck_5_of_spades.svg"))));
        deck.add(new Card(5,"6",Spades,new Img(new File("/resources/Images/Atlas_deck_6_of_spades.svg"))));
        deck.add(new Card(6,"7",Spades,new Img(new File("/resources/Images/Atlas_deck_7_of_spades.svg"))));
        deck.add(new Card(7,"8",Spades,new Img(new File("/resources/Images/Atlas_deck_8_of_spades.svg"))));
        deck.add(new Card(8,"9",Spades,new Img(new File("/resources/Images/Atlas_deck_9_of_spades.svg"))));
        deck.add(new Card(9,"10",Spades,new Img(new File("/resources/Images/Atlas_deck_10_of_spades.svg"))));
        deck.add(new Card(10,"Jack",Spades,new Img(new File("/resources/Images/Atlas_deck_jack_of_spades.svg"))));
        deck.add(new Card(11,"Queen",Spades,new Img(new File("/resources/Images/Atlas_deck_queen_of_spades.svg"))));
        deck.add(new Card(12,"King",Spades,new Img(new File("/resources/Images/Atlas_deck_king_of_spades.svg"))));
        deck.add(new Card(13,"Ace",Spades,new Img(new File("/resources/Images/Atlas_deck_ace_of_spades.svg"))));
        deck.add(new Card(14,"2",Hearts,new Img(new File("/resources/Images/Atlas_deck_2_of_hearts.svg"))));
        deck.add(new Card(15,"3",Hearts,new Img(new File("/resources/Images/Atlas_deck_3_of_hearts.svg"))));
        deck.add(new Card(16,"4",Hearts,new Img(new File("/resources/Images/Atlas_deck_4_of_hearts.svg"))));
        deck.add(new Card(17,"5",Hearts,new Img(new File("/resources/Images/Atlas_deck_5_of_hearts.svg"))));
        deck.add(new Card(18,"6",Hearts,new Img(new File("/resources/Images/Atlas_deck_6_of_hearts.svg"))));
        deck.add(new Card(19,"7",Hearts,new Img(new File("/resources/Images/Atlas_deck_7_of_hearts.svg"))));
        deck.add(new Card(20,"8",Hearts,new Img(new File("/resources/Images/Atlas_deck_8_of_hearts.svg"))));
        deck.add(new Card(21,"9",Hearts,new Img(new File("/resources/Images/Atlas_deck_9_of_hearts.svg"))));
        deck.add(new Card(22,"10",Hearts,new Img(new File("/resources/Images/Atlas_deck_10_of_hearts.svg"))));
        deck.add(new Card(23,"Jack",Hearts,new Img(new File("/resources/Images/Atlas_deck_jack_of_hearts.svg"))));
        deck.add(new Card(24,"Queen",Hearts,new Img(new File("/resources/Images/Atlas_deck_queen_of_hearts.svg"))));
        deck.add(new Card(25,"King",Hearts,new Img(new File("/resources/Images/Atlas_deck_king_of_hearts.svg"))));
        deck.add(new Card(26,"Ace",Hearts,new Img(new File("/resources/Images/Atlas_deck_ace_of_hearts.svg"))));
        deck.add(new Card(27,"2",Clubs,new Img(new File("/resources/Images/Atlas_deck_2_of_clubs.svg"))));
        deck.add(new Card(28,"3",Clubs,new Img(new File("/resources/Images/Atlas_deck_3_of_clubs.svg"))));
        deck.add(new Card(29,"4",Clubs,new Img(new File("/resources/Images/Atlas_deck_4_of_clubs.svg"))));
        deck.add(new Card(30,"5",Clubs,new Img(new File("/resources/Images/Atlas_deck_5_of_clubs.svg"))));
        deck.add(new Card(31,"6",Clubs,new Img(new File("/resources/Images/Atlas_deck_6_of_clubs.svg"))));
        deck.add(new Card(32,"7",Clubs,new Img(new File("/resources/Images/Atlas_deck_7_of_clubs.svg"))));
        deck.add(new Card(33,"8",Clubs,new Img(new File("/resources/Images/Atlas_deck_8_of_clubs.svg"))));
        deck.add(new Card(34,"9",Clubs,new Img(new File("/resources/Images/Atlas_deck_9_of_clubs.svg"))));
        deck.add(new Card(35,"10",Clubs,new Img(new File("/resources/Images/Atlas_deck_10_of_clubs.svg"))));
        deck.add(new Card(36,"Jack",Clubs,new Img(new File("/resources/Images/Atlas_deck_jack_of_clubs.svg"))));
        deck.add(new Card(37,"Queen",Clubs,new Img(new File("/resources/Images/Atlas_deck_queen_of_clubs.svg"))));
        deck.add(new Card(38,"King",Clubs,new Img(new File("/resources/Images/Atlas_deck_king_of_clubs.svg"))));
        deck.add(new Card(39,"Ace",Clubs,new Img(new File("/resources/Images/Atlas_deck_ace_of_clubs.svg"))));
        deck.add(new Card(40,"2",Diamonds,new Img(new File("/resources/Images/Atlas_deck_2_of_diamonds.svg"))));
        deck.add(new Card(41,"3",Diamonds,new Img(new File("/resources/Images/Atlas_deck_3_of_diamonds.svg"))));
        deck.add(new Card(42,"4",Diamonds,new Img(new File("/resources/Images/Atlas_deck_4_of_diamonds.svg"))));
        deck.add(new Card(43,"5",Diamonds,new Img(new File("/resources/Images/Atlas_deck_5_of_diamonds.svg"))));
        deck.add(new Card(44,"6",Diamonds,new Img(new File("/resources/Images/Atlas_deck_6_of_diamonds.svg"))));
        deck.add(new Card(45,"7",Diamonds,new Img(new File("/resources/Images/Atlas_deck_7_of_diamonds.svg"))));
        deck.add(new Card(46,"8",Diamonds,new Img(new File("/resources/Images/Atlas_deck_8_of_diamonds.svg"))));
        deck.add(new Card(47,"9",Diamonds,new Img(new File("/resources/Images/Atlas_deck_9_of_diamonds.svg"))));
        deck.add(new Card(48,"10",Diamonds,new Img(new File("/resources/Images/Atlas_deck_10_of_diamonds.svg"))));
        deck.add(new Card(49,"Jack",Diamonds,new Img(new File("/resources/Images/Atlas_deck_jack_of_diamonds.svg"))));
        deck.add(new Card(50,"Queen",Diamonds,new Img(new File("/resources/Images/Atlas_deck_queen_of_diamonds.svg"))));
        deck.add(new Card(51,"King",Diamonds,new Img(new File("/resources/Images/Atlas_deck_king_of_diamonds.svg"))));
        deck.add(new Card(52,"Ace",Diamonds,new Img(new File("/resources/Images/Atlas_deck_ace_of_diamonds.svg"))));
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
