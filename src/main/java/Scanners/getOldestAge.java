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
public class getOldestAge {
    public static void main(String[] args) {
        
        try {
            String fileName = "data//ages.txt ";
            File f = new File(fileName);
            Scanner sc = new Scanner(f);
            
            
            int oldestAge = 0;
            
            while(sc.hasNext()){
                int age = sc.nextInt();
                
                if(age > oldestAge){
                    oldestAge = age;
                }      
            }
            System.out.println("oldest age: " + oldestAge);
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadNames.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
