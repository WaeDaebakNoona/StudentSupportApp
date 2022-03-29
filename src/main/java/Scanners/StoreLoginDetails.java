/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Naritaa
 */
//question 4
//done
public class StoreLoginDetails {
    public static void main(String[] args) {
        FileWriter file = null;
        try {
            String filePath = "data//LoginDetails.txt";
            file = new FileWriter(filePath, true);
            
            String name = JOptionPane.showInputDialog("Enter username");
            String password = JOptionPane.showInputDialog("Enter password");
            
            while(!name.equals("STOP")){
                PrintWriter pw = new PrintWriter(file);
                pw.println(name + "#" + password);
                name = JOptionPane.showInputDialog("Enter username");
                password = JOptionPane.showInputDialog("Enter password");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(StoreLoginDetails.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(StoreLoginDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
