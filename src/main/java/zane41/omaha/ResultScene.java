package zane41.omaha;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import zane41.omaha.classes.Card;

import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;

import static zane41.omaha.HelloController.*;

public class ResultScene implements Initializable {



    @FXML
    Button newGameBtn;
    @FXML
    protected Label winsCounter;
    @FXML
    protected   Label losesCounter;
    @FXML
    protected Label youWin;
    @FXML
    protected Label youLose;

    public void setResults (){

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

    }
}
