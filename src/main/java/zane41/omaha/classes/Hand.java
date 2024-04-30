package zane41.omaha.classes;

import java.util.ArrayList;

import static zane41.omaha.classes.ValuesOfHands.*;

public class Hand  {

    public ArrayList<Card> setOfCards = new ArrayList<>();




    public ValueOfAHand calcWeight (){
        ValueOfAHand currentHandWeight = new ValueOfAHand();
        //переменные для подсчета комбинации
        int flushCounter=1, pairCounter=0, setCounter=0, straightCounter=1,
            quadCounter=0, fullhouseCounter=0, straightflushCounter=1, pairTwoCounter=0, kickerCounter=0;


         if(this.setOfCards.get(0).valueForCompare==this.setOfCards.get(1).valueForCompare
            && this.setOfCards.get(0).valueForCompare!=this.setOfCards.get(2).valueForCompare ||
            this.setOfCards.get(1).valueForCompare==this.setOfCards.get(2).valueForCompare
            && this.setOfCards.get(1).valueForCompare!=this.setOfCards.get(3).valueForCompare ||
            this.setOfCards.get(2).valueForCompare==this.setOfCards.get(3).valueForCompare
            && this.setOfCards.get(3).valueForCompare!=this.setOfCards.get(4).valueForCompare ||
            this.setOfCards.get(3).valueForCompare==this.setOfCards.get(4).valueForCompare)
              pairCounter++;

        if(this.setOfCards.get(0).valueForCompare==this.setOfCards.get(1).valueForCompare
           && this.setOfCards.get(0).valueForCompare!=this.setOfCards.get(2).valueForCompare &&
           this.setOfCards.get(2).valueForCompare==this.setOfCards.get(3).valueForCompare ||
           this.setOfCards.get(0).valueForCompare==this.setOfCards.get(1).valueForCompare
           && this.setOfCards.get(0).valueForCompare!=this.setOfCards.get(2).valueForCompare &&
           this.setOfCards.get(2).valueForCompare!=this.setOfCards.get(3).valueForCompare &&
           this.setOfCards.get(3).valueForCompare==this.setOfCards.get(4).valueForCompare ||
           this.setOfCards.get(0).valueForCompare!=this.setOfCards.get(1).valueForCompare
           && this.setOfCards.get(1).valueForCompare==this.setOfCards.get(2).valueForCompare &&
           this.setOfCards.get(1).valueForCompare!=this.setOfCards.get(3).valueForCompare &&
           this.setOfCards.get(3).valueForCompare==this.setOfCards.get(4).valueForCompare
           )
            pairTwoCounter++;

         if(this.setOfCards.get(0).valueForCompare==this.setOfCards.get(1).valueForCompare
            && this.setOfCards.get(2).valueForCompare==this.setOfCards.get(4).valueForCompare
            || this.setOfCards.get(0).valueForCompare==this.setOfCards.get(2).valueForCompare
            && this.setOfCards.get(3).valueForCompare==this.setOfCards.get(4).valueForCompare)
                fullhouseCounter++;

         if(this.setOfCards.get(0).valueForCompare==this.setOfCards.get(2).valueForCompare||
            this.setOfCards.get(1).valueForCompare==this.setOfCards.get(3).valueForCompare||
            this.setOfCards.get(2).valueForCompare==this.setOfCards.get(4).valueForCompare)
            setCounter++;

         if(this.setOfCards.get(0).valueForCompare==this.setOfCards.get(3).valueForCompare||
            this.setOfCards.get(1).valueForCompare==this.setOfCards.get(4).valueForCompare)
            quadCounter++;
        for (int i=0; i<this.setOfCards.size()-1; i++){
         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare+1)
             straightCounter++;

         if(setOfCards.get(i).getSuit().equals(setOfCards.get(i+1).getSuit()))
             flushCounter++;

         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare+1
            && setOfCards.get(i).getSuit().equals(setOfCards.get(i+1).getSuit()))
                straightflushCounter++;
        }

         if(straightflushCounter==5)  {currentHandWeight.setValue(StraightFlush);kickerCounter++;}
         if(straightCounter==5)  {currentHandWeight.setValue(Straight);kickerCounter++;}
         if(flushCounter==5)  {currentHandWeight.setValue(Flush);kickerCounter++;}
         if (pairCounter==1) {currentHandWeight.setValue(Pair);kickerCounter++;}
         if (setCounter==1) {currentHandWeight.setValue(Set);kickerCounter++;}
         if (quadCounter==1) {currentHandWeight.setValue(Quad);kickerCounter++;}
         if (pairTwoCounter==1) {currentHandWeight.setValue(TwoPairs);kickerCounter++;}
         if (fullhouseCounter==1) {currentHandWeight.setValue(FullHouse);kickerCounter++;}
         if(kickerCounter==8) currentHandWeight.setValue(Kicker);

        return currentHandWeight;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "setOfCards=" + setOfCards +
                '}';
    }
}
