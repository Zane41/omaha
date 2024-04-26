package zane41.omaha;



import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.stage.Stage;
import zane41.omaha.classes.Deck;
import zane41.omaha.classes.Discard;
import zane41.omaha.classes.Hand;

import static zane41.omaha.HelloController.yourHand;

public class PlayScene  {

    @FXML
    protected Label YourHand;
    @FXML
    protected Label OpponentHand;
    @FXML
    protected ToggleButton chooseCard1;
    @FXML
    protected ToggleButton chooseCard2;
    @FXML
    protected ToggleButton chooseCard3;
    @FXML
    protected ToggleButton chooseCard4;
    @FXML
    protected ToggleButton chooseCard5;
    @FXML
    protected ImageView playerHandCard1;
    @FXML
    protected ImageView playerHandCard2;
    @FXML
    protected ImageView playerHandCard3;
    @FXML
    protected ImageView playerHandCard4;
    @FXML
    protected ImageView playerHandCard5;

    public void setImagesIntoScene (Hand currentHand) {
        playerHandCard1.setImage(new Image(String.valueOf(currentHand.setOfCards.getFirst().getImage())));
        playerHandCard2.setImage(new Image(String.valueOf(currentHand.setOfCards.get(1).getImage())));
        playerHandCard3.setImage(new Image(String.valueOf(currentHand.setOfCards.get(2).getImage())));
        playerHandCard4.setImage(new Image(String.valueOf(currentHand.setOfCards.get(3).getImage())));
        playerHandCard5.setImage(new Image(String.valueOf(currentHand.setOfCards.get(4).getImage())));
    }


    public  PlayScene() throws Exception {

    }
}
