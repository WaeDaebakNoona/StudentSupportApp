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
//question 3 scanners practice test
//done
public class ExtractDomain {
    public static void main(String[] args) {
        
        try {
            String fileName = "data//websites.txt";
            File f = new File(fileName);
            Scanner fileScan = new Scanner(f);
            
            int count = 0;
            while(fileScan.hasNext()){
                String line = fileScan.nextLine();
                Scanner lineSc = new Scanner(line);
                String token = lineSc.next();
                String domain = lineSc.next();
                count++;
                System.out.println("Domain " + count + ": "+ domain);
               
            }
            
            System.out.println("Websites processed: " + count);
            fileScan.close();
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExtractDomain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
