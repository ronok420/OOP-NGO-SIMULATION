/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaloopproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KING
 */
public class Journalist extends User{
    
        static List<Article> articles = new ArrayList<>();
//        List<Article> articles = new ArrayList<>();


    public static boolean addArtical(String articalId, String articaltitle, String description) {
        try {
            Article article = new Article();
            article.setArticalId(articalId);
            article.setArticaltitle(articaltitle);
            article.setDescription(description);
            
            articles.add(article);

            // Serialize and save to file
            try (FileOutputStream fos = new FileOutputStream("Article.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(articles);
            }

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static List<Article> readArticle() {
        List<Article> ratingList = new ArrayList<>();
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Article.bin"))) {
            ratingList = (List<Article>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ratingList;
    }
    
}
