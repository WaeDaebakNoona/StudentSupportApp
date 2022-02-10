/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naritaa
 */
public class ReadNames2 {
    public static void main(String[] args) {
       
        try {
            String fileName = "data//Names.txt";
            File f = new File(fileName);
            Scanner sc = new Scanner(f);
            
            while(sc.hasNext()){
                String name = sc.next();
                char first = name.charAt(0);
                int lastInt = name.lastIndexOf(" ");
                char last =name.charAt(lastInt);
                System.out.println( first + last + "");
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadNames2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
