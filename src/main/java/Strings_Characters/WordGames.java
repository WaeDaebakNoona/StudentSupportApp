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
public class WordGames {
    public static void main(String[] args) {
        
        String userInput1 = JOptionPane.showInputDialog("Input a word");
        String userInput2 = JOptionPane.showInputDialog("Input a word");
        
        int firstLetter = userInput1.charAt(0);
        int lastLetter = userInput2.length()-1;
        
        int point = 0;
        
        while(firstLetter == lastLetter){
            
            firstLetter = userInput1.charAt(0);
            lastLetter = userInput2.length() - 1;
            
            if(firstLetter == lastLetter){
                point++ ;  
            }
            userInput1 = JOptionPane.showInputDialog("Input a word");
        }
        System.out.println("POINTS: " + point);
    }
    
}
