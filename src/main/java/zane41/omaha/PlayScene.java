package zane41.omaha;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;


import static zane41.omaha.HelloController.yourHand;


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

    public void onTakeUrCardsClick ()  {
        playerHandCard1.setImage(yourHand.setOfCards.getFirst().getImage());
        playerHandCard2.setImage(yourHand.setOfCards.get(1).getImage());
        playerHandCard3.setImage(yourHand.setOfCards.get(2).getImage());
        playerHandCard4.setImage(yourHand.setOfCards.get(3).getImage());
        playerHandCard5.setImage(yourHand.setOfCards.get(4).getImage());
        TakeUrCards.setVisible(false); YourHand.setVisible(true); ChangeBar.setVisible(true);ChangeCards.setVisible(true);
    }

    public  PlayScene()  {
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
