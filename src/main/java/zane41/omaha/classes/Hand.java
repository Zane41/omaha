package zane41.omaha.classes;

import java.util.ArrayList;

public class Hand implements Comparable<Hand> {

    ArrayList<Card> setOfCards = new ArrayList<>();



    public void discardACard (Card card){
        this.setOfCards.remove(card);
    }
    @Override
    public int compareTo(Hand o) {
        return 0;
    }
}
