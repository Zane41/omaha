package zane41.omaha.classes;

import java.util.ArrayList;

import static zane41.omaha.classes.ValuesOfHands.*;

public class Hand  {

    public ArrayList<Card> setOfCards = new ArrayList<>();

    public ValueOfAHand calcWeight (){
        ValueOfAHand currentHandWeight = new ValueOfAHand();

        int flushCounter=1, pairCounter=0, setCounter=0, straightCounter=1,
            quadCounter=0, fullhouseCounter=0, straightflushCounter=1, pairTwoCounter=0, kickerCounter=0;

        pairCounter = getPairCounter(pairCounter);
        pairTwoCounter = getPairTwoCounter(pairTwoCounter);
        fullhouseCounter = getFullhouseCounter(fullhouseCounter);
        setCounter = getSetCounter(setCounter);
        quadCounter = getQuadCounter(quadCounter);
        straightCounter = getStraightCounter(straightCounter);
        flushCounter = getFlushCounter(flushCounter);
        straightflushCounter = getStraightflushCounter(straightflushCounter);

        calcWeight(pairCounter, currentHandWeight, kickerCounter, pairTwoCounter, setCounter, straightCounter, flushCounter, fullhouseCounter, quadCounter, straightflushCounter);

        return currentHandWeight;
    }

    private void calcWeight(int pairCounter, ValueOfAHand currentHandWeight, int kickerCounter, int pairTwoCounter, int setCounter, int straightCounter, int flushCounter, int fullhouseCounter, int quadCounter, int straightflushCounter) {
        if (pairCounter ==1) currentHandWeight.setValue(Pair);else kickerCounter++;
        if (pairTwoCounter ==1) currentHandWeight.setValue(TwoPairs);else kickerCounter++;
        if (setCounter ==1) currentHandWeight.setValue(Set);else kickerCounter++;
        if(straightCounter ==5)  currentHandWeight.setValue(Straight);else kickerCounter++;
        if(flushCounter ==5)  currentHandWeight.setValue(Flush);else kickerCounter++;
        if (fullhouseCounter ==1) currentHandWeight.setValue(FullHouse);else kickerCounter++;
        if (quadCounter ==1) currentHandWeight.setValue(Quad);else kickerCounter++;
        if(straightflushCounter ==5)  currentHandWeight.setValue(StraightFlush);else kickerCounter++;
        if(kickerCounter ==8) currentHandWeight.setValue(Kicker);
    }

    private int getStraightflushCounter(int straightflushCounter) {
        int temp =0;
        for (int i=0; i<this.setOfCards.size()-1; i++){
            if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare+1
                    && setOfCards.get(i).getSuit().equals(setOfCards.get(i+1).getSuit()))
                straightflushCounter++;
        }
        if(this.setOfCards.get(0).valueForCompare==2&&
           this.setOfCards.get(1).valueForCompare==3&&
           this.setOfCards.get(2).valueForCompare==4&&
           this.setOfCards.get(3).valueForCompare==5&&
           this.setOfCards.get(4).valueForCompare==14){
                for (int i = 0; i < setOfCards.size()-1; i++) {
                     if(setOfCards.get(i).getSuit().equals(setOfCards.get(i+1).getSuit()))
                    temp++;
            }
                if (temp==4)
            straightflushCounter=5;
        }
        return straightflushCounter;
    }

    private int getFlushCounter(int flushCounter) {
        for (int i=0; i<this.setOfCards.size()-1; i++){
            if(setOfCards.get(i).getSuit().equals(setOfCards.get(i+1).getSuit()))
                flushCounter++;
        }
        return flushCounter;
    }

    private int getStraightCounter(int straightCounter) {
        for (int i=0; i<this.setOfCards.size()-1; i++){
         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare+1)
             straightCounter++;
        }
        if(this.setOfCards.get(0).valueForCompare==2&&
           this.setOfCards.get(1).valueForCompare==3&&
           this.setOfCards.get(2).valueForCompare==4&&
           this.setOfCards.get(3).valueForCompare==5&&
           this.setOfCards.get(4).valueForCompare==14)
            straightCounter++;
        return straightCounter;
    }

    private int getQuadCounter(int quadCounter) {
        if(this.setOfCards.get(0).valueForCompare==this.setOfCards.get(3).valueForCompare||
            this.setOfCards.get(1).valueForCompare==this.setOfCards.get(4).valueForCompare)
            quadCounter++;
        return quadCounter;
    }

    private int getSetCounter(int setCounter) {
        if(this.setOfCards.get(0).valueForCompare==this.setOfCards.get(2).valueForCompare||
            this.setOfCards.get(1).valueForCompare==this.setOfCards.get(3).valueForCompare||
            this.setOfCards.get(2).valueForCompare==this.setOfCards.get(4).valueForCompare)
            setCounter++;
        return setCounter;
    }

    private int getFullhouseCounter(int fullhouseCounter) {
        if(this.setOfCards.get(0).valueForCompare==this.setOfCards.get(1).valueForCompare
            && this.setOfCards.get(2).valueForCompare==this.setOfCards.get(4).valueForCompare
            || this.setOfCards.get(0).valueForCompare==this.setOfCards.get(2).valueForCompare
            && this.setOfCards.get(3).valueForCompare==this.setOfCards.get(4).valueForCompare)
                fullhouseCounter++;
        return fullhouseCounter;
    }

    private int getPairTwoCounter(int pairTwoCounter) {
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
        return pairTwoCounter;
    }

    private int getPairCounter(int pairCounter) {
        if(this.setOfCards.get(0).valueForCompare==this.setOfCards.get(1).valueForCompare
           && this.setOfCards.get(0).valueForCompare!=this.setOfCards.get(2).valueForCompare
           && this.setOfCards.get(0).valueForCompare!=this.setOfCards.get(3).valueForCompare
           && this.setOfCards.get(0).valueForCompare!=this.setOfCards.get(4).valueForCompare     ||

           this.setOfCards.get(0).valueForCompare!=this.setOfCards.get(1).valueForCompare
           &&this.setOfCards.get(1).valueForCompare==this.setOfCards.get(2).valueForCompare
           && this.setOfCards.get(1).valueForCompare!=this.setOfCards.get(3).valueForCompare
           && this.setOfCards.get(1).valueForCompare!=this.setOfCards.get(4).valueForCompare    ||

           this.setOfCards.get(2).valueForCompare==this.setOfCards.get(3).valueForCompare
           && this.setOfCards.get(3).valueForCompare!=this.setOfCards.get(4).valueForCompare
           && this.setOfCards.get(3).valueForCompare!=this.setOfCards.get(1).valueForCompare
           && this.setOfCards.get(3).valueForCompare!=this.setOfCards.get(0).valueForCompare    ||

           this.setOfCards.get(3).valueForCompare==this.setOfCards.get(4).valueForCompare
           && this.setOfCards.get(3).valueForCompare!=this.setOfCards.get(0).valueForCompare
           && this.setOfCards.get(3).valueForCompare!=this.setOfCards.get(1).valueForCompare
           && this.setOfCards.get(3).valueForCompare!=this.setOfCards.get(2).valueForCompare)
             pairCounter++;
        return pairCounter;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "setOfCards=" + setOfCards +
                '}';
    }
}
