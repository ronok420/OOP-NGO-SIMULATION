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
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class BeneficiaryDashboardSceneController implements Initializable {

    private BorderPane beneficiaryDashboardPane;
    SceneLoader newSceneOpener = new SceneLoader();
    @FXML
    private BorderPane beneficiaryDashboard;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void humanRightsMenuItemOnClick(ActionEvent event) {
         beneficiaryDashboardPane.setCenter(newSceneOpener.getSceneRoot("HumanRightsScene.fxml"));
    }

    @FXML
    private void childProtectionAndWalfereMenuItemOnClick(ActionEvent event) {
         beneficiaryDashboardPane.setCenter(newSceneOpener.getSceneRoot("ChildProtectionAndWelfareScene.fxml"));
    }

    @FXML
    private void educationMenuItemOnClick(ActionEvent event) {
         beneficiaryDashboardPane.setCenter(newSceneOpener.getSceneRoot("EducationScene.fxml"));
    }

    @FXML
    private void migrationMenuItemOnClick(ActionEvent event) {
         beneficiaryDashboardPane.setCenter(newSceneOpener.getSceneRoot("MigrationSupportScene.fxml"));
    }

    @FXML
    private void cultureMenuItemOnClick(ActionEvent event) {
         beneficiaryDashboardPane.setCenter(newSceneOpener.getSceneRoot("CultureScene.fxml"));
    }

    @FXML
    private void cleanEnergyMenuItemOnClick(ActionEvent event) {
         beneficiaryDashboardPane.setCenter(newSceneOpener.getSceneRoot("CleanEnergyScene.fxml"));
    }

    @FXML
    private void environmentMenuItemOnClick(ActionEvent event) {
         beneficiaryDashboardPane.setCenter(newSceneOpener.getSceneRoot("EnvironmentalSustainabilityScene.fxml"));
    }

    @FXML
    private void economicEmpowermentMenuItemOnClick(ActionEvent event) {
         beneficiaryDashboardPane.setCenter(newSceneOpener.getSceneRoot("EconomicEmpowermentScene.fxml"));
    }
    
}
