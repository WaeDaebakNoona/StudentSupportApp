package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    
    private static String filepathy = "data\\books.txt";
    
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
            fileSc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return output;        
    }
    public static void addBook(String title,String author){
        try {
            FileWriter fw = new FileWriter(filepathy,true);
             PrintWriter pw = new PrintWriter(fw) ;
             
                pw.println(title + "#" + author);
                
                pw.close();  
        } catch (IOException ex) {
            System.out.println("File not found");
        }
            
    }
    //do delete book method toooooo
//    public static void deleteBook(String title,String author){
//        try {
//            FileWriter fw = new FileWriter(filepathy,true);
//             PrintWriter pw = new PrintWriter(fw) ;
//             
//                pw.println();
//                
//                pw.close();  
//        } catch (IOException ex) {
//            System.out.println("File not found");
//        }
//            
//    }
    
   
}
