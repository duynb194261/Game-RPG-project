package tryagain;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class maini extends Application {

    public static void main(String[] args) {
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass ().getResource ("hihi.fxml"));
        } catch (IOException e) {
            e.printStackTrace ();
        }
        Scene scene = new Scene (root);
        primaryStage.setScene (scene);
        primaryStage.show ();
    }
}
