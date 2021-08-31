
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naritaa
 */
public class BookManager {
    
    private static String filepathy = "C:\\Users\\NaritaA\\Documents\\NetBeansProjects\\SchoolPractical\\SchoolPractical\\src\\books.txt";
    
    public static String getBook(){
         String output = "";
        try {
           
            
            File file = new File(filepathy);
            Scanner fileSc = new Scanner(file);
            
            while(fileSc.hasNextLine()){
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String book = lineSc.next();
                String name = lineSc.next();
                output += "BOOK: " + book + "\t" + "AUTHOR: " + name + "\n";
            
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return output;        
    }
     public static String getAuthor(){
         String output = "";
        try {
           
            
            File file = new File(filepathy);
            Scanner fileSc = new Scanner(file);
            
            while(fileSc.hasNextLine()){
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String book = lineSc.next();
                String name = lineSc.next();
                output += name + "\n";
            
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return output;        
    }
    
}
