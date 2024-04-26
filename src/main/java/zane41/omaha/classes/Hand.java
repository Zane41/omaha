package zane41.omaha.classes;

import java.util.ArrayList;

public class Hand  {

    ArrayList<Card> setOfCards = new ArrayList<>();



    public void discardACard (Card card){
        this.setOfCards.remove(card);
    }


    public ValueOfAHand calcWeight (){
        ValueOfAHand currentHandWeight;
        //переменные для подсчета комбинации
        int flushCounter=0, pairCounter=0, setCounter=0, pair2Counter=0, kickerCounter = 1, straightCounter=0,
            quadCounter=0, fullhouseCounter=0, straightflushCounter=0;

        for (int i =0; i< this.setOfCards.size(); i++){
         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare&&pairCounter!=1)
             pairCounter++;
         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare&&pairCounter==1) {
             setCounter++; pairCounter=0;}
         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare&&setCounter==1) {
             quadCounter++;setCounter=0;}

         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare+1)
             straightCounter++;
         if(setOfCards.get(i).getSuit().equals(setOfCards.get(i+1).getSuit()))
             flushCounter++;
         if(setOfCards.get(i).valueForCompare==setOfCards.get(i+1).valueForCompare+1
            && setOfCards.get(i).getSuit().equals(setOfCards.get(i+1).getSuit()))
                straightflushCounter++;

        }
    return currentHandWeight}
}
