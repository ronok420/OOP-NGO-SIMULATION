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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author usnot
 */
public class LoginController implements Initializable {

    @FXML
    private TextField idfxid;
    @FXML
    private TextField passwordfxid;
    @FXML
    private ComboBox<String> typeCOmbobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       typeCOmbobox.getItems().addAll("Beneficiary","Government official","Researcher","Journalist","Admin");
    }    

    @FXML
    private void logInOnaction(ActionEvent event) {
        
         String username = idfxid.getText();
        String password = passwordfxid.getText();
        String userType;
        userType = typeCOmbobox.getValue();
        
        User u = new User() {};
        u.login(username, password, userType, event);

    }

    @FXML
    private void takeMeSignIn(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));

    // Get the current stage from the ActionEvent
    Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

    // Set the root of the current stage's scene to the main scene's root
    currentStage.setScene(new Scene(root));
    }
    
    
}
