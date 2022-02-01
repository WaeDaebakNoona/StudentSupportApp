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
public class EncodeWordThreeLetters {
    public static void main(String[] args) {
        
        //user enters a word
        String userInput = JOptionPane.showInputDialog("Enter a word");
        //change string to uppercase
        String up = userInput.toUpperCase();
        
        int wordLength = up.length();
        //if word > 3
        if(wordLength > 3){
            char a = up.charAt(0);
            char b = up.charAt(1);
            char c = up.charAt(2);
            
            String sub = up.substring(2, wordLength);
            
            System.out.println(sub + a + b + c + "");
            //dont know next part
            
        }
        else{
            String output = "";
            for(int i = 0; i<=wordLength - 1; i++){
               output = output + up.charAt(i);
            }
            System.out.println(output);
        }
    }
    
}
