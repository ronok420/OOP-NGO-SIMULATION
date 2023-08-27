//

package finaloopproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usnot
 */
public class BlogController implements Initializable {

    @FXML
    private TextArea blogpostTextField;
    
    @FXML
    private TableView<Blog> blogpostTableview;
    
    @FXML
    private TableColumn<Blog, String> detailscolumn;
    
    @FXML
    private TableColumn<Blog, LocalDate> datecolumn;
    
    private ObservableList<Blog> bloglist;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        detailscolumn.setCellValueFactory(new PropertyValueFactory<>("blogContent"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        loadProjectData();
        blogpostTableview.setItems(bloglist);
    }    
    
    private void loadProjectData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("blog.bin"))) {
            bloglist = FXCollections.observableArrayList((List<Blog>) ois.readObject());
        } catch (Exception e) {
            e.printStackTrace();
            // Consider adding a dialog or other visual feedback here
        }
    }

    @FXML
    private void backbuttonONACtion(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Researcher.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void downloadReportOnClick(ActionEvent event) {
        // Implementation for downloading the report
    }
    
}










