package zane41.omaha;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import zane41.omaha.classes.Card;
import zane41.omaha.classes.ValuesOfHands;
import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;
import static zane41.omaha.HelloController.*;
import static zane41.omaha.classes.Hand.opponentsHandWeight;
import static zane41.omaha.classes.Hand.yoursHandWeight;

public class ResultScene implements Initializable {

    @FXML
    Button newGameBtn;
    @FXML
    protected  Label winsCounter;
    @FXML
    protected   Label losesCounter;
    @FXML
    protected  Label youWin;
    @FXML
    protected  Label youLose;
    @FXML
    protected  Label Draw;





    public  ResultScene(){
    }

    @FXML
    public  void setResults (){

        if (yoursHandWeight.compareTo(opponentsHandWeight)<0) youLoseNT();
        if (yoursHandWeight.compareTo(opponentsHandWeight) > 0)youWinGG();
        if (yoursHandWeight.compareTo(opponentsHandWeight)==0) calcIfDraw();
    }
    @FXML
    private void youLoseNT() {
            youLose.setVisible(true);
            loseCounter1111++;
            losesCounter.setText(String.valueOf(loseCounter1111));
    }
    @FXML
    private  void youWinGG() {
            youWin.setVisible(true);
            winCounter111++;
            winsCounter.setText(String.valueOf(winCounter111));
    }
    @FXML
    private  void calcIfDraw() {
       int calcDraw = 0;
        if(calcIfDrawSF()==1)  youWinGG();
        if(calcIfDrawSF()==-1)  youLoseNT();
        if(calcIfDrawSF()==0) calcDraw++;
        if(calcIfDrawQuad()==1)  youWinGG();
        if(calcIfDrawQuad()==-1)  youLoseNT();
        if(calcIfDrawFH()==1)  youWinGG();
        if(calcIfDrawFH()==-1)  youLoseNT();
        if(calcIfDrawFl()==1)  youWinGG();
        if(calcIfDrawFl()==-1)  youLoseNT();
        if(calcIfDrawFl()==0) calcDraw++;
        if(calcIfDrawStr()==1)  youWinGG();
        if(calcIfDrawStr()==-1)  youLoseNT();
        if(calcIfDrawStr()==0) calcDraw++;
        if(calcIfDrawSet()==1)  youWinGG();
        if(calcIfDrawSet()==-1)  youLoseNT();
        if(calcIfDraw2P()==1)  youWinGG();
        if(calcIfDraw2P()==-1)  youLoseNT();
        if(calcIfDraw2P()==0) calcDraw++;
        if(calcIfDrawP()==1)  youWinGG();
        if(calcIfDrawP()==-1)  youLoseNT();
        if(calcIfDrawP()==0) calcDraw++;
        if(calcIfDrawHC()==1)  youWinGG();
        if(calcIfDrawHC()==-1)  youLoseNT();
        if(calcIfDrawHC()==0) calcDraw++;
        if (calcDraw==6) Draw.setVisible(true);
    }

    private  int calcIfDrawHC() {
        int temp=0;
        if (yoursHandWeight.getValue().equals(ValuesOfHands.Kicker)&&opponentsHandWeight.getValue().equals(ValuesOfHands.Kicker)) {
            for (int i = 4; i > 0; i--) {
                if (yourHand.setOfCards.get(i).getValueForCompare() > opponentsHand.setOfCards.get(i).getValueForCompare()) {
                    temp = 1;
                    break;
                }
                if (yourHand.setOfCards.get(i).getValueForCompare() < opponentsHand.setOfCards.get(i).getValueForCompare()) {
                    temp = -1;
                    break;
                }
            }
        }
        return temp;
    }

    private  int calcIfDrawP() {
        int tempToReturn=0, temp4Your=0, temp4Opp=0;
        if (yoursHandWeight.getValue().equals(ValuesOfHands.Pair)&&opponentsHandWeight.getValue().equals(ValuesOfHands.Pair)){
            for (int i = 0; i < yourHand.setOfCards.size()-1; i++) {
                if (yourHand.setOfCards.get(i).getValueForCompare()==yourHand.setOfCards.get(i+1).getValueForCompare())
                    temp4Your = yourHand.setOfCards.get(i).getValueForCompare();
            }
            for (int i = 0; i < opponentsHand.setOfCards.size()-1; i++) {
                if (opponentsHand.setOfCards.get(i).getValueForCompare()==opponentsHand.setOfCards.get(i+1).getValueForCompare())
                    temp4Opp = opponentsHand.setOfCards.get(i).getValueForCompare();
            }
        if (temp4Your>temp4Opp) tempToReturn=1;
        if (temp4Your<temp4Opp) tempToReturn=-1;
        }
        return tempToReturn;
    }

    private  int calcIfDraw2P() {
        int temp =0;
        return temp;
    }

    private int calcIfDrawSet() {
        int temp=0;
        if (yoursHandWeight.getValue().equals(ValuesOfHands.Set)&&opponentsHandWeight.getValue().equals(ValuesOfHands.Set)) {

            if (yourHand.setOfCards.get(2).getValueForCompare() > opponentsHand.setOfCards.get(2).getValueForCompare()) {
                temp = 1;
            }
            if (yourHand.setOfCards.get(2).getValueForCompare() < opponentsHand.setOfCards.get(2).getValueForCompare()) {
                temp = -1;
            }
        }
        return temp;
    }

    private  int calcIfDrawStr() {
        int temp=0;
        if (yoursHandWeight.getValue().equals(ValuesOfHands.Straight)&&opponentsHandWeight.getValue().equals(ValuesOfHands.Straight)) {
            if (yourHand.setOfCards.get(4).getValueForCompare() > opponentsHand.setOfCards.get(4).getValueForCompare() ||
                    opponentsHand.setOfCards.get(4).getValueForCompare() == 14 && yourHand.setOfCards.get(4).getValueForCompare() == 14)
                temp = 1;
            if (yourHand.setOfCards.get(4).getValueForCompare() < opponentsHand.setOfCards.get(4).getValueForCompare() ||
                    yourHand.setOfCards.get(4).getValueForCompare() == 14 && opponentsHand.setOfCards.get(4).getValueForCompare() != 14)
                temp = -1;
        }
        return temp;
    }

    private  int calcIfDrawFl() {
        int temp=0;
        if (yoursHandWeight.getValue().equals(ValuesOfHands.Flush)&&opponentsHandWeight.getValue().equals(ValuesOfHands.Flush)) {
            for (int i = 4; i > 0; i--) {
                if (yourHand.setOfCards.get(i).getValueForCompare() > opponentsHand.setOfCards.get(i).getValueForCompare()) {
                    temp = 1;
                    break;
                }
                if (yourHand.setOfCards.get(i).getValueForCompare() < opponentsHand.setOfCards.get(i).getValueForCompare()) {
                    temp = -1;
                    break;
                }
            }
        }
        return temp;
    }

    private  int calcIfDrawFH() {
        int temp=0;
        if (yoursHandWeight.getValue().equals(ValuesOfHands.FullHouse)&&opponentsHandWeight.getValue().equals(ValuesOfHands.FullHouse)){

            if(yourHand.setOfCards.get(2).getValueForCompare()>opponentsHand.setOfCards.get(2).getValueForCompare()) {
                temp = 1;
            }
        if(yourHand.setOfCards.get(2).getValueForCompare()<opponentsHand.setOfCards.get(2).getValueForCompare()) {
            temp = -1;
        }
        }
        return temp;
    }

    private  int calcIfDrawQuad() {
        int temp=0;
        if (yoursHandWeight.getValue().equals(ValuesOfHands.Quad)&&opponentsHandWeight.getValue().equals(ValuesOfHands.Quad)) {

            if (yourHand.setOfCards.get(2).getValueForCompare() > opponentsHand.setOfCards.get(2).getValueForCompare()) {
                temp = 1;
            }
            if (yourHand.setOfCards.get(2).getValueForCompare() < opponentsHand.setOfCards.get(2).getValueForCompare()) {
                temp = -1;
            }
        }
        return temp;
    }

    private  int calcIfDrawSF() {
        int temp=0;
        if (yoursHandWeight.getValue().equals(ValuesOfHands.StraightFlush)&&opponentsHandWeight.getValue().equals(ValuesOfHands.StraightFlush)) {
            if (yourHand.setOfCards.get(4).getValueForCompare() > opponentsHand.setOfCards.get(4).getValueForCompare() ||
                    opponentsHand.setOfCards.get(4).getValueForCompare() == 14 && yourHand.setOfCards.get(4).getValueForCompare() == 14)
                temp = 1;
            if (yourHand.setOfCards.get(4).getValueForCompare() < opponentsHand.setOfCards.get(4).getValueForCompare() ||
                    yourHand.setOfCards.get(4).getValueForCompare() == 14 && opponentsHand.setOfCards.get(4).getValueForCompare() != 14)
                temp = -1;
        }
        return temp;
    }

    public void onNewGameBtnClick(){
        prepare4New();
        goToPlayScene2();
    }

    public void prepare4New(){
        currentDeck.deck.addAll(currentDiscard.hipeOfCards);
        currentDeck.deck.addAll(opponentsHand.setOfCards);
        currentDeck.deck.addAll(yourHand.setOfCards);
        currentDiscard.hipeOfCards.clear();
        yourHand.setOfCards.clear();
        opponentsHand.setOfCards.clear();
        currentDeck.shuffleDeck();
        currentDeck.fillPlayersHand(yourHand, opponentsHand);
        yourHand.setOfCards.sort(Comparator.comparing(Card::getValueForCompare));
        opponentsHand.setOfCards.sort(Comparator.comparing(Card::getValueForCompare));
    }

    public void goToPlayScene2 (){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PlayScene.class.getResource("playScene.fxml"));
            Stage stage = (Stage) newGameBtn.getScene().getWindow();
            stage.setTitle("Omaha Poker");
            Scene scene = new Scene(fxmlLoader.load(),1300, 840);
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        winsCounter.setText(String.valueOf(winCounter111)); losesCounter.setText(String.valueOf(loseCounter1111));
        setResults ();
    }
}
