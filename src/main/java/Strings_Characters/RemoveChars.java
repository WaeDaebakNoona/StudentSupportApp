/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings_Characters;

import javax.swing.JOptionPane;

/**
 *
 * @author Naritaa
 */
public class RemoveChars {
    public static void main(String[] args) {
        
        
        String userInputWant = JOptionPane.showInputDialog("Enter a string");
        String userInputUnwant = JOptionPane.showInputDialog("Enter unwanted characters");
        
        String output = "";
        
        for(int i = 0; i< userInputWant.length(); i++){
            char currentLetter = userInputWant.charAt(i);
            
            if(userInputUnwant.contains(currentLetter+"")){
                
                output += currentLetter;
            }
      
        }
        
        System.out.println(output);
    }
    
}
