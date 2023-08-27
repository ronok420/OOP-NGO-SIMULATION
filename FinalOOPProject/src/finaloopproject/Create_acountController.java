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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usnot
 */
public class Create_acountController implements Initializable {

    @FXML
    private TextField idfxid;
    @FXML
    private TextField passwordfxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createAcountOnaction(ActionEvent event) {
    }

    @FXML
    private void backbuttonOnaction(ActionEvent event) throws IOException {
        
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }
    
}
