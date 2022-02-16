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
public class ConvertChars {
    public static void main(String[] args) {
        int value;
        char up;
        char userInput = JOptionPane.showInputDialog("enter a character").charAt(0);
        
        while(Character.isLetterOrDigit(userInput)){
            userInput = JOptionPane.showInputDialog("enter a character").charAt(0);
            
            if(Character.isLetter(userInput)){
                up = Character.toUpperCase(userInput);
                System.out.println(up);
            }
            else if(Character.isDigit(userInput)){
                int num = (int)userInput;
                double square = Math.sqrt(num);
                System.out.println(square);
            }
            else if(Character.isWhitespace(userInput)){
                value = Character.getNumericValue(userInput);
                System.out.println(value);
                
            }
            
            
        }
        
    }
    
}
