/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaloopproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KING
 */
public class Researcher extends User {
                
    static List<Project> pros = new ArrayList<>();
    static List<Blog> blogs = new ArrayList<>();
   public static boolean addProject(String projectid, String projectname, String aboutproject, LocalDate date) {
        try {
            Project pro = new Project();
            pro.setProjectid(projectid);
            pro.setProjectname(projectname);
            pro.setAboutproject(aboutproject);
            pro.setDate(date);
            pros.add(pro);

            // Serialize and save to file
            try (FileOutputStream fos = new FileOutputStream("Project.bin");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(pros);
            }

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

   public static boolean addBlogs(String blogContent, LocalDate date) {
        try {
            Blog pro = new Blog();
           pro.setBlogContent(blogContent);
           pro.setDate(date);
            blogs.add(pro);

            // Serialize and save to file
            try (FileOutputStream fos = new FileOutputStream("blog.bin");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(pros);
            }

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


  
}
    
    
    
    
    
    

