/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Naritaa
 */
public class PrintwritersNScanners {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String filepath = "data//printwriter.txt";
        FileWriter file = new FileWriter(filepath,true);
        PrintWriter printW = new PrintWriter(file);
        
        String input = JOptionPane.showInputDialog("Enter a string; STOP to exit");
        
        while(!input.equals("STOP")){
            printW.println(input);
            input = JOptionPane.showInputDialog("Enter a string; STOP to exit");
        }
        printW.close();
    }
}

