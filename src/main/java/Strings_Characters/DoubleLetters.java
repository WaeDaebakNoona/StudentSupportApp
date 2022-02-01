/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings_Characters;

import javax.swing.JOptionPane;

/**
 *
 * @author Narita
 */
public class DoubleLetters {
    public static void main(String[] args) {
        
        String userInput = JOptionPane.showInputDialog("Input a word");
        
        char previousLetter = userInput.charAt(0);
        String output = "" + previousLetter;
        
        for(int i = 0; i < userInput.length();i++){
            
            char currentLetter = userInput.charAt(i);
            
            if(currentLetter != previousLetter){
                output += currentLetter;
            }
           previousLetter = currentLetter;
        }
        System.out.println(output);
       
       
        
    }
}
