/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch9_WhileLoops.DoLoops;

import javax.swing.JOptionPane;

/**
 *
 * @author NaritaA
 */
public class ThreeLetterWordsEx5 {
    public static void main (String [] args){
        
        
       
        
        int num = 0;
        
        while(num < 5){ 
            String userInput = JOptionPane.showInputDialog("Enter five 3-letter word");
            int wordLength = userInput.length();
            
            if(wordLength == 3){
                System.out.println("\t" + userInput);
                userInput = JOptionPane.showInputDialog("Enter five 3-letter word");
                wordLength = userInput.length();
                            }
            
            num++;
        }
    
    }
    
}
