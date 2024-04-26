package zane41.omaha;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import zane41.omaha.classes.Deck;
import zane41.omaha.classes.Hand;

public class HelloController {

    @FXML
    Button startButton;
    @FXML
    protected Label startMsg;

    @FXML
    protected void onStartButtonClick() {

        Hand yourHand = new Hand();
        Hand opponentsHand = new Hand();
        Deck currentDeck = new Deck();
        currentDeck.shuffleDeck();
        currentDeck.fillPlayersHand(yourHand, opponentsHand);
        startMsg.setText(null);
    }
}