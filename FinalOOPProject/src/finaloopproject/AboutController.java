/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package finaloopproject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usnot
 */
public class AboutController implements Initializable {

    @FXML
    private TextArea statementTextField;
    @FXML
    private TextArea historyTextfield;
    @FXML
    private TableView<Project> tableview;
    @FXML
    private TableColumn<Project, String> projectnamecolumn;
    @FXML
    private TableColumn<Project, String> datecolumn;
    @FXML
    private TableColumn<Project, LocalDate> aboutColumn;
    @FXML
    private TextField ststementfxid;
    @FXML
    private TextField historyfxid;
    @FXML
    private TableColumn<Project, String> numbercolumn;
private ObservableList<Project>prolist;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
         loadTextFromFile("statement.txt", statementTextField);
        loadTextFromFile("history.txt", historyTextfield);
        
       numbercolumn.setCellValueFactory(new PropertyValueFactory<>("projectid"));
        projectnamecolumn.setCellValueFactory(new PropertyValueFactory<>("projectname"));
        aboutColumn.setCellValueFactory(new PropertyValueFactory<>("aboutproject"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));

       

//try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Project.bin"))) {
//            prolist = FXCollections.observableArrayList((List<Project>) ois.readObject());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Set ObservableList to TableView
//        tableview.setItems(prolist);

                loadProjectData();

        // Set ObservableList to TableView
        tableview.setItems(prolist);

    }    
      private void loadProjectData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Project.bin"))) {
            prolist = FXCollections.observableArrayList((List<Project>) ois.readObject());
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions as needed
        }
    }
    
           


    @FXML
    private void backbuttonOnclick(ActionEvent event) throws IOException {
        
          Parent scene2Parent = FXMLLoader.load(getClass().getResource("Researcher.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }

    @FXML
    private void statementOnclick(ActionEvent event) {
        
             File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
       
        try {
            
            f = new File("statement.txt");  
            
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	ststementfxid.getText()+","
               
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
    

    @FXML
    private void historybuttonOnclick(ActionEvent event) {
                  File f=null;     
        FileWriter fw = null;
        FileChooser fc = null;
       
        try {
            
          f = new File("history.txt");  
            
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	historyfxid.getText()+","
               
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    

     private void loadTextFromFile(String filePath, TextArea textField) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder contentBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }

            String content = contentBuilder.toString();
            textField.setText(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
