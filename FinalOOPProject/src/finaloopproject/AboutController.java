/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package finaloopproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usnot
 */
public class AboutController implements Initializable {

    @FXML
    private TextArea statementTextField;
    @FXML
    private TextArea historyTextfield;
    @FXML
    private TableView<?> tableview;
    @FXML
    private TableColumn<?, ?> projectnamecolumn;
    @FXML
    private TableColumn<?, ?> datecolumn;
    @FXML
    private TableColumn<?, ?> aboutColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backbuttonOnclick(ActionEvent event) throws IOException {
        
          Parent scene2Parent = FXMLLoader.load(getClass().getResource("Researcher.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }
    
}
