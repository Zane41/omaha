package zane41.omaha;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import zane41.omaha.classes.Card;
import zane41.omaha.classes.Deck;
import zane41.omaha.classes.Discard;
import zane41.omaha.classes.Hand;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    Button startButton;
    @FXML
    protected Label startMsg;


    public static Discard currentDiscard = new Discard();
    public static Hand yourHand = new Hand();
    public static Hand opponentsHand = new Hand();
    public static Deck currentDeck = new Deck();
    @FXML
    public void onStartButtonClick() throws IOException {

        currentDeck.fillDeck();
        currentDeck.shuffleDeck();
        currentDeck.fillPlayersHand(yourHand, opponentsHand);
        System.out.println(yourHand);
        yourHand.setOfCards.sort(Comparator.comparing(Card::getValueForCompare));
        System.out.println(yourHand);
        opponentsHand.setOfCards.sort(Comparator.comparing(Card::getValueForCompare));
        goToPlayScene(new ActionEvent());
    }


    public void goToPlayScene(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PlayScene.class.getResource("playScene.fxml"));
            Stage stage = (Stage) startButton.getScene().getWindow();
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