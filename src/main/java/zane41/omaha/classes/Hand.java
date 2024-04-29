package zane41.omaha.classes;

import java.util.ArrayList;

import static zane41.omaha.classes.ValuesOfHands.*;

public class Hand  {

    public ArrayList<Card> setOfCards = new ArrayList<>();



    public void discardACard (Card card){
        this.setOfCards.remove(card);
    }


    public ValueOfAHand calcWeight (){
        ValueOfAHand currentHandWeight;
        //переменные для подсчета комбинации
        int flushCounter=1, tempPairCount=0, pairCounter=0, setCounter=0,  kickerCounter = 1, straightCounter=1,
            quadCounter=0, fullhouseCounter=0, straightflushCounter=1;

        for (int i =0; i< this.setOfCards.size(); i++){
         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare
            && setOfCards.get(i).valueForCompare!=setOfCards.get(i+2).valueForCompare) {
              pairCounter++;
         }

         if(setOfCards.get(0).valueForCompare==setOfCards.get(1).valueForCompare
            && setOfCards.get(2).valueForCompare==setOfCards.get(4).valueForCompare
            || setOfCards.get(0).valueForCompare==setOfCards.get(2).valueForCompare
            && setOfCards.get(3).valueForCompare==setOfCards.get(4).valueForCompare)
                {fullhouseCounter++; break;}

         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+2).valueForCompare)
            {setCounter++; break;}

         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+3).valueForCompare)
            {quadCounter++; break;}

         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare+1)
             straightCounter++;

         if(setOfCards.get(i).getSuit().equals(setOfCards.get(i+1).getSuit()))
             flushCounter++;

         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare+1
            && setOfCards.get(i).getSuit().equals(setOfCards.get(i+1).getSuit()))
                straightflushCounter++;
        }
         if(straightflushCounter==5)  currentHandWeight= new ValueOfAHand(StraightFlush);
         if(straightCounter==5)  currentHandWeight= new ValueOfAHand(Straight);
         if(flushCounter==5)  currentHandWeight= new ValueOfAHand(Flush);
         if (pairCounter==1) currentHandWeight= new ValueOfAHand(Pair);
         if (setCounter==1 && pairCounter!=1) currentHandWeight= new ValueOfAHand(Set);
         if (quadCounter==1) currentHandWeight= new ValueOfAHand(Quad);
         if (pairCounter==2) currentHandWeight= new ValueOfAHand(TwoPairs);
         if (fullhouseCounter==1) currentHandWeight= new ValueOfAHand(FullHouse);
         else currentHandWeight= new ValueOfAHand(Kicker);

        return currentHandWeight;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "setOfCards=" + setOfCards +
                '}';
    }
}
