/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Naritaa
 */
public class Oldest {
    public static void main(String[] args) {
       // I can see you
       
        String userInput = JOptionPane.showInputDialog("input boys' names and ages");
        
        Scanner sc = new Scanner(userInput);
        String oldestName = "";
        int oldestAge = 0;
        
        int intAge = sc.nextInt();
        
        while(!userInput.equals("stop")){
            
           
            userInput = JOptionPane.showInputDialog("input boys' names and ages");
            
        }
    }
    
}
