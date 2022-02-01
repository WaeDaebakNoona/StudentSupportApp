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
public class EncodeWord {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Input a word");
        
        int len = userInput.length();
        for(int i = 0; i<len; i++){
            int ch = userInput.charAt(i) + 1;
            System.out.print( (char)ch + "");
        }
    }
    
}
