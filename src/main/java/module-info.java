module zane41.omaha {
    requires javafx.controls;
    requires javafx.fxml;


    opens zane41.omaha to javafx.fxml;
    exports zane41.omaha;
}