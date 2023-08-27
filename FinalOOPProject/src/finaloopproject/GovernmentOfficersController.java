/*-*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package finaloopproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class GovernmentOfficersController implements Initializable {

    @FXML
    private BorderPane governmentOfficersBorderPane;
    SceneLoader newSceneOpener = new SceneLoader();

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fundingAndGrantsMenuItemOnClick(ActionEvent event) {
       governmentOfficersBorderPane.setCenter(newSceneOpener.getSceneRoot("FundingAndGrantsScene.fxml"));
    }

    @FXML
    private void adovocacyAndSupportMenuItemOnClick(ActionEvent event) {
        governmentOfficersBorderPane.setCenter(newSceneOpener.getSceneRoot("AdvocacyAndSupportScene.fxml"));
    }

    @FXML
    private void collaborationAndPartnershipMenuItemOnClick(ActionEvent event) {
        governmentOfficersBorderPane.setCenter(newSceneOpener.getSceneRoot("CollaborationAndPartnershipScene.fxml"));
    }

    @FXML
    private void capacityBuildingAndTrainnigMenuItemOnClick(ActionEvent event) {
        governmentOfficersBorderPane.setCenter(newSceneOpener.getSceneRoot("CapacityBuildingAndTraining.fxml"));
    }

    @FXML
    private void PolicyAdvisorMenuItemOnClick(ActionEvent event) {
        governmentOfficersBorderPane.setCenter(newSceneOpener.getSceneRoot("PolicyAdvisorScene.fxml"));
    }

    @FXML
    private void monitoringAndEvaluationMenuItemOnClick(ActionEvent event) {
        governmentOfficersBorderPane.setCenter(newSceneOpener.getSceneRoot("MonitoringAndEvaluationScene.fxml"));
    }

    @FXML
    private void tecnicalExpertMenuItemOnClick(ActionEvent event) {
        governmentOfficersBorderPane.setCenter(newSceneOpener.getSceneRoot("TecnicalExpertScene.fxml"));
    }

    @FXML
    private void researchAndDataAnalysisMenuItemOnClick(ActionEvent event) {
        governmentOfficersBorderPane.setCenter(newSceneOpener.getSceneRoot("ResearchAndDataAnalysisScene.fxml"));
    }
    
}
