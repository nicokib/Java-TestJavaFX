import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Charge le fichier FXML créé avec Scene Builder
        Parent root = FXMLLoader.load(getClass().getResource("frmPassword.fxml"));

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Mon Application avec Scene Builder");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}