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
public class Scannerdelimeters {
    public static void main(String[] args) {
        
        try {
            String filepath = "data//Information.txt";
            File f = new File(filepath);
            Scanner fileSc = new Scanner(f);
            
            
            while(fileSc.hasNext()){
                
                //scans/picks line individualy
                
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                
                String firstName = lineSc.next();
                String lName = lineSc.next();
                int age = lineSc.nextInt();
                String sport = lineSc.next();
                String sportPos = lineSc.next();
                
                //processing
                //
                System.out.println(firstName + " " + lName+ " " + age+ " " + sport + " " + sportPos );
                
            }
            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Scannerdelimeters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
