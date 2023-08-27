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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author KING
 */
public class ResearcherController implements Initializable {

    @FXML
    private Button aboutfxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void aboutPageONclick(ActionEvent event) throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("About.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }

    @FXML
    private void contactSceneOnclick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Contact.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }

    @FXML
    private void blogeSceneOnclick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Blog.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }

    @FXML
    private void surveyOnclick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Sarvay.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }

    @FXML
    private void repoartSceneOnclick(ActionEvent event) throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Report.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }

    @FXML
    private void researchSceneOnCLick(ActionEvent event) throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("ResearchPaper.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }

    @FXML
    private void logoutbutttonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("SignIn.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }
    
}
