package adventuregame.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author d.peters
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainScreen.fxml"));
        
        Parent root = loader.load();
        
        primaryStage.setTitle("Adventure Game");
        primaryStage.setScene(new Scene(root, 600, 600));
        
        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);
    }
    
    
}
