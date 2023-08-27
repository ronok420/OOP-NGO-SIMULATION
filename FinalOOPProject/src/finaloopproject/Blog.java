/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaloopproject;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Logger;

/**
 *
 * @author KING
 */
public class Blog implements Serializable{
 
    private String blogContent;
    private LocalDate date;
   

    public Blog(String blogContent, LocalDate date) {
        this.blogContent = blogContent;
        this.date = date;
    }

    public Blog() {
    }
      
    
    
    // Getters and setters for the fields
    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

 
   


}
