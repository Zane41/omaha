package zane41.omaha;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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


    @FXML
    public void setPictures (Hand currentHand) {
        Image im1 = new Image(String.valueOf(currentHand.setOfCards.getFirst().getImage()));
        Image im2 = new Image(String.valueOf(currentHand.setOfCards.getFirst().getImage()));
        Image im3 = new Image(String.valueOf(currentHand.setOfCards.getFirst().getImage()));
        Image im4 = new Image(String.valueOf(currentHand.setOfCards.getFirst().getImage()));
        Image im5 = new Image(String.valueOf(currentHand.setOfCards.getFirst().getImage()));
        playerHandCard1.setImage(im1);
        playerHandCard2.setImage(im2);
        playerHandCard3.setImage(im3);
        playerHandCard4.setImage(im4);
        playerHandCard5.setImage(im5);
    }

    public  PlayScene() {
        Image im1 = yourHand.setOfCards.getFirst().getImage();
        playerHandCard1.setImage(im1);
    }
}
