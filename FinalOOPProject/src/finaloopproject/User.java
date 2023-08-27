/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaloopproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author usnot
 */
public class  User {
    
      protected String username;
    protected String password;
    protected String userType;

   public boolean authenticateUser(String username, String password, String userType) {
        // Read user information from the text file
        try (BufferedReader br = new BufferedReader(new FileReader("Login_Info.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userInfo = line.split(",");
                if (username.equals(userInfo[0].trim()) && password.equals(userInfo[1].trim())
                        && userType.equals(userInfo[2].trim())) {
                    return true; // Authentication successful
                }
            }
        } catch (IOException e) {
        }
        return false; // Authentication failed
    }

   public void setUserScene(String type, ActionEvent event) throws IOException {
        Parent root;
        switch (type) {
            case "Beneficiary":
                root = FXMLLoader.load(getClass().getResource("BeneficiaryDashboardScene.fxml"));
                break;
            case "Government official":
                root = FXMLLoader.load(getClass().getResource("GovernmentOfficers.fxml"));
                break;
            case "Researcher":
                root = FXMLLoader.load(getClass().getResource("Researcher.fxml"));
                break;
            case "Journalist":
                root = FXMLLoader.load(getClass().getResource("Jurnalist.fxml"));
                break;
            case "Legal Advisor":
                root = FXMLLoader.load(getClass().getResource(""));
                break;
                case "Financial Analyst":
                root = FXMLLoader.load(getClass().getResource(""));
                break;
                case "Subscriber":
                root = FXMLLoader.load(getClass().getResource(""));
                break;
                case"CEO":
                    root = FXMLLoader.load(getClass().getResource(""));
                break;
                    
            default:
                throw new IOException("Invalid user type");
        }
        Scene scene2 = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();   
        
    }

    public void login(String user, String password, String uType, ActionEvent event) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        File f = null;
        BufferedReader br = null;

        try {
            f = new File("Login_Info.txt");
            if (!f.exists()) {
                a.setTitle("Login Issue");
                a.setHeaderText("Issue found");
                a.setContentText("The login information file is not present!");
                a.showAndWait();
            } else {
                br = new BufferedReader(new FileReader(f));
                String line;
                boolean loggedIn = false;

                while ((line = br.readLine()) != null) {
                    String[] userInfo = line.split(",");
                    if (user.equals(userInfo[0].trim()) && password.equals(userInfo[1].trim())
                            && uType.equals(userInfo[2].trim())) {
                        loggedIn = true;
                        setUserScene(uType, event);
                        // Added this line to close the BufferedReader
                        br.close();
                        break;
                    }
                }

                if (!loggedIn) {
                    a.setTitle("Login Issue");
                    a.setHeaderText("Invalid login");
                    a.setContentText("Invalid login credentials, please try again!");
                    a.showAndWait();
                }
            }
        } catch (IOException e) {
        }
    }

    
}
