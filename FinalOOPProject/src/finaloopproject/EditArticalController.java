/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package finaloopproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author KING
 */
public class EditArticalController implements Initializable {

    @FXML
    private TableColumn<Article, String> articalidcolumn;
    @FXML
    private TableColumn<Article, String> articaltitlecolumn;
    @FXML
    private TableColumn<Article, String> descriptioncolumn;
    @FXML
    private TableView<Article> articaltable;
      private ObservableList<Article>atlist;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          articalidcolumn.setCellValueFactory(new PropertyValueFactory<Article, String>("articalId"));
        articaltitlecolumn.setCellValueFactory(new PropertyValueFactory<Article, String>("articaltitle"));
        descriptioncolumn.setCellValueFactory(new PropertyValueFactory<Article, String>("description"));  
        
       
      

    
try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Article.bin"))) {
            atlist = FXCollections.observableArrayList((List<Article>) ois.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set ObservableList to TableView
        articaltable.setItems(atlist);
    }    


@FXML
private void removeArticaOnaction(ActionEvent event) {
    Article selectedContent = articaltable.getSelectionModel().getSelectedItem();
    if (selectedContent != null) {
        // Remove from TableView
        atlist.remove(selectedContent);

        // Update Article.bin file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Article.bin"))) {
            oos.writeObject(new ArrayList<>(atlist));
        } catch (Exception e) {
            System.out.println("An error occurred while updating the file: " + e.getMessage());
        }
    } else {
        System.out.println("No article selected.");
    }
}


    @FXML
    private void backbuttonOnaction(ActionEvent event) throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Journalist.fxml"));//here switching scene fxml should be attached
  Scene scene2 = new Scene(scene2Parent);
   Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
  stg2.setScene(scene2);
   stg2.show();
    }

    
}
