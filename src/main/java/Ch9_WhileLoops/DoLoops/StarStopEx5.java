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
//sounds like an ID10T error

public class StarStopEx5 {
    public static void main(String [] args){
    
        int count = 0;
        
        String userInput = JOptionPane.showInputDialog("Enter a character");
        
        while( !(userInput.equals("*")) ){
            count = count + 1;
        userInput = JOptionPane.showInputDialog("Enter a character");  
        
        }
        System.out.println("Count: " + count);
    
    }
}
