package zane41.omaha;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import zane41.omaha.classes.Card;
import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;
import static zane41.omaha.HelloController.*;
import static zane41.omaha.classes.Deck.takeOneCardWhileChange;


public class PlayScene implements Initializable {

    @FXML
    protected Label YourHand;
    @FXML
    protected Label OpponentHand;
    @FXML
     ToggleButton chooseCard1;
    @FXML
     ToggleButton chooseCard2;
    @FXML
     ToggleButton chooseCard3;
    @FXML
     ToggleButton chooseCard4;
    @FXML
     ToggleButton chooseCard5;
    @FXML
    ImageView playerHandCard1;
    @FXML
     ImageView playerHandCard2;
    @FXML
     ImageView playerHandCard3;
    @FXML
     ImageView playerHandCard4;
    @FXML
     ImageView playerHandCard5;
    @FXML
    Button TakeUrCards;
    @FXML
    Button ChangeCards;
    @FXML
    ButtonBar ChangeBar;
    @FXML
    Button Showdown;

    public void onTakeUrCardsClick ()  {
        playerHandCard1.setImage(yourHand.setOfCards.getFirst().getImage());
        playerHandCard2.setImage(yourHand.setOfCards.get(1).getImage());
        playerHandCard3.setImage(yourHand.setOfCards.get(2).getImage());
        playerHandCard4.setImage(yourHand.setOfCards.get(3).getImage());
        playerHandCard5.setImage(yourHand.setOfCards.get(4).getImage());
        TakeUrCards.setVisible(false); YourHand.setText("Your hand: "+yourHand.calcWeight());
        YourHand.setVisible(true); ChangeBar.setVisible(true);ChangeCards.setVisible(true);
    }

    public void onChangeCardsClick(){
        int [] array = {0,0,0,0,0};
        if(chooseCard1.isSelected()) array[0] =1;
        if(chooseCard2.isSelected()) array[1] =1;
        if(chooseCard3.isSelected()) array[2] =1;
        if(chooseCard4.isSelected()) array[3] =1;
        if(chooseCard5.isSelected()) array[4] =1;
        for (int i=0; i<array.length; i++) {
            if (array[i] == 1) {
                currentDiscard.hipeOfCards.add(yourHand.setOfCards.get(i));
                yourHand.setOfCards.set(i, takeOneCardWhileChange(yourHand, currentDeck));
            }
        }
        yourHand.setOfCards.sort(Comparator.comparing(Card::getValueForCompare));
        playerHandCard1.setImage(yourHand.setOfCards.getFirst().getImage());
        playerHandCard2.setImage(yourHand.setOfCards.get(1).getImage());
        playerHandCard3.setImage(yourHand.setOfCards.get(2).getImage());
        playerHandCard4.setImage(yourHand.setOfCards.get(3).getImage());
        playerHandCard5.setImage(yourHand.setOfCards.get(4).getImage());
        ChangeCards.setVisible(false);
        YourHand.setText("Your hand: "+yourHand.calcWeight());
        Showdown.setVisible(true);
        ChangeBar.setVisible(false);
    }


    public  PlayScene()  {
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
