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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ISLAM
 */
public class PrimarysceneController implements Initializable {

    @FXML
    private ComboBox<String> groupcombobox;
    @FXML
    private Button signupbutton;
    @FXML
    private Button loginbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           groupcombobox.getItems().addAll("NGO Admin","Volunter");
           groupcombobox.setValue("NGO Admin");
    }    

    @FXML
    private void signupbuttononclick(ActionEvent event) {
        try {
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Signup.fxml"));
    Parent signupParent = loader.load();
    Scene signupScene = new Scene(signupParent);
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(signupScene);
    stage.setTitle("Signup");
} catch (IOException e) {
   
    e.printStackTrace();
}

   
    
    }

    @FXML
    private void loginbuttononclick(ActionEvent event) {
        try {
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Ngoadmin.fxml"));
    Parent signupParent = loader.load();
    Scene signupScene = new Scene(signupParent);
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(signupScene);
    stage.setTitle("NGOadmin");
} catch (IOException e) {
   
    e.printStackTrace();
}
        
    }
}
