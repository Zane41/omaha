package zane41.omaha;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PlayScene {

    @FXML
    protected Label YourHand;
    @FXML
    protected Label OpponentHand;

    public void startThisScene (){
    OpponentHand.setText("Opponents Hand");
        YourHand.setText("Your Hand");
    }
}
