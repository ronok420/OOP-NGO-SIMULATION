/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaloopproject;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class SceneLoader {
    Stage newStage = new Stage();
    
    public void sceneLoader(String fxmlFileName){
        try{
            Parent root=FXMLLoader.load(getClass().getResource(fxmlFileName));
            Scene newScene=new Scene(root);
            newStage.setScene(newScene);
            newStage.show();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public Node getSceneRoot(String fxmlFileName){
        try{
            Parent root= FXMLLoader.load(getClass().getResource(fxmlFileName));
            return root;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
}
