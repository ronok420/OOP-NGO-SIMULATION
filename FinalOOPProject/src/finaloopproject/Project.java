/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaloopproject;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author KING
 */
public class Project implements Serializable {
    
    String projectid;
    String projectname;
    String aboutproject;
    LocalDate date;

    public Project(String projectid, String projectname, String aboutproject, LocalDate date) {
        this.projectid = projectid;
        this.projectname = projectname;
        this.aboutproject = aboutproject;
        this.date = date;
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public Project() {
    }

    public String getAboutproject() {
        return aboutproject;
    }

    public void setAboutproject(String aboutproject) {
        this.aboutproject = aboutproject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

  
    
    
    
}
