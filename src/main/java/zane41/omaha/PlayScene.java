package zane41.omaha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import zane41.omaha.classes.Card;
import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;
import static zane41.omaha.HelloController.*;
import static zane41.omaha.classes.Deck.takeOneCardWhileChange;
import static zane41.omaha.classes.Hand.*;


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
    ImageView opponentCard1;
    @FXML
    ImageView opponentCard2;
    @FXML
    ImageView opponentCard3;
    @FXML
    ImageView opponentCard4;
    @FXML
    ImageView opponentCard5;
    @FXML
    Button TakeUrCards;
    @FXML
    Button ChangeCards;
    @FXML
    ButtonBar ChangeBar;
    @FXML
    Button Showdown;
    @FXML
    Button result;

    public void onTakeUrCardsClick ()  {
        playerHandCard1.setImage(yourHand.setOfCards.getFirst().getImage());
        playerHandCard2.setImage(yourHand.setOfCards.get(1).getImage());
        playerHandCard3.setImage(yourHand.setOfCards.get(2).getImage());
        playerHandCard4.setImage(yourHand.setOfCards.get(3).getImage());
        playerHandCard5.setImage(yourHand.setOfCards.get(4).getImage());
        TakeUrCards.setVisible(false); OpponentHand.setVisible(true);
        YourHand.setVisible(true);  YourHand.setText("Your hand: "+yourHand.calcWeight(yoursHandWeight).getValue().getTitle());
        ChangeBar.setVisible(true); ChangeCards.setVisible(true);
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
        YourHand.setText("Your hand: "+yourHand.calcWeight(yoursHandWeight).getValue().getTitle());
        Showdown.setVisible(true);
        ChangeBar.setVisible(false);
    }

    public void onShowdownClck(){
        opponentCard1.setImage(opponentsHand.setOfCards.getFirst().getImage());
        opponentCard2.setImage(opponentsHand.setOfCards.get(1).getImage());
        opponentCard3.setImage(opponentsHand.setOfCards.get(2).getImage());
        opponentCard4.setImage(opponentsHand.setOfCards.get(3).getImage());
        opponentCard5.setImage(opponentsHand.setOfCards.get(4).getImage());
        OpponentHand.setText("Opponents hand: "+opponentsHand.calcWeight(opponentsHandWeight).getValue().getTitle());
        Showdown.setVisible(false); result.setVisible(true);
    }

    public void onResultclick(){
        goToResultScene(new ActionEvent());
    }

    public void goToResultScene(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PlayScene.class.getResource("resultScene.fxml"));
            Stage stage = (Stage) result.getScene().getWindow();
            stage.setTitle("Omaha Poker");
            Scene scene = new Scene(fxmlLoader.load(),1300, 840);
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  PlayScene()  {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
