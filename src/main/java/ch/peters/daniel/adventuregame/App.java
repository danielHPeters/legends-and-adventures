package ch.peters.daniel.adventuregame;

import com.jfoenix.controls.JFXDecorator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main JavaFX application class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class App extends Application {
  public String getGreeting() {
    return "Hello world.";
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    var loader = new FXMLLoader(getClass().getResource("/screen_main.fxml"));
    var root = loader.<Parent>load();
    var decorator = new JFXDecorator(primaryStage, root);

    decorator.setCustomMaximize(true);
    primaryStage.setTitle("Adventure Game");
    primaryStage.setScene(new Scene(decorator, 600, 600));
    primaryStage.show();
  }

  /**
   * Main method.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }
}
