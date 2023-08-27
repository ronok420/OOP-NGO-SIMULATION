/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaloopproject;

import java.io.Serializable;

/**
 *
 * @author KING
 */
public class Article implements Serializable {
    
    
    String articalId;
    String articaltitle;
    String description;

    public Article() {
    }

    public Article(String articalId, String articaltitle, String description) {
        this.articalId = articalId;
        this.articaltitle = articaltitle;
        this.description = description;
    }

    public String getArticalId() {
        return articalId;
    }

    public void setArticalId(String articalId) {
        this.articalId = articalId;
    }

    public String getArticaltitle() {
        return articaltitle;
    }

    public void setArticaltitle(String articaltitle) {
        this.articaltitle = articaltitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
        
    
    
    
}
       


//I am  giving  the of three file here which is related.I want to show data   in the table view and also want to remove it.  now   you need see what probleme   here , 
//and the give the exact specific portion of code need to raplace   in these files  ok understood?
//here is  mu Article.java file   
//  here is my EditArticleController.java file 
// and here is Journalist.java   file                                   