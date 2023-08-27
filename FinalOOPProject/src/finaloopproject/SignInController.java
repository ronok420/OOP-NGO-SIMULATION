/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package finaloopproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usnot
 */
public class SignInController implements Initializable {

    @FXML
    private TextField idfxid;
    @FXML
    private TextField Passwordfxid;
    @FXML
    private ComboBox<String> typeComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       typeComboBox.getItems().addAll("Beneficiary","Government official","Researcher","Journalist","Admin");
    }    

    @FXML
    private void takeMeLogIn(ActionEvent event) throws IOException {
        
     Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

    // Get the current stage from the ActionEvent
    Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

    // Set the root of the current stage's scene to the main scene's root
    currentStage.setScene(new Scene(root));
        
        
    }

    @FXML
    private void signUpOnAction(ActionEvent event) throws IOException {
        
          String username = idfxid.getText();
    String password = Passwordfxid.getText();
    String userType = typeComboBox.getValue();

    // Validate the user input
    if (username.isEmpty() || password.isEmpty() || userType.isEmpty()) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Sign Up Issue");
        a.setHeaderText("Error");
        a.setContentText("Please enter all of the required fields!");
        a.showAndWait();
        return;
    }

    // Add the new user information to the file
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Login_Info.txt", true))) {
        bw.write(username + "," + password + "," + userType + "\n");
    } catch (IOException e) {
    }

    // Display a success message
    Alert a = new Alert(Alert.AlertType.INFORMATION);
    a.setContentText("You have successfully signed up!");
    a.showAndWait();

    // Clear the text fields
    idfxid.clear();
    Passwordfxid.clear();
      
    }
    
}
