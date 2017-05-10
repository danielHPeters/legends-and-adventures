package adventuregame.gui;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author d.peters
 */
public class MainScreenController implements Initializable {

    @FXML
    protected void locateFile(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        ContextMenu node = menuItem.getParentPopup();
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        File file = chooser.showOpenDialog(node.getScene().getWindow());
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    protected void closeApplication() {
        Platform.exit();
    }

}
