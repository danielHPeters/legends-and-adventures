package ch.peters.daniel.adventuregame.gui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class MainScreenController implements Initializable {
  @FXML
  protected void locateFile(ActionEvent event) {
    var menuItem = (MenuItem) event.getSource();
    var node = menuItem.getParentPopup();
    var chooser = new FileChooser();

    chooser.setTitle("Open File");
    var file = chooser.showOpenDialog(node.getScene().getWindow());
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }

  @FXML
  protected void closeApplication() {
    Platform.exit();
  }
}
