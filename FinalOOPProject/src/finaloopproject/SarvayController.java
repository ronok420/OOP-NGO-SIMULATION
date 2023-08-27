/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package finaloopproject;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usnot
 */
public class SarvayController implements Initializable {

    @FXML
    private TextField projectNamefid;
    @FXML
    private TextField servaryDetaiksFzid;
    @FXML
    private DatePicker survaryDateFxid;
    @FXML
    private TextField idfxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitSurvaryOnclick(ActionEvent event) {
        
     
  
    String proID = idfxid.getText();
        String proName = projectNamefid.getText();
        String proDetails = servaryDetaiksFzid.getText();
           LocalDate survaryDate = survaryDateFxid.getValue(); // Assign a variable name

        // Assuming addProject method takes String, String, String, LocalDate as parameters
        boolean addStatus = Researcher.addProject(proID, proName, proDetails, survaryDate);

        if (addStatus) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Project is added successfully.");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Oops! Something went wrong. Try later...");
            a.showAndWait();
        }
        
    }

    @FXML
    private void backcutton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Researcher.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }
    
}
