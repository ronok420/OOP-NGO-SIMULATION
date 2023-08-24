/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ngo.simulation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ISLAM
 */
public class SignupfinalController implements Initializable {

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gobackbuttononclick(ActionEvent event) {
         try {
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("primaryscene.fxml"));
    Parent signupParent = loader.load();
    Scene signupScene = new Scene(signupParent);
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(signupScene);
    stage.setTitle("primaryscene");
} catch (IOException e) {
   
    e.printStackTrace();
}
    }
    
}
