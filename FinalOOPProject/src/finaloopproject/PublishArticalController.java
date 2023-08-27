/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package finaloopproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author usnot
 */
public class PublishArticalController implements Initializable {

    @FXML
    private TextField articalID;
    @FXML
    private TextField articaltitlefxid;
    @FXML
    private TextField descriptionfxid;
    @FXML
    private TableView<?> ArticalViewTable;
    @FXML
    private TableColumn<?, ?> Articalidcolumn;
    @FXML
    private TableColumn<?, ?> articaltitleColumn;
    @FXML
    private TableColumn<?, ?> descriptioncolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void publishArticalONaction(ActionEvent event) {
    }
    
}
