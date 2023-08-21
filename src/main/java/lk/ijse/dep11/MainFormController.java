package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainFormController {
    public MenuItem mnItemUserGuide;
    public MenuItem mnItemAboutUs;

    public void mnItemUserGuideOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane userGRoot = FXMLLoader.load(getClass().getResource("/view/UserGuide.fxml"));
        Scene UserGuide = new Scene(userGRoot);
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());
        stage.setScene(UserGuide);
        stage.setTitle("User Guide");
        stage.show();
    }

    public void mnItemAboutUsOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane aboutURoot = FXMLLoader.load(getClass().getResource("/view/AboutUs.fxml"));
        Scene UserGuide = new Scene(aboutURoot);
        Stage stage = new Stage();
        stage.setScene(UserGuide);
        stage.setTitle("About Us");
        stage.show();
    }
}
