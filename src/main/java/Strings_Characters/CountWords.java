/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings_Characters;

import javax.swing.JOptionPane;

/**
 *
 * @author NaritaA
 */
public class CountWords {
    public static void main(String[] args) {
        
        String userInput = JOptionPane.showInputDialog("Input a word");
        
        int count = 1;
        
        while(!userInput.equals("stop")){
            
            userInput = JOptionPane.showInputDialog("Input a word");
            count++;    
        }
        System.out.println("total words entered: " + count);
    }
}
