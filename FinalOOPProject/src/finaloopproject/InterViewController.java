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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author usnot
 */
public class InterViewController implements Initializable {

    @FXML
    private TextField interviewfxid;
    @FXML
    private TextField descriptionfxid;
    @FXML
    private DatePicker datefxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void conpleteinterviewOnAction(ActionEvent event) {
    }

    @FXML
    private void backbutton(ActionEvent event) {
    }
    
}
