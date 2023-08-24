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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class SignupController implements Initializable {

    @FXML
    private TextField firstnametextfield;
    @FXML
    private TextField lastnametextfield;
    @FXML
    private TextField usernametextfield;
    @FXML
    private ComboBox<String> rollcombobox;
    @FXML
    private TextField passwordtextfield;
    @FXML
    private TextField emailtextfield;
    @FXML
    private Button signupbutton;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           rollcombobox.getItems().addAll("NGO Admin","Volunter");
           rollcombobox.setValue("NGO Admin");
          
                 
    }    

    @FXML
    private void signupbuttononclick(ActionEvent event) {
    String firstName = firstnametextfield.getText();
    String lastName = lastnametextfield.getText();
    String userName = usernametextfield.getText();
    String role = rollcombobox.getValue();
    String password = passwordtextfield.getText();
    String email = emailtextfield.getText();
   
      
     if (firstName.isEmpty() || lastName.isEmpty() || userName.isEmpty() || password.isEmpty() || email.isEmpty()) {
            showAlert(AlertType.ERROR, "Error", "All fields are required.");
            
           
        }
    
     else if (!Isvalidname(firstName) || !Isvalidname(lastName)) {
            showAlert(AlertType.ERROR, "Error", "Invalid name. Only alphabetic characters and spaces are allowed.");
            
        }

       else if (!Isvalidemail(email)) {
            showAlert(AlertType.ERROR, "Error", "Invalid email format.");
            
            
        }

       else if (! IsvalidPassword(password)) {
            showAlert(AlertType.ERROR, "Error", "Password must be at least 6 characters long.");
           
            
        }
       else{
         try {
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("signupfinal.fxml"));
    Parent signupParent = loader.load();
    Scene signupScene = new Scene(signupParent);
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(signupScene);
    stage.setTitle("Signup");
} 
         catch (IOException e) {
   
    e.printStackTrace();
}
  
    }
    }
    //helper method
    private void showAlert(AlertType alertType, String title, String contentText) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(contentText);
        alert.showAndWait();
        
    }

   
private boolean Isvalidname(String name) {
        return name.matches("[a-zA-Z ]+");
    }

    // Helper method to validate email format
    private boolean Isvalidemail(String email) {
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    // Helper method to validate password length (You can add more complex requirements here)
    private boolean IsvalidPassword(String password) {
        return password.length() >= 6;
    }
   
   
     
    

    
    
}
