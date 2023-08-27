/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package finaloopproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usnot
 */
public class PublishArticalController implements Initializable {

    @FXML
    private TextField articalID;
    @FXML
    private TextField articaltitlefxid;
    @FXML
    private TextField descriptionfxid;
    @FXML
    private TableView<Article> ArticalViewTable;
    @FXML
    private TableColumn<Article, String> Articalidcolumn;
    @FXML
    private TableColumn<Article, String> articaltitleColumn;
    @FXML
    private TableColumn<Article, String> descriptioncolumn;
    private ObservableList<Article>atlist;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            Articalidcolumn.setCellValueFactory(new PropertyValueFactory<Article, String>("articalId"));
        articaltitleColumn.setCellValueFactory(new PropertyValueFactory<Article, String>("articaltitle"));
        descriptioncolumn.setCellValueFactory(new PropertyValueFactory<Article, String>("description"));  
        
       
      

    

        
    }    

    @FXML
    private void publishArticalONaction(ActionEvent event) {
        
        
    String ID = articalID.getText();
    String title=articaltitlefxid.getText();
    String description=descriptionfxid.getText();
    boolean addStatus = Journalist.addArtical(ID, title, description);
    
    if (addStatus) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("New content is added successfully.");
        a.showAndWait();
    } else {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText("Oops! Something went wrong. Try later...");
        a.showAndWait();
    }
    }

    @FXML
    private void backbuttonOnActiono(ActionEvent event) throws IOException {
        
       Parent scene2Parent = FXMLLoader.load(getClass().getResource("Jurnalist.fxml"));//here switching scene fxml should be attached
Scene scene2 = new Scene(scene2Parent);
Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
stg2.setScene(scene2);
stg2.show();
    }

    @FXML
    private void showArticaleONtable(ActionEvent event) {
        
         List<Article> contentList = Journalist.readArticle();
    ObservableList<Article> conlist = FXCollections.observableArrayList(contentList);
    ArticalViewTable.setItems(conlist);
    }
    
}
